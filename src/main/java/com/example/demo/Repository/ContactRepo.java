package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.ContactModel;
public interface ContactRepo extends JpaRepository<ContactModel,Integer>{

}

