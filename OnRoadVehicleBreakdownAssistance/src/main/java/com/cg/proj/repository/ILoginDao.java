package com.cg.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.proj.entity.Userlogin;



@Repository
public interface ILoginDao extends JpaRepository<Userlogin
, String>{

	
}
