package com.kh.chap03_class.model.vo.member;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	public void changName(String name) {
		memberName = name;
	}
	public void printName() {
		System.out.println("이름은 : "+memberName);
	}
	
}
