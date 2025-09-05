package com.smhrd.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.web.domain.Cloudtest;

// JpaRepository 상속
@Repository
public interface CloudtestRepository extends JpaRepository<Cloudtest, Long> {
	// JpaRepository<테이블을 대표하는 자료형, 테이블의 pk 자료형>
	// interface이지만, 일종의 자료 형태를 정하는 개념으로 봐서 extends로 상속받는다.
	// !!! 특이 케이스 !!!
	
	// 메소드명을 기준으로 SQL구문을 생성
	// Java 기본적으로 이름을 지어줄 때, 카멜식 기법을 따른다.
	
	Cloudtest findByIdAndName(Long id, String name);
	// Select * from cloudtest where id = ? and name = ?
	
	
	
}
