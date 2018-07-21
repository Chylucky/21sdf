package com.bw.zhou.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bw.zhou.pojo.User;
import com.bw.zhou.pojo.Yong;

public interface UserDao {
	
	int getcountUser();

	List<User> getList(HashMap<String, Object> map);
	
	List<Yong> selectYong();

	int add(User user);

	void addzhong(HashMap<String, Object> map);
	
	void toPs(ArrayList<String> list);
	
	User selectById(User user);
}
