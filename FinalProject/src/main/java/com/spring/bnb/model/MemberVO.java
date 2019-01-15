package com.spring.bnb.model;

public class MemberVO {
	private String userid; 
	private String profileimg ;
	private String username;
	private String pwd;
	private String email; 
	private String phone;
	private int post;
	private String addr;
	private String detailaddr; 
	private int gender;
	private String birthday; 
	private String introduction; 
	private int MemberStatus;
	private int warnCount;
	private String regDate;
	
	//add
	private RoomVO myroom;
	
	public MemberVO() {}
	public MemberVO(String userid, String profileimg, String username, String pwd, String email, String phone, int post,
			String addr, String detailaddr, int gender, String birthday, String introduction, int memberStatus,
			int warnCount, String regDate) {
		super();
		this.userid = userid;
		this.profileimg = profileimg;
		this.username = username;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
		this.post = post;
		this.addr = addr;
		this.detailaddr = detailaddr;
		this.gender = gender;
		this.birthday = birthday;
		this.introduction = introduction;
		this.MemberStatus = memberStatus;
		this.warnCount = warnCount;
		this.regDate = regDate;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getProfileimg() {
		return profileimg;
	}
	public void setProfileimg(String profileimg) {
		this.profileimg = profileimg;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getPost() {
		return post;
	}
	public void setPost(int post) {
		this.post = post;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetailaddr() {
		return detailaddr;
	}
	public void setDetailaddr(String detailaddr) {
		this.detailaddr = detailaddr;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getMemberStatus() {
		return MemberStatus;
	}
	public void setMemberStatus(int memberStatus) {
		MemberStatus = memberStatus;
	}
	public int getWarnCount() {
		return warnCount;
	}
	public void setWarnCount(int warnCount) {
		this.warnCount = warnCount;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
}
