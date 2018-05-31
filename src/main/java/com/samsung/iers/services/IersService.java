package com.samsung.iers.services;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface IersService {
	
	@Transactional
	List<Map<String, Object>> excuteSelect (Map<String , Object> returnMap, String query);
	

}
