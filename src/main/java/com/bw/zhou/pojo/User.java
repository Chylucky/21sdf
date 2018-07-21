package com.bw.zhou.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
     private int uid;
     private int bh;
     private String name;
     private String tel;
     private List<Yong> yong = new ArrayList<Yong>();
     private String fname;
     private List<Integer> tids;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getBh() {
		return bh;
	}
	public void setBh(int bh) {
		this.bh = bh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public List<Yong> getYong() {
		return yong;
	}
	public void setYong(List<Yong> yong) {
		this.yong = yong;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public List<Integer> getTids() {
		return tids;
	}
	public void setTids(List<Integer> tids) {
		this.tids = tids;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", bh=" + bh + ", name=" + name + ", tel="
				+ tel + ", yong=" + yong + ", fname=" + fname + ", tids="
				+ tids + "]";
	}
     
}
