package com.gaurav;


import com.gaurav.dao.Categorydao;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gaurav.dao.Billdao;
import com.gaurav.model.Items;
import com.gaurav.model.Bill;
import com.gaurav.model.Category;
@Controller
public class BillController {
	@Autowired
	Billdao Billdao;
	@Autowired
	Categorydao categorydao;
	@RequestMapping(value="buyitem/addtoBill/{iid}",method=RequestMethod.GET)
	public String addtoBill(Model model,@PathVariable(value="iid") int iid,HttpServletRequest request) 
	{
		String uid=request.getUserPrincipal().getName();
		Bill Bill=new Bill();
		Billdao.addtoBill(iid, uid, Bill);
		return "redirect:/bill";
	}
	@RequestMapping(value="buyitem/Bill")
	public String showBill(Model model,HttpServletRequest request)
	{
		String uid=request.getUserPrincipal().getName();
		List<Bill> list=Billdao.getBill(uid);
		Float total=Billdao.gettotal(uid);
		model.addAttribute("list", list);
		model.addAttribute("total",total);
		return "bill";
	}
	
	

}
