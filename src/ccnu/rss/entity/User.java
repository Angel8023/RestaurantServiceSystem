package ccnu.rss.entity;

public class User {
	private String userAccount;  //帐号
	private String userPasswd;	 //密码
	private String userName;	 //用户名
	private String userTel;		 //电话	
	private String gender;       //性别
	private String headPicPath;  //头像地址
	private String mibao;       //密保信息
	private String location;    //收货地址
	private String identify;    //身份：买家、店主、管理员
		
	public User() {
		super();
	}
	public User(String userAccount, String userPasswd, String userName, String userTel, String gender,
			String headPicPath, String mibao, String location, String identify) {
		super();
		this.userAccount = userAccount;
		this.userPasswd = userPasswd;
		this.userName = userName;
		this.userTel = userTel;
		this.gender = gender;
		this.headPicPath = headPicPath;
		this.mibao = mibao;
		this.location = location;
		this.identify = identify;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userAccount=" + userAccount + ", userPasswd=" + userPasswd + ", userName=" + userName
				+ ", userTel=" + userTel + ", gender=" + gender + ", headPicPath=" + headPicPath + ", mibao=" + mibao
				+ ", location=" + location + ", identify=" + identify + "]";
	}
	/**
	 * @return the userAccount
	 */
	public String getUserAccount() {
		return userAccount;
	}
	/**
	 * @param userAccount the userAccount to set
	 */
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	/**
	 * @return the userPasswd
	 */
	public String getUserPasswd() {
		return userPasswd;
	}
	/**
	 * @param userPasswd the userPasswd to set
	 */
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userTel
	 */
	public String getUserTel() {
		return userTel;
	}
	/**
	 * @param userTel the userTel to set
	 */
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the headPicPath
	 */
	public String getHeadPicPath() {
		return headPicPath;
	}
	/**
	 * @param headPicPath the headPicPath to set
	 */
	public void setHeadPicPath(String headPicPath) {
		this.headPicPath = headPicPath;
	}
	/**
	 * @return the mibao
	 */
	public String getMibao() {
		return mibao;
	}
	/**
	 * @param mibao the mibao to set
	 */
	public void setMibao(String mibao) {
		this.mibao = mibao;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the identify
	 */
	public String getIdentify() {
		return identify;
	}
	/**
	 * @param identify the identify to set
	 */
	public void setIdentify(String identify) {
		this.identify = identify;
	}
	
	

}
