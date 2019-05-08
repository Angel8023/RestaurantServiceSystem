package ccnu.rss.entity;

public class User {
	private String userAccount;  //�ʺ�
	private String userPasswd;	 //����
	private String userName;	 //�û���
	private String userTel;		 //�绰	
	private String gender;       //�Ա�
	private String headPicPath;  //ͷ���ַ
	private String mibao;       //�ܱ���Ϣ
	private String location;    //�ջ���ַ
	private String identify;    //��ݣ���ҡ�����������Ա
		
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
