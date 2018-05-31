package com.samsung.iers.controllers;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samsung.iers.HomeController;
import com.samsung.iers.services.IersService;

@Controller
public class SampleList {

	/**
	 * Handles requests for the application home page.
	 */
	@Resource(name="iersService")
	private IersService isv;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/SampleList.do")
	public ModelAndView sampleList(Locale locale, Model model) {
		logger.info("SampleList");

		String query = "GK010007.selectTask";
		List<Map<String, Object>> list = isv.excuteSelect(null, query );
		ModelAndView mv = new ModelAndView("jsonView");
		mv.addObject("list",list);

		return mv;
	}
}
