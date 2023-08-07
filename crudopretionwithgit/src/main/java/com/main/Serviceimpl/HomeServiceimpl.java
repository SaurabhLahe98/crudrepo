package com.main.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Entity.Student5;
import com.main.Repo.HomeRepo;
import com.main.Service.HomeService;

@Service
public class HomeServiceimpl implements HomeService{

	@Autowired
	HomeRepo hr;
	
	@Override
	public void saveData(Student5 s) {
		hr.save(s);
		
	}

}
