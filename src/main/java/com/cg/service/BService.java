package com.cg.service;

import com.cg.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BService {
	@Autowired
	private DataMapper dataMapper;
	
	public void insertB(String data){
		dataMapper.insert("B1-"+data);
		dataMapper.insert("B2-"+data);
	}
}
