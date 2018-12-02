package com.dp.petshome.persistence.dao;

import java.util.List;

import com.dp.petshome.persistence.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
	List<User> selectUsers();
}