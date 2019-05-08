package ccnu.rss.entity;

public class Restaurant {
	private String userAccount;     //�û��˺ţ�һ��һ�ҵ��̣�һ�ҵ��̶����Ʒ��
    private String resKinds;        //�������
    private String resName;         //������
    private String resLocation;     //���̵���λ��
    private String resTel;       //������ϵ��ʽ
    private String resDate;     //���뿪���ʱ��
    private String resPicPath;   //ͼƬλ��

    private String remark;      //���̱�ע
    private int avgScore;       //����ƽ�����֣�����grade/sales��
    private int sales;          //������������������Ŀ��
    private int grade;          //���̵ȼ��������ܷ�����,�ܷ�Խ�ߣ��ȼ�Խ�ߣ�

    public Restaurant(){
        super();
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "userAccount='" + userAccount + '\'' +
                ", resKinds='" + resKinds + '\'' +
                ", resName='" + resName + '\'' +
                ", resLocation='" + resLocation + '\'' +
                ", resTel='" + resTel + '\'' +
                ", resDate='" + resDate + '\'' +
                ", resPicPath='" + resPicPath + '\'' +
                ", remark='" + remark + '\'' +
                ", avgScore=" + avgScore +
                ", sales=" + sales +
                ", grade=" + grade +
                '}';
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getResKinds() {
        return resKinds;
    }

    public void setResKinds(String resKinds) {
        this.resKinds = resKinds;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResLocation() {
        return resLocation;
    }

    public void setResLocation(String resLocation) {
        this.resLocation = resLocation;
    }

    public String getResTel() {
        return resTel;
    }

    public void setResTel(String resTel) {
        this.resTel = resTel;
    }

    public String getResDate() {
        return resDate;
    }

    public void setResDate(String resDate) {
        this.resDate = resDate;
    }

    public String getResPicPath() {
        return resPicPath;
    }

    public void setResPicPath(String resPicPath) {
        this.resPicPath = resPicPath;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
