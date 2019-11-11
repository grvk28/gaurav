package com.gaurav;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gaurav.dao.Cartdao;
import com.gaurav.dao.R_typedao;
import com.gaurav.dao.Stockdao;
import com.gaurav.dao.Userdao;
import com.gaurav.model.Cart;
import com.gaurav.model.Category;
import com.gaurav.model.Ccart;
import com.gaurav.model.Customer;
import com.gaurav.model.Employee;
import com.gaurav.model.Items;
import com.gaurav.model.User;
import com.gaurav.model.R_type;
import com.gaurav.model.Stock;

@Controller
public class LoginController {

	@Autowired
	public Userdao userdao;
	@Autowired
	public  R_typedao r_typedao;
	@Autowired
	public Cartdao cartdao;
	@Autowired
	public Stockdao stockdao;
	@Autowire 
	public Employee employeedao;
	
	@RequestMapping(value="admin/addstock", method = RequestMethod.GET)
	public String addrock(Model model)
	{
		model.addAttribute("stock",new Stock());
		return "admin/addstock";
	}
	
	@RequestMapping(value="admin/addstock",method=RequestMethod.POST)
	public String addstockpost(@Valid @ModelAttribute("stock") Stock stock,BindingResult result,Model model) {
		
		stockdao.addtostock(stock);
		
		return "redirect:/admin";
		
	}
	
	@RequestMapping("admin/allstock")
	public String allrock(Model model)
	{
		List<Stock> list=stockdao.getstock();
		model.addAttribute("list",list);
		return "admin/allstock";
	}
	
	@RequestMapping("/admin/delstock/{id}")
	public String delstock(Model model,@PathVariable(value="id") int id)
	{
		stockdao.deletestockbyid(id);
		List<Stock> list=stockdao.getstock();
		model.addAttribute("list",list);
		return "admin/allstock";
	}
	
	
	
	@RequestMapping(value = "/home")
	public String welcome(Model model) {
		model.addAttribute("name", "Home Page");
		model.addAttribute("description", "Page yet to be completed!");
		return "home";
	}

	@RequestMapping("/admin")
	public String admin(Model model, Principal principal) {

		String loggedInUserName = principal.getName();
		model.addAttribute("user", loggedInUserName);
		model.addAttribute("name", "Spring Security Custom Login Demo");
		model.addAttribute("description", "Protected page !");
		return "admin";
	}
	@RequestMapping("/user")
	public String userhjgjh(Model model, Principal principal) {

		String loggedInUserName = principal.getName();
		model.addAttribute("user", loggedInUserName);
		model.addAttribute("name", "Spring Security USER Custom Login Demo");
		model.addAttribute("description", "Protected page for user !");
		List<com.gaurav.model.R_type> list= r_typedao.gettypes();
		model.addAttribute("list",list);
		return "user";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {

		return "login";

	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
//		model.addAttribute("message",
//				"You have successfully logged off from application !");
		return "login";

	}

	@RequestMapping(value = "/loginError", method = RequestMethod.GET)
	public String loginError(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";

	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(Model model) {
		
		User user = new User();
		model.addAttribute("user", user);

		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String registerProcess(@Valid @ModelAttribute("user") User user,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "register";
		}
		else {
			if(!user.getPassword().equals(user.getMpassword())) {
				model.addAttribute("error","passwords dont match");
				return "register";
			}
			if(userdao.getUser(user.getUsername())!=null) {
				model.addAttribute("error", "username exists");
				return "register";
			}
			userdao.saveOrUpdate(user);
			return "login";
		}
	}
	
	@RequestMapping(value="/user/products")
	public String checker(Model model,Principal principal) {
		String user = principal.getName();
		model.addAttribute("user",user);
		model.addAttribute("product","product");
		return "product";
	}
	
	@RequestMapping(value="/user/{catcid}")
	public String getitems(@PathVariable(value="catcid") int catcid,Model model,HttpServletRequest request) 
	{
		List<com.gaurav.model.R_type> list= r_typedao.getavailable(catcid);
		model.addAttribute("list",list);
		List<R_type> list1=r_typedao.getitembycat(catcid);
		model.addAttribute("list1",list1);
		model.addAttribute("catcid",catcid);
		model.addAttribute("customer",new Customer());
		return "book";
	}
	
	
}
