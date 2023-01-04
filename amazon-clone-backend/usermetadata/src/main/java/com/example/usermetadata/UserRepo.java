package com.example.usermetadata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.usermetadata.Entity.UserMetaData;

public interface UserRepo extends JpaRepository<UserMetaData, Long>{
	UserMetaData save(UserMetaData userdata);
	UserMetaData findAllByUniqueId(String uniqueId);
}
