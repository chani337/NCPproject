package com.smhrd.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.web.domain.Cloudtest;

// JpaRepository ���
@Repository
public interface CloudtestRepository extends JpaRepository<Cloudtest, Long> {
	// JpaRepository<���̺��� ��ǥ�ϴ� �ڷ���, ���̺��� pk �ڷ���>
	// interface������, ������ �ڷ� ���¸� ���ϴ� �������� ���� extends�� ��ӹ޴´�.
	// !!! Ư�� ���̽� !!!
	
	// �޼ҵ���� �������� SQL������ ����
	// Java �⺻������ �̸��� ������ ��, ī��� ����� ������.
	
	Cloudtest findByIdAndName(Long id, String name);
	// Select * from cloudtest where id = ? and name = ?
	
	
	
}
