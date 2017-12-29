package main.java.domain;

public class T_User {
	private int id;	//会员编号
	private String userName;	//登陆名
	private String userPass;	//密码
	private String passQuestion;	//密码提示问题
	private String passSolution;	//密码提示答案
	private String linkman;	//联系人
	private String companyName;	//企业名称
	private String kind;	//企业性质
	private String calling;	//所属行业
	private String licenceNumber;	//营业执照号
	private String address;	//地址
	private String phone;	//联系方式
	private String fax;	//传真
	private String email;	//电子邮件
	private String networkIP;	//网址
	private String content;	//企业简介
	private char lock;	//锁定状态
	private String lockCause;	//锁定原因
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getCalling() {
		return calling;
	}
	public void setCalling(String calling) {
		this.calling = calling;
	}
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNetworkIP() {
		return networkIP;
	}
	public void setNetworkIP(String networkIP) {
		this.networkIP = networkIP;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
