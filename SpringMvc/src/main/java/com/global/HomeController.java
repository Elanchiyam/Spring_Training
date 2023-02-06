package com.global;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) {
		String message = request.getParameter("t1");
		System.out.println("t1" + message);
		Map<String, String> map = new HashMap<>();
		map.put("message", message);
		ModelAndView mv = new ModelAndView("success",map);
		return mv;
	}
}
