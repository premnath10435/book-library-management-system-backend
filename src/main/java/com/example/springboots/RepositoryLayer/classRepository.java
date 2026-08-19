package com.example.springboots.RepositoryLayer;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboots.Entities.classEntities;
public interface classRepository extends JpaRepository<classEntities, Integer> {
	
	List<classEntities>findByCategory(String category);

	
	//own query//

	
	
}

