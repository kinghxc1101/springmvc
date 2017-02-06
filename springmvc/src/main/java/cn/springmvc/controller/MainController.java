package cn.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.springmvc.model.Item;
import cn.springmvc.service.BookService;
import cn.springmvc.service.UserService;

@Controller
public class MainController 
{
	@Autowired
	private UserService userService;
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "index")
	public String index() 
	{
		return "index";
	}

	
	@RequestMapping(value="register",method=RequestMethod.POST) 
	public String register(HttpServletRequest res,HttpServletResponse ros
			, @RequestParam(value="nk",required=true) String nk,Model model)
	{
		return "index";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST) 
	public ModelAndView login(HttpServletRequest res,HttpServletResponse ros,@RequestParam(value="name",required=true) String name)
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("a", name);
		mav.setViewName("welcome");
		return mav;
	}
	
	@RequestMapping("onQuery")
	public ModelAndView onQuery()
	{
		ModelAndView mav = new ModelAndView();
		Item item = bookService.onQuery();
		mav.addObject("item",item);
		mav.setViewName("query");
		return mav;
	}
}
