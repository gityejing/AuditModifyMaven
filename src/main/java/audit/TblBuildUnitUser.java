package audit;

/**
 * ���赥λ��Ա TblBuildUnitUser generated by MyEclipse Persistence Tools
 */
public class TblBuildUnitUser implements java.io.Serializable {

	private String fsn; // ����FSN

	private String uid; // ����ƽ̨��Ա��������Ψһ��ʶ

	private String fname; // ��Ա����

	private String femployeeIkey; // �û�IKEY

	private String floginName; // ��½�û���

	private String floginPwd; // ��½����

	private Long femployeeSn; // ��¼�û�fsn

	private String funitFsn; // ������λfsn

	private String funitName; // ������λ����

	private String sex; // �Ա�MALE/FEMALE

	private Integer froleType;// ��ɫ��� 1�������� 2��������

	private Integer fisDefault;// �Ƿ�Ĭ�� 1��Ĭ��

	private String idCard; // ��������֤��

	private String mobile; // �ֻ�

	private String telephone; // �̶��绰

	private String email; // �����ʼ�

	private String type; // (��ʽԱ�� ��ͬԱ�� ����Ա�� ������� �ͻ�)

	private String status; // �û���ǰ״̬���Ƿ����1������ 0�������ã�

	private String fremark; // ��ע

	private Integer forderBy; // �����

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