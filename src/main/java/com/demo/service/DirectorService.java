package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.DirectorDTO;
import com.demo.entity.Director;
import com.demo.repository.DirectorRepository;


@Service
public class DirectorService {
@Autowired
private DirectorRepository repo;
	public void insertDirector(DirectorDTO directordto) {
		// TODO Auto-generated method stub
		Director entity = new Director();
		entity.setAddress(directordto.getAddress());
		entity.setContactNumber(directordto.getContactNumber());
		entity.setDirectorId(directordto.getDirectorId());
		entity.setEmail(directordto.getEmail());
		entity.setFirstName(directordto.getFirstName());
		entity.setLastName(directordto.getLastName());
		repo.save(entity);
		
		
	}
	
	public void getAllDirector() {
		List<Director> list = repo.findAll();
		list.stream().forEach(System.out::println);
		}
	
	public void updatedirectorDetails(String address,String fname,String lname) {
		repo.updateDirdetails(address,fname,lname);
	}

	

}
