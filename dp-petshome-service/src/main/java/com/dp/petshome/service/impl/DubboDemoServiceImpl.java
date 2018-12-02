package com.dp.petshome.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.petshome.persistence.dao.UserMapper;
import com.dp.petshome.persistence.model.User;
import com.dp.petshome.service.DubboDemoService;

/**
 * @Dsecription Dubbo测试Service实现
 * @author DU
 */
@Service
public class DubboDemoServiceImpl implements DubboDemoService {

	@Autowired
	private UserMapper userMapper;

	private static final Logger log = LoggerFactory.getLogger(DubboDemoServiceImpl.class);

	@Override
	public Boolean insertUser(User user) {
		log.info("Provider --> 创建User对象");
		int isSuccess = userMapper.insertSelective(user);
		if (1 == isSuccess) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<User> selectUsers() {
		log.info("Provider --> 查询User对象");
		List<User> userList = userMapper.selectUsers();
		return userList;
	}

}
