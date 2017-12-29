package main.java.domain;

public class T_Job {
	private int jobID;	//招聘编号
	private String job;	//招聘职位
	private char number;	//招聘人数
	private char sex;	//性别要求
	private char age;	//年龄要求
	private String knowledge;	//学历要求
	private String specialty;	//专业要求
	private String experience;	//工作经验
	private String city;	//工作地点
	private char pay;	//月薪
	private String particularInfo;	//详细信息
	private String fBDate;	//发布日期
	private String userName;	//发布者
	private char auditing;	//审核状态
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public char getNumber() {
		return number;
	}
	public void setNumber(char number) {
		this.number = number;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public char getAge() {
		return age;
	}
	public void setAge(char age) {
		this.age = age;
	}
	public String getKnowledge() {
		return knowledge;
	}
	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public char getPay() {
		return pay;
	}
	public void setPay(char pay) {
		this.pay = pay;
	}
	public String getParticularInfo() {
		return particularInfo;
	}
	public void setParticularInfo(String particularInfo) {
		this.particularInfo = particularInfo;
	}
	public String getfBDate() {
		return fBDate;
	}
	public void setfBDate(String fBDate) {
		this.fBDate = fBDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char getAuditing() {
		return auditing;
	}
	public void setAuditing(char auditing) {
		this.auditing = auditing;
	}


}
