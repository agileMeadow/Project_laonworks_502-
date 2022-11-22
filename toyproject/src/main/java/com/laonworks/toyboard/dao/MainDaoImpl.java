package com.laonworks.toyboard.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laonworks.toyboard.service.MainServiceImpl;

@Service
public class MainDaoImpl implements MainDao{

	@Autowired
	private SqlSession sqlSession;
}
