package com.example.pquestion.dao;
import com.example.pquestion.model.verify;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface verifydao extends JpaRepository<verify,String> {

@Query(value ="select password from verify where name=:user1" ,nativeQuery = true)
String done(@Param("user1") String user1);

}









