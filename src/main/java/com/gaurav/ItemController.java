package com.gaurav;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gaurav.model.Item;
import com.gaurav.dao.Itemdao;
import com.gaurav.dao.ItemdaoImpl;
@Controller
public class ItemController {
	@Autowired
	Itemdao itemdao;
	@RequestMapping(value="admin/additem",method=RequestMethod.GET)
	public String addItem(Model model) 
	{
		Item item=new Item();
		model.addAttribute("item",item);
		return "admin/addItem";
	}
	@RequestMapping(value="admin/additem",method=RequestMethod.POST)
	public String addItem(@Valid @ModelAttribute("Item") Item item,BindingResult result,Model model) 
	{
		if(result.hasErrors())
		{
			model.addAttribute("item",item);
			return "admin/addItem";
		}
		else {
			itemdao.addItem(item);
			return "redirect:/admin";
		}
	}
	@RequestMapping("items")
	public String allitems(Model model)
	{
		List<Item> list=itemdao.getAllItems();
		model.addAttribute("list",list);
		return "allItems";
	}
	@RequestMapping("admin/items")
	public String allitemsAdmin(Model model)
	{
		List<Item> list=itemdao.getAllItems();
		model.addAttribute("list",list);
		return "admin/allItems";
	}
	@RequestMapping("/admin/deleteitem/{itemId}")
	public String deleteItem(@PathVariable(value="itemId") int itemId)
	{
		itemdao.deleteItem(itemId);
		return "redirect:/admin";
	}
	
}
