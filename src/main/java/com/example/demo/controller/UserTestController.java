package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SpringBoot-MyBatis-Postgres.
 */
@Controller
public class UserTestController {

	/** コンストラクタ. */
	public UserTestController() {

	}

	/**
	 * 初期表示.
	 * 
	 * @return response
	 */
	@RequestMapping("/test")
	public ModelAndView mybatisTestFirstDisplay() {

		ModelAndView viewable = new ModelAndView();
		viewable.setViewName("/demo1");

		return viewable;
	}

	/**
	 * 初期表示.
	 * 
	 * @return response
	 */
	@RequestMapping("/tapsuggestSample")
	public ModelAndView tapsuggestSample() {

		ModelAndView viewable = new ModelAndView();
		viewable.setViewName("/sample/tapsuggest");

		return viewable;
	}
}
