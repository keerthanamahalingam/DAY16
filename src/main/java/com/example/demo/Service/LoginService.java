package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoginModel;
import com.example.demo.Repository.LoginRepo;
@Service
public class LoginService {
	@Autowired 
	LoginRepo stRepo; 
	
	public LoginModel saveDetails(LoginModel st) {
		return stRepo.save(st);
	}
	public List <LoginModel>getDetails()    

{
		return stRepo.findAll();
		
}
	public LoginModel UpdateDetails(LoginModel e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteLogin (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}
