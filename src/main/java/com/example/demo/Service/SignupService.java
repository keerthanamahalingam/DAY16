package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.SignupModel;
import com.example.demo.Repository.SignupRepo;
@Service
public class SignupService {
	@Autowired 
	SignupRepo siRepo; 
	
	public SignupModel saveDetails(SignupModel e) {
		return siRepo.save(e);
	}
	public List <SignupModel>getDetails()

{
		return siRepo.findAll();
		
}
	public SignupModel UpdateDetails(SignupModel e1)
	{
		return siRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    siRepo.deleteById(id);	
	
	}
}

