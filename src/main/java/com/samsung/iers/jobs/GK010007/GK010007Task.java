package com.samsung.iers.jobs.GK010007;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.samsung.iers.services.IersService;

public class GK010007Task {

	@Resource(name="iersService")
	private IersService isv;

	public void excuteBatch() {
		System.out.println("batch 프로그램!!");
		
//		Map<String, Object> returnMap = new HashMap<String, Object>();
//		returnMap = null;
		String query = "GK010007.selectTask";
		
		List<Map<String, Object>> list = isv.excuteSelect(null, query );
		
		GK010007Excel e = new GK010007Excel();
		e.CreateExcel();
		
		System.out.println("list size : "+list.size());
		
	}
	
	
	
}
