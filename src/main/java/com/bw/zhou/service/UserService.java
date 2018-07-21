package com.bw.zhou.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bw.zhou.pojo.User;
import com.bw.zhou.pojo.Yong;

public interface UserService {
    
	int getcountUser();

	List<User> getList(HashMap<String, Object> map);
	
	List<Yong> selectYong();
	
	boolean saveadd(User user);
	
	void toPs(ArrayList<String> list);
	
	User selectById(User user);
}
