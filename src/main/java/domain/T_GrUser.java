package main.java.domain;

public class T_GrUser {
	private int id;	//会员编号
	private String name;	//登陆名
	private String pass;	//密码
	private String passQuestion;	//密码提示问题
	private String passSolution;	//密码提示答案
	private String linkman;	//联系人
	private String phone;	//联系方式
	private String address;	//地址
	private char lock;	//锁定状态
	private String lockCause;	//锁定原因
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPassQuestion() {
		return passQuestion;
	}
	public void setPassQuestion(String passQuestion) {
		this.passQuestion = passQuestion;
	}
	public String getPassSolution() {
		return passSolution;
	}
	public void setPassSolution(String passSolution) {
		this.passSolution = passSolution;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getLock() {
		return lock;
	}
	public void setLock(char lock) {
		this.lock = lock;
	}
	public String getLockCause() {
		return lockCause;
	}
	public void setLockCause(String lockCause) {
		this.lockCause = lockCause;
	}


}
