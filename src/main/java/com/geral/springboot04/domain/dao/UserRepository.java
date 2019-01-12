package com.geral.springboot04.domain.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.geral.springboot04.domain.entity.Userinfo;

//继承来JpaRepository完成对数据库的操作
public interface UserRepository extends JpaRepository<Userinfo, Long>{

	
	 @Query("from Userinfo where username=:cn")
	 public List<Userinfo> findByName(@Param("cn") String catName);
}
