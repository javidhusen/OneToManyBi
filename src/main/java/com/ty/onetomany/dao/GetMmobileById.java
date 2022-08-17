package com.ty.onetomany.dao;

import com.ty.onetomany.dto.Mobile;

public class GetMmobileById {

	public static void main(String[] args) {
		
		MobileDao dao = new MobileDao();
		Mobile mobile =dao.getMobileById(2);
		
		System.out.println(mobile);
	}
}
