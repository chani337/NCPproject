package com.smhrd.web.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Entity는 무조건 들어가야 함!
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cloudtest {
	// private key
	// jpa는 Long이 더 호환 잘 됨!
	@Id
	private Long id;
	private String name;
	private String gender;
	private int age;
	
}
