package com.sky.dao;

import org.springframework.stereotype.Repository;

//����Ĭ������������ĸСд
@Repository
public class BookDao {
	
	private String lable = "1";

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	@Override
	public String toString() {
		return "BookDao [lable=" + lable + "]";
	}
	
	
	
	

}