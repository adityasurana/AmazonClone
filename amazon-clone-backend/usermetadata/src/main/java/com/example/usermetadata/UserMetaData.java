package com.example.usermetadata.Entity;


import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "usermetadata")
public class UserMetaData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String uniqueId;
	private String email;
	
	public UserMetaData() {
		super();
	}
	
	public UserMetaData(long id, String name, String uniqueId, String email) {
		super();
		this.id = id;
		this.name = name;
		this.uniqueId = uniqueId;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
