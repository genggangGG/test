package com.gzcc.sp01.service;

import com.gzcc.sp01.pojo.User;

public interface UserService {

	User getUser(Integer id);
	void addScore(Integer id, Integer score);

}
