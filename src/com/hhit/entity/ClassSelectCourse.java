package com.hhit.entity;
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ClassSelectCourse.java
//  @ Date : 2016/5/10
//  @ Author : 
//
//


public class ClassSelectCourse {
	public DataDict getDataDictTerm() {
		return dataDictTerm;
	}

	public void setDataDictTerm(DataDict dataDictTerm) {
		this.dataDictTerm = dataDictTerm;
	}
	private Integer id;
	private String selectNum;
	private String teacherNum;
	
	private Class_ class_;
	private Course course;
	
	//new add
	private DataDict dataDictTerm;
	
	/**
	 * 默认构造函数
	 */
	public ClassSelectCourse() {
	}
	
	/**
	 * 构造函数
	 */
	public ClassSelectCourse(String selectNum, String teacherNum,
			Class_ class_, Course course) {
		super();
		this.selectNum = selectNum;
		this.teacherNum = teacherNum;
		this.class_ = class_;
		this.course = course;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSelectNum() {
		return selectNum;
	}
	public void setSelectNum(String selectNum) {
		this.selectNum = selectNum;
	}
	public Class_ getClass_() {
		return class_;
	}
	public void setClass_(Class_ class_) {
		this.class_ = class_;
	}

	public String getTeacherNum() {
		return teacherNum;
	}
	public void setTeacherNum(String teacherNum) {
		this.teacherNum = teacherNum;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
}
