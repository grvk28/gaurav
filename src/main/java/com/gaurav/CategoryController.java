package com.gaurav;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gaurav.dao.Categorydao;
import com.gaurav.dao.Employeedao;
import com.gaurav.model.Category;
import com.gaurav.model.Employee;
import com.gaurav.model.Item;
import com.gaurav.model.Location;
import com.gaurav.model.Stock;
import com.gaurav.model.User;

@Controller
public class CategoryController {
	@Autowired
	Categorydao categorydao;
	@Autowired
	Employeedao employeedao;
	
	@RequestMapping("allcat")
	public String category(Model model)
	{
		List<Category> list=categorydao.getallcat();
		model.addAttribute("list",list);
		return "category";
	}
	@RequestMapping("admin/allusers")
	public String allusers(Model model)
	{
		List<User> list=categorydao.getallusers();
		model.addAttribute("list",list);
		return "admin/alluser";
	}
	
	

	@RequestMapping("admin/allemp")
	public String allemp(Model model)
	{
        List<Employee> list=employeedao.getemployee();
        model.addAttribute("list",list);
		return "admin/allemp";
	}
	
	@RequestMapping("/admin/delemp/{empid}")
	public String delemp(Model model,@PathVariable(value="empid") int id)
	{
		employeedao.deleteempbyid(id);
		List<Employee> list=employeedao.getemployee();
        model.addAttribute("list",list);
		return "admin/allemp";
	}
	
	
	
	@RequestMapping(value="admin/addemp", method = RequestMethod.GET)
	public String addrock(Model model)
	{
		model.addAttribute("employee",new Employee());
		return "admin/addemp";
	}
	
	@RequestMapping(value="admin/addemp",method=RequestMethod.POST)
	public String addstockpost(@Valid @ModelAttribute("employee") Employee employee,BindingResult result,Model model,Principal principal) {
		
		employeedao.addtoemp(employee);
		
		return "redirect:/admin";
		
	}
	
	

	
	
	
	
	@RequestMapping("admin/allcat")
	public String categoryadmin(Model model)
	{
		List<Category> list=categorydao.getallcat();
		model.addAttribute("list",list);
		return "admin/admincategory";
	}
	@RequestMapping(value="admin/addcat",method=RequestMethod.GET)
	public String addcat(Model model)
	{
		Category category=new Category();
		model.addAttribute("category",category);
		return "admin/addcategory";
	}
	@RequestMapping(value="admin/addcat",method=RequestMethod.POST)
	public String addItem(@Valid @ModelAttribute("Category") Category category,BindingResult result,Model model) 
	{
		if(result.hasErrors())
		{
			model.addAttribute("category",category);
			return "admin/addcategory";
		}
		else {
			categorydao.addCat(category);
			return "redirect:/admin";
		}
	}

}
