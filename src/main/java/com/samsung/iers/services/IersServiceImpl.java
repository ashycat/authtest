package com.samsung.iers.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.samsung.iers.jobs.dao.IersDAO;


@Service("iersService")
public class IersServiceImpl implements IersService {

	Logger log = Logger.getLogger(this.getClass());
	
	@Resource (name = "IersDAO")
	private IersDAO iersdao;
	
	@Override
	public List<Map<String, Object>> excuteSelect(Map<String, Object> returnMap, String query) {
		// TODO Auto-generated method stub
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		list = iersdao.excuteSelectQuery(returnMap, query);
	
		return list;
		
	}

}
