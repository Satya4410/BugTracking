package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsDao extends CrudRepository<Details, String> 
{
	Details findByProjectname(String projectname);
	Details findBycategory(String category);
	
}
