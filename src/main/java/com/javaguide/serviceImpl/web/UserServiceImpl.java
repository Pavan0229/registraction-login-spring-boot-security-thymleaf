package com.javaguide.serviceImpl.web;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaguide.model.Role;
import com.javaguide.model.User;
import com.javaguide.repository.UserRepository;
import com.javaguide.service.UserService;
import com.javaguide.serviceImpl.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User save(UserRegistrationDto registractionDto) {
		User user = new User(registractionDto.getFirstName(), registractionDto.getLastName(),
				registractionDto.getEmail(), registractionDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepo.save(user);
	}

}
