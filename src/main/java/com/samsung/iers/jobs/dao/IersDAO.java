package com.samsung.iers.jobs.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.samsung.iers.common.dao.AbstractDAO;


//Knox Portal 파견 미복귀
@Repository("IersDAO")
public class IersDAO extends AbstractDAO {
	
	public List<Map<String, Object>> excuteSelectQuery (Map <String, Object> map, String query) {
		
		System.out.println("============================" + query);
		
		return (List<Map<String, Object>>) selectList (query, null);
	}

	
}
