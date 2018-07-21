package com.bw.zhou.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.zhou.dao.UserDao;
import com.bw.zhou.pojo.User;
import com.bw.zhou.pojo.Yong;
import com.bw.zhou.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
     
	  @Resource
	  @Autowired
	  UserDao userDao;

	@Override
	public int getcountUser() {
		// TODO Auto-generated method stub
		return this.userDao.getcountUser();
	}

	@Override
	public List<User> getList(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return this.userDao.getList(map);
	}

	@Override
	public List<Yong> selectYong() {
		// TODO Auto-generated method stub
		return this.userDao.selectYong();
	}

	@Override
	public boolean saveadd(User user) {
		 int i = userDao.add(user);
		 int uid = user.getUid();
		 HashMap<String, Object> map = new HashMap<String, Object>();
		 map.put("uid", uid);
		 map.put("tids", user.getTids());
		 if(i>0){
			 userDao.addzhong(map);
			 return true;
		 }
		return false;
	}

	@Override
	public void toPs(ArrayList<String> list) {
		// TODO Auto-generated method stub
		 this.userDao.toPs(list);
	}

	@Override
	public User selectById(User user) {
		// TODO Auto-generated method stub
		return this.userDao.selectById(user);
	}

	
	  
	  
}
