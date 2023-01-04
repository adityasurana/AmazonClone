package com.example.usermetadata.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public UserMetaData getUserDetailsFromDB(String userId) {
		return userRepo.findAllByUniqueId(userId);
	}

	public UserMetaData saveUserMetaDataTODB(UserMetaData metaData) {
		return userRepo.save(metaData);
	}
}
