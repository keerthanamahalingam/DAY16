package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.PaymentModel;
public interface PaymentRepo extends JpaRepository<PaymentModel,Integer>{

}

