package com.example.springboots.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import com.example.springboots.Entities.classEntities;
import com.example.springboots.RepositoryLayer.classRepository;

@SpringBootTest

public class ownquerytest {

	@Autowired
	classRepository re;
	
	classEntities cs = new classEntities();
		
	@Test                                     // INSERT
	void insert() {
		cs.setAnnualIncome(50000);
		cs.setDepartment("ece");
		cs.setName("praveen kumar");
		cs.setPhone(1234567890L);
		
		re.insert(cs.getAnnualIncome(),cs.getDepartment(),cs.getName(),cs.getPhone());
	}
	
	
	@Test                                   //SELECT
	void select() {
		cs.setId(7);
		classEntities o = re.select(cs.getId());
		System.out.println(o);
	}
	
	
	@Test                                      //UPDATE
	void update() {
		cs.setId(7);
		cs.setAnnualIncome(50000);
		cs.setDepartment("ece");
		cs.setName("karthik");
		cs.setPhone(1234567890L);
		cs.setId(7);
		
		re.update(cs.getAnnualIncome(),cs.getDepartment(),cs.getName(),cs.getPhone(),cs.getId());
		
	}
	
	
	@Test                                         //DELETE
	void delete() {
		cs.setId(8);
		re.delete(cs.getId());
	}
	
	
	
	
	
	
}
