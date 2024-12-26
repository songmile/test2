package com.cg.service;

import com.cg.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AService {
	
	@Autowired
	private DataMapper dataMapper;
	@Autowired
	private BService bService;
	
	
	public void insertA(String data){
		dataMapper.insert("A-"+data);
		bService.insertB(data);;
	}

}
