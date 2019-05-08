package ccnu.rss.entity;

public class Restaurant {
	private String userAccount;     //用户账号（一人一家店铺，一家店铺多个菜品）
    private String resKinds;        //店铺类别
    private String resName;         //店铺名
    private String resLocation;     //店铺地理位置
    private String resTel;       //店铺联系方式
    private String resDate;     //申请开店的时间
    private String resPicPath;   //图片位置

    private String remark;      //店铺备注
    private int avgScore;       //店铺平均评分（等于grade/sales）
    private int sales;          //订单总销量（订单数目）
    private int grade;          //店铺等级（按照总分来算,总分越高，等级越高）

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
