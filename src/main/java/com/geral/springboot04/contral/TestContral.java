package com.geral.springboot04.contral;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.geral.springboot04.domain.dao.UserRepository;
import com.geral.springboot04.domain.entity.Userinfo;
import com.geral.springboot04.domain.entity.Userinfo2;

@RestController
public class TestContral {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user/{id}")
	public Optional<Userinfo> findyid(@PathVariable Long id) 
	{
		System.out.println(userRepository+"测试中"+id);
		Optional<Userinfo> userinfo=userRepository.findById(id);
		return userinfo;
	}
	
	@GetMapping("/user")
	public List<Userinfo> findyAll() 
	{
		List<Userinfo> userinfo=userRepository.findAll();
		return userinfo;
	}
	
	@GetMapping("/finduser")
	public List<Userinfo> findyUserinfo(String username) 
	{
		List<Userinfo> userinfo=userRepository.findByName(username);
		return userinfo;
	}
	
	@GetMapping("/updateuser/{id}")
	public String updateuser(@PathVariable Long id) 
	{
		Optional<Userinfo> userinfo=userRepository.findById(id);
		userinfo.get().setParam("2018builduser");
		
		userRepository.save(userinfo.get());
		
		return "更新";
	}
	
}
