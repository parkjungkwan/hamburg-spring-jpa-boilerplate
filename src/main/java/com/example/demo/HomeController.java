package com.example.demo;

import javax.servlet.http.HttpServletRequest;     
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"ctx","board", "mem", "cmm","prd","adm"})
public class HomeController {
	@Autowired HttpSession session;
	@Autowired HttpServletRequest request;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	 @GetMapping("/")
	    public String index(HttpSession session, HttpServletRequest request) {
	    	String ctx = request.getContextPath();
	    	session.setAttribute("ctx", ctx);
	    	session.setAttribute("board", ctx+"/resources/board");
	    	session.setAttribute("mem", ctx+"/resources/mem");
			session.setAttribute("cmm", ctx+"/resources/cmm");
			session.setAttribute("prd", ctx+"/resources/prd");
			session.setAttribute("adm", ctx+"/resources/adm");
	    	logger.info("메인");
	        return "main";
	    }

	@GetMapping("/move/{dir}/{page}")
	public String move(@PathVariable  String dir,@PathVariable  String page) {
		logger.info("이동경로: "+ dir +"/"+ page);
		return String.format("move:%s/%s", dir,page);
	}
	
	
}
