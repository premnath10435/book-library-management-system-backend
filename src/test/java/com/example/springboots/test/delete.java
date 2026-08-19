package com.example.springboots.test;

import org.junit.jupiter.api.Test;//TEST Annotaion
import org.springframework.beans.factory.annotation.Autowired;// obj create
import org.springframework.boot.test.context.SpringBootTest;// spring boot ha background la run panu
import com.example.springboots.Entities.classEntities;
import com.example.springboots.RepositoryLayer.classRepository;

@SpringBootTest
public class delete {
	
	@Autowired
	classRepository re;
	
	
	classEntities ce= new classEntities();
	
	@Test
	void delete() {
	re.deleteById(5);
	
	}
	
}


