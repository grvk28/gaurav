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

import com.gaurav.dao.R_typedao;
import com.gaurav.model.Items;
import com.gaurav.model.R_type;
import com.gaurav.model.Category;
@Controller
public class R_typeController {
	@Autowired
	Categorydao categorydao;
	@Autowired 
	R_typedao r_typedao;
	
	
	
	

}
