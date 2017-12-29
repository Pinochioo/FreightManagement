package main.java.domain;

public class T_Freight {

	private int id;	//货运货物编号
	private String userName;	//发布者
	private String start;	//出发地点
	private String terminal;	//达到地点
	private String freightType;	//货运货物类别
	private int freightWeight;	//货运货物重量
	private char weightUnit;	//重量单位
	private String linkman;	//联系人
	private String phone;	//联系电话
	private String term;	//有效日期
	private String content;	//备注
	private String fBDate;	//发布日期
	private char userType;	//会员类型
	private String auditing;	//审核状态
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
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getFreightType() {
		return freightType;
	}
	public void setFreightType(String freightType) {
		this.freightType = freightType;
	}
	public int getFreightWeight() {
		return freightWeight;
	}
	public void setFreightWeight(int freightWeight) {
		this.freightWeight = freightWeight;
	}
	public char getWeightUnit() {
		return weightUnit;
	}
	public void setWeightUnit(char weightUnit) {
		this.weightUnit = weightUnit;
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
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getfBDate() {
		return fBDate;
	}
	public void setfBDate(String fBDate) {
		this.fBDate = fBDate;
	}
	public char getUserType() {
		return userType;
	}
	public void setUserType(char userType) {
		this.userType = userType;
	}
	public String getAuditing() {
		return auditing;
	}
	public void setAuditing(String auditing) {
		this.auditing = auditing;
	}


}
