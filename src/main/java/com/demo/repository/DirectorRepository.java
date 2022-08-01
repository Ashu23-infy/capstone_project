package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Director;



@Repository
public interface DirectorRepository extends JpaRepository<Director,Integer> {
	List<Director> findByName(String fname, String lname);
	
	
	 @Transactional
	   @Modifying
	   @Query(value = "update  Director set address = ? " + " where first_name = ? And last_name = ?", nativeQuery = true)
	void updateDirdetails(String address,String fname,String lname);

}
