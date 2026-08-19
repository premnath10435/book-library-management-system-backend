package com.example.springboots.test;

import org.junit.jupiter.api.Test;//TEST Annotaion
import org.springframework.beans.factory.annotation.Autowired;// obj create
import org.springframework.boot.test.context.SpringBootTest;// spring boot ha background la run panu
import com.example.springboots.Entities.classEntities;
import com.example.springboots.RepositoryLayer.classRepository;

@SpringBootTest
public class insert {
	
	@Autowired
	classRepository re;
	
	
	classEntities ce= new classEntities();
	
	@Test
	 void insert() {
		ce.setAnnualIncome(7593094);
		ce.setDepartment("ece");
		ce.setName("prem");
		ce.setPhone(2227878778L);
		
		re.save(ce);
	}
	
	classEntities ci = new classEntities();
	@Test
	void inserts() {
		ci.setAnnualIncome(500000);
		ci.setDepartment("M.E");
		ci.setName("sandhiya");
		ci.setPhone(9342069294L);
		
		re.save(ci);
	}
}