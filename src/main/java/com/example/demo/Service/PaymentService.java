package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.PaymentModel;
import com.example.demo.Repository.PaymentRepo;
@Service
public class PaymentService {
	@Autowired //extends another class
	PaymentRepo pRepo; //reference variable
	
	public PaymentModel saveDetails(PaymentModel p) {
		return pRepo.save(p);
	}
	public List <PaymentModel>getDetails()

{
		return pRepo.findAll();
		
}
	public PaymentModel UpdateDetails(PaymentModel pms)
	{
		return pRepo.saveAndFlush(pms);
	}
	
	public void deletePay (int id)
	{		
	
	    pRepo.deleteById(id);	
	
	}
}


