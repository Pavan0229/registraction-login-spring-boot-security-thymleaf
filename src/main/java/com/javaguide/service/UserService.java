package com.javaguide.service;

import com.javaguide.model.User;
import com.javaguide.serviceImpl.web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto registractionDto);	

}
