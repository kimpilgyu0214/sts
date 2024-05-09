package com.spring1.dto;

public class Sample {
	private int num;
	private String title;
	private String res;
	public Sample(int num, String title, String res) {
		super();
		this.num = num;
		this.title = title;
		this.res = res;
	}
	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "Sample [num=" + num + ", title=" + title + ", res=" + res + "]";
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	
}
