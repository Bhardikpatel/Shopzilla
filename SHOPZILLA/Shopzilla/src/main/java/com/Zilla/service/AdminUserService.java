package com.Zilla.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Zilla.models.AdminUser;
import com.Zilla.repos.AdminRepository;

@Service
public class AdminUserService {

	@Autowired AdminRepository repo;
	
	public boolean validate(String userid,String pwd) {
		Optional<AdminUser> admin=repo.findById(userid);
		return admin.isPresent();
	}
	
	public boolean updatePassword(String opwd,String pwd) {
		AdminUser admin=repo.findById("admin").get();
		System.err.println(opwd);
		if(admin.getPwd().equals(opwd)) {
			admin.setPwd(pwd);
			repo.save(admin);
			return true;
		}else {
			return false;
		}
			
	}
}
