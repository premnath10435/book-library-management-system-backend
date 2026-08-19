package com.example.springboots.test;

import org.junit.jupiter.api.Test;//TEST Annotaion
import org.springframework.beans.factory.annotation.Autowired;// obj create
import org.springframework.boot.test.context.SpringBootTest;// spring boot ha background la run panu
import java.util.Optional;// database ha read pana
import com.example.springboots.Entities.classEntities;
import com.example.springboots.RepositoryLayer.classRepository;

@SpringBootTest
public class read{
	
	@Autowired
	classRepository re;
	
	
	classEntities ce= new classEntities();
	
	@Test
      void read() {
		Optional<classEntities> o = re.findById(4);
		if(o.isPresent()) {
			System.out.println("recored in there");
			System.out.println(o.get());
		}else {
			System.out.println("no record");
		}
	}
	}

