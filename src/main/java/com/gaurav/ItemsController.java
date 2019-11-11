package com.gaurav;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gaurav.dao.Itemsdao;
import com.gaurav.model.Category;
import com.gaurav.model.Items;

@Controller
public class ItemsController {
	@Autowired
	Itemsdao itemsdao;
	@RequestMapping("buyitem/{catid}")
	public String getitems(@PathVariable(value="catid") int catid,Model model,HttpServletRequest request) 
	{
		List<Items> list=itemsdao.getitembycat(catid);
		model.addAttribute("list",list);
		return "items";
	}
	
	@RequestMapping(value="admin/adminbuyitem/{catid}")
	public String additems(@PathVariable(value="catid") int catid,Model model,HttpServletRequest request)
	{
		List<Items> list=itemsdao.getitembycat(catid);
		model.addAttribute("list",list);
		model.addAttribute("catid",catid);
		return "admin/adminitems";
	}
	@RequestMapping(value="admin/adminbuyitem/additems/{catid}",method=RequestMethod.GET)
	public String addcat(Model model,@PathVariable(value="catid") int catid)
	{
		Items items=new Items();
		model.addAttribute("items",items);
		model.addAttribute("catid",catid);
		return "admin/additems";
	}
	@RequestMapping(value="admin/adminbuyitem/additems/{catid}",method=RequestMethod.POST)
	public String addItem(@Valid @ModelAttribute("Items") Items items,BindingResult result,Model model,@PathVariable(value="catid") int catid) 
	{
		if(result.hasErrors())
		{
			model.addAttribute("items",items);
			return "admin/additems";
		}
		else {
			itemsdao.addItems(catid, items);
			return "redirect:/admin";
		}
	}
	@RequestMapping("admin/adminbuyitem/deleteitems/{itemId}")
	public String deleteItem(@PathVariable(value="itemId") int itemId)
	{
		itemsdao.deleteItem(itemId);
		return "redirect:/admin";
	}
	
	@RequestMapping(value="/readxml",method=RequestMethod.POST)
	public ModelAndView upload(@RequestParam CommonsMultipartFile file,HttpSession session) {
		String path=session.getServletContext().getRealPath("/");
		String filename=file.getOriginalFilename();
		System.out.println(path+" "+filename);
		try {
			byte barr[]=file.getBytes();
			BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(path+"/"+filename));
			Object o=bout;
			bout.write(barr);
			bout.flush();
			bout.close();
			
		}catch(Exception e) {System.out.println(e);}
		return new ModelAndView("success");
	}

}
