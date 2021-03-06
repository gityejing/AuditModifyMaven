package audit;

/**
 * 建设单位人员 TblBuildUnitUser generated by MyEclipse Persistence Tools
 */
public class TblBuildUnitUser implements java.io.Serializable {

	private String fsn; // 主键FSN

	private String uid; // 管理平台中员工主键，唯一标识

	private String fname; // 人员姓名

	private String femployeeIkey; // 用户IKEY

	private String floginName; // 登陆用户名

	private String floginPwd; // 登陆密码

	private Long femployeeSn; // 登录用户fsn

	private String funitFsn; // 所属单位fsn

	private String funitName; // 所属单位名称

	private String sex; // 性别：MALE/FEMALE

	private Integer froleType;// 角色类别 1：经办人 2：复核人

	private Integer fisDefault;// 是否默认 1，默认

	private String idCard; // 居民身份证号

	private String mobile; // 手机

	private String telephone; // 固定电话

	private String email; // 电子邮件

	private String type; // (正式员工 合同员工 虚拟员工 合作伙伴 客户)

	private String status; // 用户当前状态（是否可用1：可用 0：不可用）

	private String fremark; // 备注

	private Integer forderBy; // 排序号

	/** default constructor */
	public TblBuildUnitUser() {

	}

	/** minimal constructor */
	public TblBuildUnitUser(String fsn, String fname, Long femployeeSn) {
		this.fsn = fsn;
		this.fname = fname;
		this.femployeeSn = femployeeSn;
	}

	public String getFsn() {
		return fsn;
	}

	public void setFsn(String fsn) {
		this.fsn = fsn;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFemployeeIkey() {
		return femployeeIkey;
	}

	public void setFemployeeIkey(String femployeeIkey) {
		this.femployeeIkey = femployeeIkey;
	}

	public String getFloginName() {
		return floginName;
	}

	public void setFloginName(String floginName) {
		this.floginName = floginName;
	}

	public String getFloginPwd() {
		return floginPwd;
	}

	public void setFloginPwd(String floginPwd) {
		this.floginPwd = floginPwd;
	}

	public Long getFemployeeSn() {
		return femployeeSn;
	}

	public void setFemployeeSn(Long femployeeSn) {
		this.femployeeSn = femployeeSn;
	}

	public String getFunitFsn() {
		return funitFsn;
	}

	public void setFunitFsn(String funitFsn) {
		this.funitFsn = funitFsn;
	}

	public String getFunitName() {
		return funitName;
	}

	public void setFunitName(String funitName) {
		this.funitName = funitName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFremark() {
		return fremark;
	}

	public void setFremark(String fremark) {
		this.fremark = fremark;
	}

	public Integer getForderBy() {
		return forderBy;
	}

	public void setForderBy(Integer forderBy) {
		this.forderBy = forderBy;
	}

	public Integer getFroleType() {
		return froleType;
	}

	public void setFroleType(Integer froleType) {
		this.froleType = froleType;
	}

	public Integer getFisDefault() {
		return fisDefault;
	}

	public void setFisDefault(Integer fisDefault) {
		this.fisDefault = fisDefault;
	}
}