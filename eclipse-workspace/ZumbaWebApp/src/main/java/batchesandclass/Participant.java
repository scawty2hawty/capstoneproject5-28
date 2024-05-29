package batchesandclass;

import java.sql.Timestamp;

public class Participant {

	int pid;
	String name;
	String phone;
	String emial;
	int bid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Participant [pid=" + pid + ", name=" + name + ", phone=" + phone + ", emial=" + emial + ", bid=" + bid
				+ "]";
	}
	public Participant(int pid, String name, String phone, String emial, int bid) {
		super();
		this.pid = pid;
		this.name = name;
		this.phone = phone;
		this.emial = emial;
		this.bid = bid;
	}
	public Participant(int int1, String string, String string2, Timestamp timestamp) {
		// TODO Auto-generated constructor stub
	}
	public Object getAge() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
