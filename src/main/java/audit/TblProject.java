package audit;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
public class TblProject implements java.io.Serializable, Cloneable {
	// Fields
	private String fid; // ��Ŀ���
	private String flxProjectId;// ���������Ŀ
	private String flxProjectName;//�����Ŀ����
	private String fauditKey;//�Խ�Ψһ����
	private Integer fappId; // ��������
	private String fappName; // ��������
	private String fflowId; // ����ʵ�����
	private String fprojectName; // ��Ŀ����
	private String fcurrentJob; // ��ǰ����
	
	private String fsongshenTaskCode;// ����������

	// ���赥λ������
	private String fbuildCompanySn;// ���赥λid
	private String fbuildCompanyName; // ���赥λ
	
	private Long fcreaterSn; // ��Ŀ�����ˣ���ǰ���ռ�Ա�������ǽ��赥λ��
	private String fcreaterName; // ��Ŀ����������
	private String fcreateRoleCode;// �����˵Ľ�ɫ�����赥λ�����ܵ�λ��ҵ���Ҷ��п��ܷ�����������

	// ��ڴ���
	private String fdeletegateOrganize; 
	private Integer fentrustFsn;  // ί�е�λ 

	private String fManagerDepSn;// ���ܲ���id
	private String fManagerDepName;// ���ܲ���

	// ��������е���˿���
	private Long fcheckDepartmentSn; // ��˿���
	private String fcheckDepartmentName; // ��˿�������
	private Long fcheckDepartmentManagerSn; // ��˿Ƹ����˱��
	private String fcheckDepartmentManagerName; // ��˿Ƹ���������
	//////////////////////////////////////////////////////////////////////
	
	private Date fnewProjectDate = new Date(); // �½���Ŀ��ʱ��
	private Date fdeletegateDate; // ί��ʱ��
	
	private Date fplanEndDate; // ʵ����Ҫ�����ʱ�䣨���ã��涨�������(�涨���ʱ��)
	private Date fplanFinishDate; // �ƻ����ʱ��
	private Integer fplanFinishDays;//��ɹ�����
	private String fcheckerIds; // ����˱��
	private String fcheckerNames; // ���������
	private String freCheckerIds; // ������
	private String freCheckerNames; // ����������
	private String freReCheckerIds; // ������
	private String freReCheckerNames; // ����������
	private Long fcenterLeaderSn; // ���α��
	private String fcenterLeaderName; // ��������
	private Long fassistantCenterLeaderSn; // �����α��
	private String fassistantCenterLeaderName; // ����������
	private Long freReCheckDepartMentLeaderSn; // ����Ƹ����˱��
	private String freReCheckDepartMentLeaderName; // ����Ƹ���������
	private Long freceiverSn; // �ռ��˱��
	private String freceiverName; // �ռ�������
	private Long fzongHeKeManagerSn; // �ۺϿƸ����˱��
	private String fzongHeKeManagerName; // �ۺϿƸ���������
	private Double fapplyAmount = 0.00; // ������
	private String fmeno; // ��ע
	private Integer fisGreateProject; // �Ƿ��ص���Ŀ
	private Integer fifHastenHandle; // �Ƿ�߰�
	private Integer fpri; // ���ȼ�

	private String fsecrecyRating; // ���ܵȼ�
	private Integer fisPaused; // �Ƿ���ֹ
	private Integer fendStatus; // ����״̬
	private Long fcheckContentSn; // �������̣���ŵ���������ݵ�fsn����ѯ����appid�������
	private String fcheckContentName; // ���̵�����
	private Long fcheckContentViewSn; // ���������̣���ŵ���������ݵ�fsn�����˼�������
	private String fcheckContentViewName; // �����������
	private String fpsName; // �����������
	private Integer fisHistoryProject; // �Ƿ�����ʷ��Ŀ
	private Integer fisSignHeTong;//�Ƿ���ǩ��ͬ
	private Integer fisRandomFuShen;//�Ƿ���г�鸴��:1,��鸴��2,����鸴��
	private Date fprojectCreateDate; // ��Ŀ��������
	private Integer fauditTimes; // ��˴���
	private String fleaderOpType; // �쵼�������
	private Integer fisChangeCheckDept; // �쵼�Ƿ��޸Ĺ���˿���
	private Date fpigeonholeDate; // �鵵����
	private String fhistoryTreeId = "3"; // ������ʷ��Ŀ��ID Ĭ��IDΪΪ�鵵
	private Double ffirstCheckMoney = 0.00; // ҵ��Ƴ������ [��һ�γ�ҵ��Ƶ�ʱ��]
	private Double freCheckMoney = 0.00; // ����Ƹ������ [û���������]
	private Date fcheckDepToReCheckDepDate; // ҵ����ʹ︴��ʱ�� [����ƽ���ҵ��Ƹ���ʱ,���˸��������ʱ]
	private Double frecheckDepartFirstAmout = 0.00; // ����Ƴ����� ��һ�δӸ���Ƶ��쵼��
	private Date fcompleteFuShenTime; // ��ɸ���ʱ�� [�Ӹ���Ƹ����˻��˻��ߵ��쵼]
	private Double ffirstReCheckMoney=0.00;//��˵����˵��󶨽������󶨽����������������������󶨽��-�󶨽�/ �󶨽�
	private Double fsongShen = 0.00; // ���յ����������
	private Double fshenHe = 0.00; // ���յ���˽�����
	private Double fshenDing = 0.00; // �����󶨽��Ļ���
	private Double fheJian = 0.00;
	private String fsongShenDaXie = ""; // ���յ����������
	private String fshenHeDaXie = ""; // ���յ���˽�����
	private String fshenDingDaXie = ""; // �����󶨽��Ļ���
	private String fheJianDaXie = "";
	private String fheZengDaXie = "";
	private Date ftaskDingAnTianXieDate; // ��Ŀ��۶������û�ѡ�������
	private String ffawengaoNo; // ���ĸ��
	private String ftaskCode; // ί������
	private String fweituoZJCode;// ί���н�code
	private String fshouLiCode; // ��Ŀ������
	private String fcheckItems; // ��Ŀ�������id
	private String fcheckItemsName; // ��Ŀ�������name
	private String fnewJobId; // �²���ʵ�����,��һ����ת�����ת��¼tbljobbase��fsn��������ת����Ȼ��tbljobbase��
	private Integer fnewJobStatus; // �²���ʵ��״̬
	private Date fcheckCompareDate; // �������������˶Աȱ�����
	private Integer fisCenterBack; // �����쵼�Ƿ���˹���
	private Date fsheHeDate; // ���ʱ��
	private Double yeWuKeShenDingMoney; // ҵ����󶨽�� [û������]
	private String fyiJiaoRen; // �鵵�ƽ��嵥-�ƽ�������
	private Date fyiJiaoRiQi; // �鵵�ƽ��嵥-�ƽ�����
	private String fjieShouRen; // �鵵�ƽ��嵥-����������
	private Date fjieShouRiQi; // �鵵�ƽ��嵥-��������
	private String jobId;
	private String miniJobId;
	private Date fendDate;
	
	private Long fshenheType = 1L;// (Ĭ��ѡ������������)��˷�ʽ 1-������� 2-�н���� 3-�������
	private Integer fround;// �ڼ�����Ŀ����Ŀ���µ��ִ�ֵ
	private String froundName;// �ִ���
	private Integer fbatch;// �ڼ�����
	private Integer isDanduWt; // ����ί�д���
	private Integer isZhuanXiangSh; // ר����˴���:����ˮ��
	private String fzhuanXiangSh;// ר�������

	private String fshenheZhuanGuanYuanIds;// ���ר��Աid
	private String fshenheZhuanGuanYuanNames;// ���ר��ԱName
	private String projectId;
	private Double heJianAmount;// ͳ�Ʊ����ֶκ˼����
	private Double wuchaAmount;// ͳ�Ʊ���������
	private Double heJianRate;// ͳ�Ʊ����ֶκ˼���
	private Double wuchaRate;// ͳ�Ʊ����ֶ������
	private Integer projCount = 1;// ͳ�Ʊ����ֶ���Ŀ������Ĭ��ֵͳ��ʱ���ã���������ı䣩
	private Integer finishCount = 1;//�Ѿ���ɵ���Ŀ��
	private Double finishSongShen=0.00;
	private Integer diffCount;// �ԱȽ�����/��
	private Double diffCountRate;// �ԱȽ�����/����
	private Double diffSongShen;// �ԱȽ�����/��
	private Double diffSongShenRate;// �ԱȽ�����/����
	private Double diffShenHe;// ���յ���˽�����
	private Double diffShenHeRate;// ���յ���˽�����
	private Double diffShenDing;
	private Double diffShenDingRate;
	private Double diffHeJianAmount;
	private Double diffHeJianAmountRate;
	private Double diffHeJianRate;
	private Double fbasicRate;// ������˷ѷ���
	private Double fawardRate;// ������˷ѷ���
	private Double fbasicMax;// ��������޶�
	private Double fbasicMin;// ��������޶�
	private Double fawardMax;// ��������޶�
	private Double fawardMin;// ��������޶�
	private Double basic = 0.00;// ��˷���-����(get������ҵ��)
	private Double award = 0.00;// ��˷���-����(get������ҵ��)
	private Double total = 0.00;// ��˷���-С��
	private Double basicCount = 0.00;// ��˷���-����//ͳ��
	private Double awardCount = 0.00;// ��˷���-����//ͳ��
	private Double totalCount = 0.00;// ��˷���-С��//ͳ��
	private Collection<TblProject> childen = new ArrayList<TblProject>();
	private List<TblProject> childens = new ArrayList<TblProject>();
	// ��Ŀ�б��У���ɫ����ʾ��Ϣ
	private String contentColor;
	private String titleTip;
	private Double fheZeng;// ������
	private Integer fleaderSaveId;// ������ݱ�����
	private Integer fifFreezeFuHeYiJianBiao;// �Ƿ񶳽Ḵ�������
	private Integer fifFreezeFuShenYiJianBiao;// �Ƿ񶳽Ḵ�������
	private Integer fifFreeFaWenGaoNumber;// �Ƿ�򿪱�д���ĺŹ���
	
	private Integer fifOpen;//
	private String fminiJobUserName;// ��ǰ����Ĵ����ˣ�����tblminijob��tblemployeeinfo��
	
	private String fhuiBaiIds; // �����ұ��
	private String fhuiBaiNames; // ����������
	
	private String flockState;// ����Ȩ��״̬
	
	private int currentUserIsRechecker = 0;// ��ǰ�û��Ƿ��ǻ�����
	private int currentUserIsReRechecker = 0;// ��ǰ�û��Ƿ��Ǹ�����
	private int currentUserIsCheckDptMan = 0;// ��ǰ�û��Ƿ�������Ƹ�����
	private int currentUserIsReRecheckMan = 0;// ��ǰ�û��Ƿ��Ǹ����鸺����
	private int currentUserIsCenterZhuRen = 0;// ��ǰ�û��Ƿ���������
	private int currentUserIsCenterFuZhuRen = 0;// ��ǰ�û��Ƿ����ĸ�����
	
	private Long fcooperatorSn;
	private Integer fifdd = 0;// �Ƿ��Ǵ�����Ŀ//0�Ϳմ�������
	private Integer fpoint;// ��ʷ��Ŀ���
	private Integer fisDelete;// �Ƿ���������Ŀ//0�Ϳմ�������
	private Date fdeleteDate;// ����ʱ��
	private Integer fisFiddOrDelete;// ���Ƿ���Ҫ�����������������Ŀ1:������2������
	private Date fshouLiDate;// ����ʱ�� : �����������̲����ύ���ں��ô�����������
	private Date fdaiDingDate;// ����ʱ��
	private Long shenheNum; // ������������ҵ��ͳ�Ʊ�������
	
	private Integer fmenuType;//�˵��汾 ----�˵��汾����--1����ʾ�ɵĲ˵�--2����ʾ�µĲ˵�-----
	private Date fleaderAuditTime;///�쵼����ʱ�䣨��Ŀ�����ʱ�䣩
	private Date fweiTuoZhongjieTime;// ί���н�ʱ��
	
	private Double khpf=0.00;//���ڱ�����ʾ
	private Double avgkhpf=0.00;
	private Integer shdays=0;//���ڱ�����ʾ
	private Integer htdays=0;//���ڱ�����ʾ
	private Double wclv=0.00;//���ڱ�����ʾ
	
	// �����Ŀ�õ����ֶ�
	private Integer finishYear; // ������
	private Integer finishSeasion;// ��ɼ���
	private Integer fisLeaderCheck;// �Ƿ��쵼���� 1���ǣ�0����
	private Integer fisImportent; // �Ƿ��ص���Ŀ1���ǣ�0����
	private String fContractNumber;// ��ͬ���
	private Date fContractDate;// ��ͬʱ��
	private Date frequireDuiShuTime;/// Ҫ���ύ����ʱ��(����ǰ����ʱ��)
	private Integer fdelayDays;// ��������
	private Boolean fisdelay;// �Ƿ�����
	private Boolean fisYingji;// �Ƿ�Ӧ����Ŀ
	
	// �����н���˷����õ����ֶ�
	private Double fyuFuKuan;// Ԥ����
	private Date ffuKuanDate;// ����ʱ��
	private Integer fyuQiDays;// ��������
	private Double fwuChaLv;// �����
	private Double fyuQiKouKuan;// ���ڿۿ�
	private Double fwuChaLvKouFa;// ����ʿ۷�
	private Double fweiKuan;// β��
	private Date ffuKuanDate2;// ����ʱ��
	private Double fjsShenHeFei;// ������˷�
	private Double fsjShenHeFei;// ʵ����˷�
	private String fbankNumber;
	
	private Integer fwhoseTurn;
	private Integer fisExportFinished;
	private Long fsort;// �������򣬳�ʼ����ʱ��ԭ��bigint�����������������Ժ������һ���Ļ����ϼ�1
	
	private String statusName;// ������¼���̲���״̬��tblprocess���е�statusName) ��ӳ��
	private Boolean fisCurrentJob;

	// ����ʱ��
	private Date fbaosongDate1;// ���赥λ����ʱ��
	private Date fbaosongDate2;// ���ܵ�λ����ʱ��
	private Date fbaosongDate3;// ҵ���ұ���ʱ��
	
	
	public Boolean getFisCurrentJob() {
		return fisCurrentJob;
	}

	public void setFisCurrentJob(Boolean fisCurrentJob) {
		this.fisCurrentJob = fisCurrentJob;
	}

	/** default constructor */
	public TblProject() {
		
	}

	// Property accessors
	public TblProject(String fid, String ftaskCode, String fprojectName,
			String fdeletegateOrganize, String fbuildCompanyName,
			String fcheckContentViewName, String fcheckDepartmentManagerName,
			String fcheckerNames, String freCheckerNames) {
		this.fid = fid;
		this.fprojectName = fprojectName;
		this.fdeletegateOrganize = fdeletegateOrganize;
		this.fbuildCompanyName = fbuildCompanyName;
		this.ftaskCode = ftaskCode;
		this.fcheckContentViewName = fcheckContentViewName;
		this.fcheckDepartmentManagerName = fcheckDepartmentManagerName;
		this.fcheckerNames = fcheckerNames;
		this.freCheckerNames = freCheckerNames;
	}

	public TblProject(String fid, Integer fisHistoryProject, String ftaskCode,
			String fprojectName, String fdeletegateOrganize,
			String fbuildCompanyName, String fcheckContentViewName,
			String fcheckDepartmentManagerName, String fcheckerNames,
			String freCheckerNames) {
		this.fid = fid;
		this.fisHistoryProject = fisHistoryProject;
		this.fprojectName = fprojectName;
		this.fdeletegateOrganize = fdeletegateOrganize;
		this.fbuildCompanyName = fbuildCompanyName;
		this.ftaskCode = ftaskCode;
		this.fcheckContentViewName = fcheckContentViewName;
		this.fcheckDepartmentManagerName = fcheckDepartmentManagerName;
		this.fcheckerNames = fcheckerNames;
		this.freCheckerNames = freCheckerNames;
	}

	public TblProject(String fid, String ftaskCode, String fprojectName,
			String fdeletegateOrganize, String fbuildCompanyName,
			String fcheckContentViewName, String fcheckDepartmentManagerName,
			String fcheckerNames, String freCheckerNames, String fcurrentJob) {

		this.fid = fid;
		this.fprojectName = fprojectName;
		this.fdeletegateOrganize = fdeletegateOrganize;
		this.fbuildCompanyName = fbuildCompanyName;
		this.ftaskCode = ftaskCode;
		this.fcheckContentViewName = fcheckContentViewName;
		this.fcheckDepartmentManagerName = fcheckDepartmentManagerName;
		this.fcheckerNames = fcheckerNames;
		this.freCheckerNames = freCheckerNames;
		this.fcurrentJob = fcurrentJob;

	}

	// �˹����Զ��屨���õ�,����ɾ
	public TblProject(String fprojectName, String fdeletegateOrganize,
			String fcheckDepartmentName, String fcheckDepartmentManagerName,
			Date fdeletegateDate, Date fplanEndDate, String fcheckerNames,
			String freCheckerNames, String freReCheckerNames,
			String fbuildCompanyName, Long fcheckContentViewSn,
			String fcheckContentViewName, Double fsongShen, Double fshenHe,
			Double fshenDing, String ftaskCode, Date fendDate,
			String fcheckItemsName, Integer fendStatus) {
		super();
		this.fprojectName = fprojectName;
		this.fdeletegateOrganize = fdeletegateOrganize;
		this.fcheckDepartmentName = fcheckDepartmentName;
		this.fcheckDepartmentManagerName = fcheckDepartmentManagerName;
		this.fdeletegateDate = fdeletegateDate;
		this.fplanEndDate = fplanEndDate;
		this.fcheckerNames = fcheckerNames;
		this.freCheckerNames = freCheckerNames;
		this.freReCheckerNames = freReCheckerNames;
		this.fbuildCompanyName = fbuildCompanyName;
		this.fcheckContentViewSn = fcheckContentViewSn;
		this.fcheckContentViewName = fcheckContentViewName;
		this.fsongShen = fsongShen;
		this.fshenHe = fshenHe;
		this.fshenDing = fshenDing;
		this.ftaskCode = ftaskCode;
		this.fendDate = fendDate;
		this.fcheckItemsName = fcheckItemsName;
		this.fendStatus = fendStatus;
		this.projCount = 1;
	}

	// �˹����Զ��屨���õ�,����ɾ
	public TblProject(String fid,String fprojectName, String fdeletegateOrganize,
			String fcheckDepartmentName, String fcheckDepartmentManagerName,
			Date fdeletegateDate, Date fplanEndDate, String fcheckerNames,
			String freCheckerNames, String freReCheckerNames,
			String fbuildCompanyName, Long fcheckContentViewSn,
			String fcheckContentViewName, Double fsongShen, Double fshenHe,
			Double fshenDing, String ftaskCode, Date fendDate,
			String fcheckItemsName, Integer fendStatus) {
		super();
		this.fid = fid;
		this.fprojectName = fprojectName;
		this.fdeletegateOrganize = fdeletegateOrganize;
		this.fcheckDepartmentName = fcheckDepartmentName;
		this.fcheckDepartmentManagerName = fcheckDepartmentManagerName;
		this.fdeletegateDate = fdeletegateDate;
		this.fplanEndDate = fplanEndDate;
		this.fcheckerNames = fcheckerNames;
		this.freCheckerNames = freCheckerNames;
		this.freReCheckerNames = freReCheckerNames;
		this.fbuildCompanyName = fbuildCompanyName;
		this.fcheckContentViewSn = fcheckContentViewSn;
		this.fcheckContentViewName = fcheckContentViewName;
		this.fsongShen = fsongShen;
		this.fshenHe = fshenHe;
		this.fshenDing = fshenDing;
		this.ftaskCode = ftaskCode;
		this.fendDate = fendDate;
		this.fcheckItemsName = fcheckItemsName;
		this.fendStatus = fendStatus;
		this.projCount = 1;
	}
	public TblProject(String fprojectName, String fdeletegateOrganize,
			String fcheckDepartmentName, String fcheckDepartmentManagerName,
			Date fdeletegateDate, Date fplanEndDate, String fcheckerNames,
			String freCheckerNames, String freReCheckerNames,
			String fbuildCompanyName, Long fcheckContentViewSn,
			String fcheckContentViewName, Double fsongShen, Double fshenHe,
			Double fshenDing, String ftaskCode, Date fendDate,
			String fcheckItemsName, Integer fendStatus, String fcurrentJob) {
		super();
		this.fprojectName = fprojectName;
		this.fdeletegateOrganize = fdeletegateOrganize;
		this.fcheckDepartmentName = fcheckDepartmentName;
		this.fcheckDepartmentManagerName = fcheckDepartmentManagerName;
		this.fdeletegateDate = fdeletegateDate;
		this.fplanEndDate = fplanEndDate;
		this.fcheckerNames = fcheckerNames;
		this.freCheckerNames = freCheckerNames;
		this.freReCheckerNames = freReCheckerNames;
		this.fbuildCompanyName = fbuildCompanyName;
		this.fcheckContentViewSn = fcheckContentViewSn;
		this.fcheckContentViewName = fcheckContentViewName;
		this.fsongShen = fsongShen;
		this.fshenHe = fshenHe;
		this.fshenDing = fshenDing;
		this.ftaskCode = ftaskCode;
		this.fendDate = fendDate;
		this.fcheckItemsName = fcheckItemsName;
		this.fendStatus = fendStatus;
		this.projCount = 1;
		this.fcurrentJob = fcurrentJob;
	}

	// �˹���ʵʱ�����õ�,����ɾ
	public TblProject(String fprojectName, Date fdeletegateDate,
			String freReCheckerNames, String fmeno, Long fcheckContentViewSn,
			String fcheckContentViewName, Double ffirstCheckMoney,
			Date fcheckDepToReCheckDepDate, Double frecheckDepartFirstAmout,
			Date fcompleteFuShenTime, Double fshenDing, String ftaskCode,
			Integer fendStatus) {
		super();
		this.fprojectName = fprojectName;
		this.fdeletegateDate = fdeletegateDate;
		this.freReCheckerNames = freReCheckerNames;
		this.fmeno = fmeno;
		this.fcheckContentViewSn = fcheckContentViewSn;
		this.fcheckContentViewName = fcheckContentViewName;
		this.ffirstCheckMoney = ffirstCheckMoney;
		this.fcheckDepToReCheckDepDate = fcheckDepToReCheckDepDate;
		this.frecheckDepartFirstAmout = frecheckDepartFirstAmout;
		this.fcompleteFuShenTime = fcompleteFuShenTime;
		this.fshenDing = fshenDing;
		this.ftaskCode = ftaskCode;
		this.fendStatus = fendStatus;
		this.projCount = 1;
	}

	// �����Աȱ��õ�,����ɾ
	public TblProject(String fprojectName, Date fdeletegateDate,
			String freReCheckerNames, String fmeno, Long fcheckContentViewSn,
			String fcheckContentViewName, Double ffirstCheckMoney,
			Date fcheckDepToReCheckDepDate, Double frecheckDepartFirstAmout,
			Date fcompleteFuShenTime, Double fshenDing, String ftaskCode,
			Integer fendStatus, String fcurrentJob) {
		super();
		this.fprojectName = fprojectName;
		this.fdeletegateDate = fdeletegateDate;
		this.freReCheckerNames = freReCheckerNames;
		this.fmeno = fmeno;
		this.fcheckContentViewSn = fcheckContentViewSn;
		this.fcheckContentViewName = fcheckContentViewName;
		this.ffirstCheckMoney = ffirstCheckMoney;
		this.fcheckDepToReCheckDepDate = fcheckDepToReCheckDepDate;
		this.frecheckDepartFirstAmout = frecheckDepartFirstAmout;
		this.fcompleteFuShenTime = fcompleteFuShenTime;
		this.fshenDing = fshenDing;
		this.ftaskCode = ftaskCode;
		this.fendStatus = fendStatus;
		this.projCount = 1;
		this.fcurrentJob = fcurrentJob;
	}

	// �˹���̶������õ�,����ɾ
	public TblProject(String fcheckContentViewName) {
		super();
		this.fcheckContentViewName = fcheckContentViewName;
		this.fcheckContentViewSn = 0L;
		this.projCount = 0;
		this.fsongShen = 0.0;
		this.fshenHe = 0.0;
		this.fshenDing = 0.0;
		this.diffCount = 0;// �ԱȽ�����/��
		this.diffCountRate = 0.0;// �ԱȽ�����/����
		this.diffSongShen = 0.0;// �ԱȽ�����/��
		this.diffSongShenRate = 0.0;// �ԱȽ�����/����
		this.diffShenHe = 0.0;// ���յ���˽�����
		this.diffShenHeRate = 0.0;// ���յ���˽�����
		this.diffShenDing = 0.0;
		this.diffShenDingRate = 0.0;
		this.diffHeJianAmount = 0.0;
		this.diffHeJianAmountRate = 0.0;
		this.diffHeJianRate = 0.0;
		this.khpf = 0.00;
		this.shdays = 0;
		this.htdays = 0;
		this.wclv = 0.00;
	}
	
	// �˹����н���������õ�,����ɾ
	public TblProject(String name,Long sn) {
		super();
		this.fprojectName="";
		this.fcheckContentViewName = name;
		this.projCount = 0;
		this.fsongShen = 0.0;
		this.finishCount = 0;
		this.finishSongShen = 0.00;
		this.diffCount = 0;
		this.diffCountRate = 0.0;
		this.diffSongShen = 0.0;
		this.diffSongShenRate = 0.0;
		this.khpf = 0.00;
		this.shdays = 0;
		this.htdays = 0;
		this.wclv = 0.00;
	}

	public String getFid() {
		return this.fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public void setId(String fid) {
		this.fid = fid;
	}

	public String getFflowId() {
		return this.fflowId;
	}

	public void setFflowId(String fflowId) {
		this.fflowId = fflowId;
	}

	public Long getFcreaterSn() {
		return this.fcreaterSn;
	}

	public void setFcreaterSn(Long fcreaterSn) {
		this.fcreaterSn = fcreaterSn;
	}

	public String getFcreaterName() {
		return this.fcreaterName;
	}

	public void setFcreaterName(String fcreaterName) {
		this.fcreaterName = fcreaterName;
	}

	public String getFprojectName() {
		return this.fprojectName;
	}

	public void setFprojectName(String fprojectName) {
		this.fprojectName = fprojectName;
	}

	public String getFcurrentJob() {
		return this.fcurrentJob;
	}

	public void setFcurrentJob(String fcurrentJob) {
		this.fcurrentJob = fcurrentJob;
	}

	public String getFdeletegateOrganize() {
		return this.fdeletegateOrganize;
	}

	public void setFdeletegateOrganize(String fdeletegateOrganize) {
		this.fdeletegateOrganize = fdeletegateOrganize;
	}

	public Long getFcheckDepartmentSn() {
		return this.fcheckDepartmentSn;
	}

	public void setFcheckDepartmentSn(Long fcheckDepartmentSn) {
		this.fcheckDepartmentSn = fcheckDepartmentSn;
	}

	public String getFcheckDepartmentName() {
		return this.fcheckDepartmentName;
	}

	public void setFcheckDepartmentName(String fcheckDepartmentName) {
		this.fcheckDepartmentName = fcheckDepartmentName;
	}

	public Long getFcheckDepartmentManagerSn() {
		return this.fcheckDepartmentManagerSn;
	}

	public void setFcheckDepartmentManagerSn(Long fcheckDepartmentManagerSn) {
		this.fcheckDepartmentManagerSn = fcheckDepartmentManagerSn;
	}

	public String getFcheckDepartmentManagerName() {
		return this.fcheckDepartmentManagerName;
	}

	public void setFcheckDepartmentManagerName(
			String fcheckDepartmentManagerName) {
		this.fcheckDepartmentManagerName = fcheckDepartmentManagerName;
	}

	public Date getFdeletegateDate() {
		return this.fdeletegateDate;
	}


	public void setFdeletegateDate(Date fdeletegateDate) {
		this.fdeletegateDate = fdeletegateDate;
	}

	public Date getFplanEndDate() {
		return this.fplanEndDate;
	}


	public void setFplanEndDate(Date fplanEndDate) {
		this.fplanEndDate = fplanEndDate;
	}

	public String getFcheckerIds() {
		return this.fcheckerIds;
	}

	public void setFcheckerIds(String fcheckerIds) {
		this.fcheckerIds = fcheckerIds;
	}

	public String getFcheckerNames() {
		return this.fcheckerNames;
	}

	public void setFcheckerNames(String fcheckerNames) {
		this.fcheckerNames = fcheckerNames;
	}

	public String getFreCheckerIds() {
		return this.freCheckerIds;
	}

	public void setFreCheckerIds(String freCheckerIds) {
		this.freCheckerIds = freCheckerIds;
	}

	public String getFreCheckerNames() {
		return this.freCheckerNames;
	}

	public void setFreCheckerNames(String freCheckerNames) {
		this.freCheckerNames = freCheckerNames;
	}

	public String getFreReCheckerIds() {
		return this.freReCheckerIds;
	}

	public void setFreReCheckerIds(String freReCheckerIds) {
		this.freReCheckerIds = freReCheckerIds;
	}

	public Long getFcenterLeaderSn() {
		return this.fcenterLeaderSn;
	}

	public void setFcenterLeaderSn(Long fcenterLeaderSn) {
		this.fcenterLeaderSn = fcenterLeaderSn;
	}

	public String getFcenterLeaderName() {
		return this.fcenterLeaderName;
	}

	public void setFcenterLeaderName(String fcenterLeaderName) {
		this.fcenterLeaderName = fcenterLeaderName;
	}

	public Long getFassistantCenterLeaderSn() {
		return this.fassistantCenterLeaderSn;
	}

	public void setFassistantCenterLeaderSn(Long fassistantCenterLeaderSn) {
		this.fassistantCenterLeaderSn = fassistantCenterLeaderSn;
	}

	public String getFassistantCenterLeaderName() {
		return this.fassistantCenterLeaderName;
	}

	public void setFassistantCenterLeaderName(String fassistantCenterLeaderName) {
		this.fassistantCenterLeaderName = fassistantCenterLeaderName;
	}

	public Long getFreReCheckDepartMentLeaderSn() {
		return this.freReCheckDepartMentLeaderSn;
	}

	public void setFreReCheckDepartMentLeaderSn(
			Long freReCheckDepartMentLeaderSn) {
		this.freReCheckDepartMentLeaderSn = freReCheckDepartMentLeaderSn;
	}

	public String getFreReCheckDepartMentLeaderName() {
		return this.freReCheckDepartMentLeaderName;
	}

	public void setFreReCheckDepartMentLeaderName(
			String freReCheckDepartMentLeaderName) {
		this.freReCheckDepartMentLeaderName = freReCheckDepartMentLeaderName;
	}

	public Long getFreceiverSn() {
		return this.freceiverSn;
	}

	public void setFreceiverSn(Long freceiverSn) {
		this.freceiverSn = freceiverSn;
	}

	public String getFreceiverName() {
		return this.freceiverName;
	}

	public void setFreceiverName(String freceiverName) {
		this.freceiverName = freceiverName;
	}

	public Long getFzongHeKeManagerSn() {
		return this.fzongHeKeManagerSn;
	}

	public void setFzongHeKeManagerSn(Long fzongHeKeManagerSn) {
		this.fzongHeKeManagerSn = fzongHeKeManagerSn;
	}

	public String getFzongHeKeManagerName() {
		return this.fzongHeKeManagerName;
	}

	public void setFzongHeKeManagerName(String fzongHeKeManagerName) {
		this.fzongHeKeManagerName = fzongHeKeManagerName;
	}

	public String getFreReCheckerNames() {
		return this.freReCheckerNames;
	}

	public void setFreReCheckerNames(String freReCheckerNames) {
		this.freReCheckerNames = freReCheckerNames;
	}

	public Double getFapplyAmount() {
		return this.fapplyAmount;
	}

	public void setFapplyAmount(Double fapplyAmount) {
		this.fapplyAmount = fapplyAmount;
	}

	public String getFmeno() {
		return this.fmeno;
	}

	public void setFmeno(String fmeno) {
		this.fmeno = fmeno;
	}

	public Integer getFisGreateProject() {
		if (this.fisGreateProject == null) {
			this.fisGreateProject = 0;
		}
		return this.fisGreateProject;
	}

	public void setFisGreateProject(Integer fisGreateProject) {
		this.fisGreateProject = fisGreateProject;
	}

	public Integer getFifHastenHandle() {
		return this.fifHastenHandle;
	}

	public void setFifHastenHandle(Integer fifHastenHandle) {
		this.fifHastenHandle = fifHastenHandle;
	}

	public Integer getFpri() {
		return this.fpri;
	}

	public void setFpri(Integer fpri) {
		this.fpri = fpri;
	}

	public String getFbuildCompanyName() {
		return this.fbuildCompanyName;
	}

	public void setFbuildCompanyName(String fbuildCompanyName) {
		this.fbuildCompanyName = fbuildCompanyName;
	}

	public String getFsecrecyRating() {
		return this.fsecrecyRating;
	}

	public void setFsecrecyRating(String fsecrecyRating) {
		this.fsecrecyRating = fsecrecyRating;
	}

	public Integer getFisPaused() {
		return this.fisPaused;
	}

	public void setFisPaused(Integer fisPaused) {
		this.fisPaused = fisPaused;
	}

	public Integer getFendStatus() {
		return this.fendStatus;
	}

	public void setFendStatus(Integer fendStatus) {
		this.fendStatus = fendStatus;
	}

	public Long getFcheckContentSn() {
		return this.fcheckContentSn;
	}

	public void setCheckContentSn(Long fcheckContentSn) {
		this.fcheckContentSn = fcheckContentSn;
	}

	public void setFcheckContentSn(Long fcheckContentSn) {
		this.fcheckContentSn = fcheckContentSn;
	}

	public String getFcheckContentName() {
		return this.fcheckContentName;
	}

	public void setFcheckContentName(String fcheckContentName) {
		this.fcheckContentName = fcheckContentName;
	}

	public String getFpsName() {
		return this.fpsName;
	}

	public void setFpsName(String fpsName) {
		this.fpsName = fpsName;
	}

	public Integer getFisHistoryProject() {
		return this.fisHistoryProject;
	}

	public void setFisHistoryProject(Integer fisHistoryProject) {
		this.fisHistoryProject = fisHistoryProject;
	}

	public Date getFprojectCreateDate() {
		return this.fprojectCreateDate;
	}

	public void setFprojectCreateDate(Date fprojectCreateDate) {
		this.fprojectCreateDate = fprojectCreateDate;
	}

	public Integer getFauditTimes() {
		return this.fauditTimes;
	}

	public void setFauditTimes(Integer fauditTimes) {
		this.fauditTimes = fauditTimes;
	}

	public String getFleaderOpType() {
		return this.fleaderOpType;
	}

	public void setFleaderOpType(String fleaderOpType) {
		this.fleaderOpType = fleaderOpType;
	}

	public Integer getFisChangeCheckDept() {
		return this.fisChangeCheckDept;
	}

	public void setFisChangeCheckDept(Integer fisChangeCheckDept) {
		this.fisChangeCheckDept = fisChangeCheckDept;
	}

	public Date getFpigeonholeDate() {
		return this.fpigeonholeDate;
	}

	public void setFpigeonholeDate(Date fpigeonholeDate) {
		this.fpigeonholeDate = fpigeonholeDate;
	}

	public String getFhistoryTreeId() {
		return this.fhistoryTreeId;
	}

	public void setFhistoryTreeId(String fhistoryTreeId) {
		this.fhistoryTreeId = fhistoryTreeId;
	}

	public Double getFfirstCheckMoney() {
		return this.ffirstCheckMoney;
	}

	public void setFfirstCheckMoney(Double ffirstCheckMoney) {
		this.ffirstCheckMoney = ffirstCheckMoney;
	}

	public void setFirstCheckMoney(BigDecimal firstCheckMoney) {
		this.ffirstCheckMoney = firstCheckMoney.doubleValue();
	}

	public Double getFreCheckMoney() {
		return this.freCheckMoney;
	}

	public void setFreCheckMoney(Double freCheckMoney) {
		this.freCheckMoney = freCheckMoney;
	}

	public Date getFcheckDepToReCheckDepDate() {
		return this.fcheckDepToReCheckDepDate;
	}

	public void setFcheckDepToReCheckDepDate(Date fcheckDepToReCheckDepDate) {
		this.fcheckDepToReCheckDepDate = fcheckDepToReCheckDepDate;
	}

	public Double getFrecheckDepartFirstAmout() {
		return this.frecheckDepartFirstAmout;
	}

	public void setFrecheckDepartFirstAmout(BigDecimal recheckDepartFirstAmout) {
		this.frecheckDepartFirstAmout = recheckDepartFirstAmout.doubleValue();
	}

	public void setFrecheckDepartFirstAmout(Double frecheckDepartFirstAmout) {
		this.frecheckDepartFirstAmout = frecheckDepartFirstAmout;
	}

	public void setRecheckDepartFirstAmout(BigDecimal recheckDepartFirstAmout) {
		if (recheckDepartFirstAmout != null) {
			this.frecheckDepartFirstAmout = recheckDepartFirstAmout
					.doubleValue();
		}

	}

	public Date getFcompleteFuShenTime() {
		return this.fcompleteFuShenTime;
	}

	public void setFcompleteFuShenTime(Date fcompleteFuShenTime) {
		this.fcompleteFuShenTime = fcompleteFuShenTime;
	}

	public Double getFsongShen() {
		return this.fsongShen;
	}

	public void setFsongShen(Double fsongShen) {
		this.fsongShen = fsongShen;
	}

	public void setSongShen(BigDecimal fsongShen) {
		this.fsongShen = fsongShen.doubleValue();
	}

	public Double getFshenHe() {
		return this.fshenHe;
	}

	public void setFshenHe(Double fshenHe) {
		this.fshenHe = fshenHe;
	}

	public void setShenHe(BigDecimal fshenHe) {
		this.fshenHe = fshenHe.doubleValue();
	}

	public Double getFshenDing() {
		return this.fshenDing;
	}

	public void setFshenDing(Double fshenDing) {
		this.fshenDing = fshenDing;
	}

	public void setShenDing(BigDecimal fshenDing) {
		this.fshenDing = fshenDing.doubleValue();
	}

	public Date getFtaskDingAnTianXieDate() {
		return this.ftaskDingAnTianXieDate;
	}

	public void setFtaskDingAnTianXieDate(Date ftaskDingAnTianXieDate) {
		this.ftaskDingAnTianXieDate = ftaskDingAnTianXieDate;
	}

	public String getFfawengaoNo() {
		return this.ffawengaoNo;
	}

	public void setFfawengaoNo(String ffawengaoNo) {
		this.ffawengaoNo = ffawengaoNo;
	}

	public String getFtaskCode() {
		return this.ftaskCode;
	}

	public void setFtaskCode(String ftaskCode) {
		this.ftaskCode = ftaskCode;
	}

	public String getFnewJobId() {
		return this.fnewJobId;
	}

	public void setFnewJobId(String fnewJobId) {
		this.fnewJobId = fnewJobId;
	}

	public Integer getFnewJobStatus() {
		return this.fnewJobStatus;
	}

	public void setFnewJobStatus(Integer fnewJobStatus) {
		this.fnewJobStatus = fnewJobStatus;
	}

	public String getFcheckItems() {
		return fcheckItems;
	}

	public void setFcheckItems(String fcheckItems) {
		this.fcheckItems = fcheckItems;
	}

	public Date getFcheckCompareDate() {
		return fcheckCompareDate;
	}

	public void setFcheckCompareDate(Date fcheckCompareDate) {
		this.fcheckCompareDate = fcheckCompareDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getMiniJobId() {
		return miniJobId;
	}

	public void setMiniJobId(String miniJobId) {
		this.miniJobId = miniJobId;
	}

	public Integer getFisCenterBack() {
		return fisCenterBack;
	}

	public void setFisCenterBack(Integer fisCenterBack) {
		this.fisCenterBack = fisCenterBack;
	}

	public Date getFsheHeDate() {
		return fsheHeDate;
	}

	public void setFsheHeDate(Date fsheHeDate) {
		this.fsheHeDate = fsheHeDate;
	}

	public String getFcheckItemsName() {
		return fcheckItemsName;
	}

	public void setFcheckItemsName(String fcheckItemsName) {
		this.fcheckItemsName = fcheckItemsName;
	}

	/**
	 * @param fawardMax
	 *            the fawardMax to set
	 */
	public void setAwardMax(BigDecimal fawardMax) {
		this.fawardMax = fawardMax.doubleValue();
	}

	/**
	 * @param fawardMin
	 *            the fawardMin to set
	 */
	public void setAwardMin(BigDecimal fawardMin) {
		this.fawardMin = fawardMin.doubleValue();
	}

	/**
	 * @param fawardRate
	 *            the fawardRate to set
	 */
	public void setAwardRate(BigDecimal fawardRate) {
		this.fawardRate = fawardRate.doubleValue();
	}

	/**
	 * @param fbasicMax
	 *            the fbasicMax to set
	 */
	public void setBasicMax(BigDecimal fbasicMax) {
		this.fbasicMax = fbasicMax.doubleValue();
	}

	/**
	 * @param fbasicMin
	 *            the fbasicMin to set
	 */
	public void setBasicMin(BigDecimal fbasicMin) {
		this.fbasicMin = fbasicMin.doubleValue();
	}

	/**
	 * @param fbasicRate
	 *            the fbasicRate to set
	 */
	public void setBasicRate(BigDecimal fbasicRate) {
		this.fbasicRate = fbasicRate.doubleValue();
	}

	/**
	 * @return the fawardMax
	 */
	public Double getFawardMax() {
		return fawardMax;
	}

	/**
	 * @param fawardMax
	 *            the fawardMax to set
	 */
	public void setFawardMax(Double fawardMax) {
		this.fawardMax = fawardMax;
	}

	/**
	 * @return the fawardMin
	 */
	public Double getFawardMin() {
		return fawardMin;
	}

	/**
	 * @param fawardMin
	 *            the fawardMin to set
	 */
	public void setFawardMin(Double fawardMin) {
		this.fawardMin = fawardMin;
	}

	/**
	 * @return the fawardRate
	 */
	public Double getFawardRate() {
		return fawardRate;
	}

	/**
	 * @param fawardRate
	 *            the fawardRate to set
	 */
	public void setFawardRate(Double fawardRate) {
		this.fawardRate = fawardRate;
	}

	/**
	 * @return the fbasicMax
	 */
	public Double getFbasicMax() {
		return fbasicMax;
	}

	/**
	 * @param fbasicMax
	 *            the fbasicMax to set
	 */
	public void setFbasicMax(Double fbasicMax) {
		this.fbasicMax = fbasicMax;
	}

	/**
	 * @return the fbasicMin
	 */
	public Double getFbasicMin() {
		return fbasicMin;
	}

	/**
	 * @param fbasicMin
	 *            the fbasicMin to set
	 */
	public void setFbasicMin(Double fbasicMin) {
		this.fbasicMin = fbasicMin;
	}

	/**
	 * @return the fbasicRate
	 */
	public Double getFbasicRate() {
		return fbasicRate;
	}

	/**
	 * @param fbasicRate
	 *            the fbasicRate to set
	 */
	public void setFbasicRate(Double fbasicRate) {
		this.fbasicRate = fbasicRate;
	}

	/**
	 * @return the diffCount
	 */
	public Integer getDiffCount() {
		return diffCount;
	}

	/**
	 * @param diffCount
	 *            the diffCount to set
	 */
	public void setDiffCount(Integer diffCount) {
		this.diffCount = diffCount;
	}

	/**
	 * @return the diffCountRate
	 */
	public Double getDiffCountRate() {
		return diffCountRate;
	}

	/**
	 * @param diffCountRate
	 *            the diffCountRate to set
	 */
	public void setDiffCountRate(Double diffCountRate) {
		this.diffCountRate = diffCountRate;
	}

	/**
	 * @return the diffSongShen
	 */
	public Double getDiffSongShen() {
		return diffSongShen;
	}

	/**
	 * @param diffSongShen
	 *            the diffSongShen to set
	 */
	public void setDiffSongShen(Double diffSongShen) {
		this.diffSongShen = diffSongShen;
	}

	/**
	 * @return the diffSongShenRate
	 */
	public Double getDiffSongShenRate() {
		return diffSongShenRate;
	}

	/**
	 * @param diffSongShenRate
	 *            the diffSongShenRate to set
	 */
	public void setDiffSongShenRate(Double diffSongShenRate) {
		this.diffSongShenRate = diffSongShenRate;
	}

	/**
	 * @return the diffHeJianRate
	 */
	public Double getDiffHeJianRate() {
		return diffHeJianRate;
	}

	/**
	 * @param diffHeJianRate
	 *            the diffHeJianRate to set
	 */
	public void setDiffHeJianRate(Double diffHeJianRate) {
		this.diffHeJianRate = diffHeJianRate;
	}

	/**
	 * @return the diffShenDing
	 */
	public Double getDiffShenDing() {
		return diffShenDing;
	}

	/**
	 * @param diffShenDing
	 *            the diffShenDing to set
	 */
	public void setDiffShenDing(Double diffShenDing) {
		this.diffShenDing = diffShenDing;
	}

	/**
	 * @return the diffShenDingRate
	 */
	public Double getDiffShenDingRate() {
		return diffShenDingRate;
	}

	/**
	 * @param diffShenDingRate
	 *            the diffShenDingRate to set
	 */
	public void setDiffShenDingRate(Double diffShenDingRate) {
		this.diffShenDingRate = diffShenDingRate;
	}

	/**
	 * @return the diffShenHe
	 */
	public Double getDiffShenHe() {
		return diffShenHe;
	}

	/**
	 * @param diffShenHe
	 *            the diffShenHe to set
	 */
	public void setDiffShenHe(Double diffShenHe) {
		this.diffShenHe = diffShenHe;
	}

	/**
	 * @return the diffShenHeRate
	 */
	public Double getDiffShenHeRate() {
		return diffShenHeRate;
	}

	/**
	 * @param diffShenHeRate
	 *            the diffShenHeRate to set
	 */
	public void setDiffShenHeRate(Double diffShenHeRate) {
		this.diffShenHeRate = diffShenHeRate;
	}

	/**
	 * @return the diffHeJianAmount
	 */
	public Double getDiffHeJianAmount() {
		return diffHeJianAmount;
	}

	/**
	 * @param diffHeJianAmount
	 *            the diffHeJianAmount to set
	 */
	public void setDiffHeJianAmount(Double diffHeJianAmount) {
		this.diffHeJianAmount = diffHeJianAmount;
	}

	/**
	 * @return the diffHeJianAmountRate
	 */
	public Double getDiffHeJianAmountRate() {
		return diffHeJianAmountRate;
	}

	/**
	 * @param diffHeJianAmountRate
	 *            the diffHeJianAmountRate to set
	 */
	public void setDiffHeJianAmountRate(Double diffHeJianAmountRate) {
		this.diffHeJianAmountRate = diffHeJianAmountRate;
	}

	public String getFjieShouRen() {
		return fjieShouRen;
	}

	public void setFjieShouRen(String fjieShouRen) {
		this.fjieShouRen = fjieShouRen;
	}

	public Date getFjieShouRiQi() {
		return fjieShouRiQi;
	}

	public void setFjieShouRiQi(Date fjieShouRiQi) {
		this.fjieShouRiQi = fjieShouRiQi;
	}

	public String getFyiJiaoRen() {
		return fyiJiaoRen;
	}

	public void setFyiJiaoRen(String fyiJiaoRen) {
		this.fyiJiaoRen = fyiJiaoRen;
	}

	public Date getFyiJiaoRiQi() {
		return fyiJiaoRiQi;
	}

	public void setFyiJiaoRiQi(Date fyiJiaoRiQi) {
		this.fyiJiaoRiQi = fyiJiaoRiQi;
	}

	public String getContentColor() {
		return contentColor;
	}

	public void setContentColor(String contentColor) {
		this.contentColor = contentColor;
	}

	public String getTitleTip() {
		return titleTip;
	}

	public void setTitleTip(String titleTip) {
		this.titleTip = titleTip;
	}

	public String getFhuiBaiIds() {
		return fhuiBaiIds;
	}

	public void setFhuiBaiIds(String fhuiBaiIds) {
		this.fhuiBaiIds = fhuiBaiIds;
	}

	public String getFhuiBaiNames() {
		return fhuiBaiNames;
	}

	public void setFhuiBaiNames(String fhuiBaiNames) {
		this.fhuiBaiNames = fhuiBaiNames;
	}

	public Long getFshenheType() {
		return fshenheType;
	}

	public void setFshenheType(Long fshenheType) {
		this.fshenheType = fshenheType;
	}

	public String getFshenheZhuanGuanYuanIds() {
		return fshenheZhuanGuanYuanIds;
	}

	public void setFshenheZhuanGuanYuanIds(String fshenheZhuanGuanYuanIds) {
		this.fshenheZhuanGuanYuanIds = fshenheZhuanGuanYuanIds;
	}

	public String getFshenheZhuanGuanYuanNames() {
		return fshenheZhuanGuanYuanNames;
	}

	public void setFshenheZhuanGuanYuanNames(String fshenheZhuanGuanYuanNames) {
		this.fshenheZhuanGuanYuanNames = fshenheZhuanGuanYuanNames;
	}

	public int getCurrentUserIsCenterZhuRen() {
		return currentUserIsCenterZhuRen;
	}

	public void setCurrentUserIsCenterZhuRen(int currentUserIsCenterZhuRen) {
		this.currentUserIsCenterZhuRen = currentUserIsCenterZhuRen;
	}

	public int getCurrentUserIsCheckDptMan() {
		return currentUserIsCheckDptMan;
	}

	public void setCurrentUserIsCheckDptMan(int currentUserIsCheckDptMan) {
		this.currentUserIsCheckDptMan = currentUserIsCheckDptMan;
	}

	public int getCurrentUserIsReRechecker() {
		return currentUserIsReRechecker;
	}

	public void setCurrentUserIsReRechecker(int currentUserIsReRechecker) {
		this.currentUserIsReRechecker = currentUserIsReRechecker;
	}

	public int getCurrentUserIsReRecheckMan() {
		return currentUserIsReRecheckMan;
	}

	public void setCurrentUserIsReRecheckMan(int currentUserIsReRecheckMan) {
		this.currentUserIsReRecheckMan = currentUserIsReRecheckMan;
	}

	public Long getFcooperatorSn() {
		return fcooperatorSn;
	}

	public void setFcooperatorSn(Long fcooperatorSn) {
		this.fcooperatorSn = fcooperatorSn;
	}

	public Integer getFifdd() {
		return fifdd;
	}

	public void setFifdd(Integer fifdd) {
		this.fifdd = fifdd;
	}

	public Double getAwardCount() {
		return awardCount;
	}

	public void setAwardCount(Double awardCount) {
		this.awardCount = awardCount;
	}

	public Double getBasicCount() {
		return basicCount;
	}

	public void setBasicCount(Double basicCount) {
		this.basicCount = basicCount;
	}

	public Double getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Double totalCount) {
		this.totalCount = totalCount;
	}

	public Date getFplanFinishDate() {
		return fplanFinishDate;
	}

	public void setFplanFinishDate(Date fplanFinishDate) {
		this.fplanFinishDate = fplanFinishDate;
	}

	public String getFshouLiCode() {
		return fshouLiCode;
	}

	public void setFshouLiCode(String fshouLiCode) {
		this.fshouLiCode = fshouLiCode;
	}

	public Date getFnewProjectDate() {
		return fnewProjectDate;
	}

	public void setFnewProjectDate(Date fnewProjectDate) {
		this.fnewProjectDate = fnewProjectDate;
	}

	public Integer getFpoint() {
		return fpoint;
	}

	public void setFpoint(Integer fpoint) {
		this.fpoint = fpoint;
	}

	public Integer getFisDelete() {
		return fisDelete;
	}

	public void setFisDelete(Integer fisDelete) {
		this.fisDelete = fisDelete;
	}

	public Integer getFappId() {
		return fappId;
	}

	public void setFappId(Integer fappId) {
		this.fappId = fappId;
	}

	public String getFappName() {
		return fappName;
	}

	public void setFappName(String fappName) {
		this.fappName = fappName;
	}

	public Long getFcheckContentViewSn() {
		return fcheckContentViewSn;
	}

	public void setFcheckContentViewSn(Long fcheckContentViewSn) {
		this.fcheckContentViewSn = fcheckContentViewSn;
	}

	public void setCheckContentViewSn(Long checkContentViewSn) {
		if(checkContentViewSn != null && checkContentViewSn > 0){
			this.fcheckContentViewSn = checkContentViewSn;
		}else{
			this.fcheckContentViewSn = -1L;
		}
	}

	public String getFcheckContentViewName() {
		return fcheckContentViewName;
	}

	public void setFcheckContentViewName(String fcheckContentViewName) {
		this.fcheckContentViewName = fcheckContentViewName;
	}

	public Integer getFround() {
		return fround;
	}

	public void setFround(Integer fround) {
		this.fround = fround;
	}

	public Integer getFbatch() {
		return fbatch;
	}

	public void setFbatch(Integer fbatch) {
		this.fbatch = fbatch;
	}

	public Integer getFisFiddOrDelete() {
		return fisFiddOrDelete;
	}

	public void setFisFiddOrDelete(Integer fisFiddOrDelete) {
		this.fisFiddOrDelete = fisFiddOrDelete;
	}

	public Date getFshouLiDate() {
		return fshouLiDate;
	}

	public void setFshouLiDate(Date fshouLiDate) {
		this.fshouLiDate = fshouLiDate;
	}

	public Date getFdaiDingDate() {
		return fdaiDingDate;
	}

	public void setFdaiDingDate(Date fdaiDingDate) {
		this.fdaiDingDate = fdaiDingDate;
	}

	public int getCurrentUserIsRechecker() {
		return currentUserIsRechecker;
	}

	public void setCurrentUserIsRechecker(int currentUserIsRechecker) {
		this.currentUserIsRechecker = currentUserIsRechecker;
	}

	public int getCurrentUserIsCenterFuZhuRen() {
		return currentUserIsCenterFuZhuRen;
	}

	public void setCurrentUserIsCenterFuZhuRen(int currentUserIsCenterFuZhuRen) {
		this.currentUserIsCenterFuZhuRen = currentUserIsCenterFuZhuRen;
	}

	public Integer getIsDanduWt() {
		return isDanduWt;
	}

	public void setIsDanduWt(Integer isDanduWt) {
		this.isDanduWt = isDanduWt;
	}

	public Integer getIsZhuanXiangSh() {
		return isZhuanXiangSh;
	}

	public void setIsZhuanXiangSh(Integer isZhuanXiangSh) {
		this.isZhuanXiangSh = isZhuanXiangSh;
	}



	public String getFlockState() {
		return flockState;
	}

	public void setFlockState(String flockState) {
		this.flockState = flockState;
	}

	public Integer getFifOpen() {
		return fifOpen;
	}

	public void setFifOpen(Integer fifOpen) {
		this.fifOpen = fifOpen;
	}

	public String getFminiJobUserName() {
		return fminiJobUserName;
	}

	public void setFminiJobUserName(String fminiJobUserName) {
		this.fminiJobUserName = fminiJobUserName;
	}

	public Integer getFifFreeFaWenGaoNumber() {
		return fifFreeFaWenGaoNumber;
	}

	public void setFifFreeFaWenGaoNumber(Integer fifFreeFaWenGaoNumber) {
		this.fifFreeFaWenGaoNumber = fifFreeFaWenGaoNumber;
	}

	public Integer getFifFreezeFuHeYiJianBiao() {
		return fifFreezeFuHeYiJianBiao;
	}

	public void setFifFreezeFuHeYiJianBiao(Integer fifFreezeFuHeYiJianBiao) {
		this.fifFreezeFuHeYiJianBiao = fifFreezeFuHeYiJianBiao;
	}

	public Integer getFifFreezeFuShenYiJianBiao() {
		return fifFreezeFuShenYiJianBiao;
	}

	public void setFifFreezeFuShenYiJianBiao(Integer fifFreezeFuShenYiJianBiao) {
		this.fifFreezeFuShenYiJianBiao = fifFreezeFuShenYiJianBiao;
	}

	public Integer getFleaderSaveId() {
		return fleaderSaveId;
	}

	public void setFleaderSaveId(Integer fleaderSaveId) {
		this.fleaderSaveId = fleaderSaveId;
	}

	/**
	 * @return the childen
	 */
	public Collection<TblProject> getChilden() {
		return childen;
	}

	public Double getFheJian() {
		return this.getFshenHe() - this.getFshenDing();
	}

	public void setFheJian(Double fheJian) {
		this.fheJian = fheJian;
	}

	public Double getFheZeng() {
		return getFheJian() * -1;
	}

	public void setFheZeng(Double fheZeng) {
		this.fheZeng = fheZeng;
	}

	/**
	 * @param childen
	 *            the childen to set
	 */
	public void setChilden(Collection<TblProject> childen) {
		this.childen = childen;
	}

	/**
	 * @return the award
	 */
	public Double getAward() {
		if (heJianAmount != null && heJianAmount > 0 && fawardRate != null
				&& fawardRate > 0) {
			award = heJianAmount * fawardRate / 1000;
			if (fawardMin != null && award < fawardMin) {
				award = fawardMin;
			}
			if (fawardMax != null && award > fawardMax) {
				award = fawardMax;
			}
		} else {
			award = fawardMin;
		}
		return award;
	}

	/**
	 * @return the basic
	 */
	public Double getBasic() {
		if (fsongShen != null && fsongShen > 0 && fbasicRate != null
				&& fbasicRate > 0) {
			basic = fsongShen * fbasicRate / 1000;
			if (fbasicMin != null && basic < fbasicMin) {
				basic = fbasicMin;
			}
			if (fbasicMax != null && basic > fbasicMax) {
				basic = fbasicMax;
			}
		} else {
			basic = fbasicMin;
		}
		return basic;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		/*
		 * if(award!=null) total=total+award; if(basic!=null) total=total+basic;
		 */
		total = this.getAward() + this.getBasic();
		return total;
	}

	/**
	 * @return the projCount
	 */
	public Integer getProjCount() {
		return projCount;
	}

	/**
	 * @param projCount
	 *            the projCount to set
	 */
	public void setProjCount(Integer projCount) {
		this.projCount = projCount;
	}

	public TblProject clone() {
		try {
			return (TblProject) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * @return the heJianAmount
	 */
	public Double getHeJianAmount() {
		if (fshenHe != null && fshenDing != null) {
			heJianAmount = fshenHe - fshenDing;
		} else {
			heJianAmount = 0.0;
		}
		return heJianAmount;
	}

	/**
	 * @param heJianAmount
	 *            the heJianAmount to set
	 */
	public void setHeJianAmount(Double heJianAmount) {
		this.heJianAmount = heJianAmount;
	}

	/**
	 * @return the heJianRate
	 */
	public Double getHeJianRate() {
		Double temp = getHeJianAmount();
		if (temp == 0.0) {
			return 0.0;
		} else if (fshenHe == 0.0) {
			return 0.0;
		} else {
			heJianRate = temp / fshenHe;
//			System.out.println("��˽��:"+fshenHe+ "  �˼��"+temp + "  �˼��ʣ�"+heJianRate * 100 + "%");
			return heJianRate;
		}
	}

	/**
	 * @param heJianRate
	 *            the heJianRate to set
	 */
	public void setHeJianRate(Double heJianRate) {
		this.heJianRate = heJianRate;
	}

	public Double getYeWuKeShenDingMoney() {
		return yeWuKeShenDingMoney;
	}

	public void setYeWuKeShenDingMoney(Double yeWuKeShenDingMoney) {
		this.yeWuKeShenDingMoney = yeWuKeShenDingMoney;
	}

	public Date getFendDate() {
		return fendDate;
	}


	public void setFendDate(Date fendDate) {
		this.fendDate = fendDate;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Long getShenheNum() {
		return shenheNum;
	}

	public void setShenheNum(Long shenheNum) {
		this.shenheNum = shenheNum;
	}


	public Integer getFmenuType() {
		return fmenuType;
	}

	public void setFmenuType(Integer fmenuType) {
		this.fmenuType = fmenuType;
	}

	public Integer getFplanFinishDays() {
		return fplanFinishDays;
	}

	public void setFplanFinishDays(Integer fplanFinishDays) {
		this.fplanFinishDays = fplanFinishDays;
	}

	public Date getFleaderAuditTime() {
		return fleaderAuditTime;
	}

	public void setFleaderAuditTime(Date fleaderAuditTime) {
		this.fleaderAuditTime = fleaderAuditTime;
	}
	

	public Double getFfirstReCheckMoney() {
		return ffirstReCheckMoney;
	}

	public void setFfirstReCheckMoney(Double ffirstReCheckMoney) {
		this.ffirstReCheckMoney = ffirstReCheckMoney;
	}
	
	public String getFroundName() {
		return froundName;
	}

	public void setFroundName(String froundName) {
		this.froundName = froundName;
	}
	
	public String getFzhuanXiangSh() {
		return fzhuanXiangSh;
	}

	public void setFzhuanXiangSh(String fzhuanXiangSh) {
		this.fzhuanXiangSh = fzhuanXiangSh;
	}

	public Date getFweiTuoZhongjieTime() {
		return fweiTuoZhongjieTime;
	}

	public void setFweiTuoZhongjieTime(Date fweiTuoZhongjieTime) {
		this.fweiTuoZhongjieTime = fweiTuoZhongjieTime;
	}

	public String getFauditKey() {
		return fauditKey;
	}

	public void setFauditKey(String fauditKey) {
		this.fauditKey = fauditKey;
	}

	public Integer getFisSignHeTong() {
		return fisSignHeTong;
	}

	public void setFisSignHeTong(Integer fisSignHeTong) {
		this.fisSignHeTong = fisSignHeTong;
	}

	public Integer getFisRandomFuShen() {
		return fisRandomFuShen;
	}

	public void setFisRandomFuShen(Integer fisRandomFuShen) {
		this.fisRandomFuShen = fisRandomFuShen;
	}

	public Integer getFinishCount() {
		return finishCount;
	}

	public void setFinishCount(Integer finishCount) {
		this.finishCount = finishCount;
	}

	public Double getFinishSongShen() {
		return finishSongShen;
	}

	public void setFinishSongShen(Double finishSongShen) {
		this.finishSongShen = finishSongShen;
	}

	public Double getKhpf() {
		return khpf;
	}

	public void setKhpf(Double khpf) {
		this.khpf = khpf;
	}

	public Integer getShdays() {
		return shdays;
	}

	public void setShdays(Integer shdays) {
		this.shdays = shdays;
	}

	public Double getWclv() {
		return wclv;
	}

	public void setWclv(Double wclv) {
		this.wclv = wclv;
	}

	public Integer getHtdays() {
		return htdays;
	}

	public void setHtdays(Integer htdays) {
		this.htdays = htdays;
	}

	public List<TblProject> getChildens() {
		return childens;
	}

	public void setChildens(List<TblProject> childens) {
		this.childens = childens;
	}

	public Double getAvgkhpf() {
		return avgkhpf;
	}

	public void setAvgkhpf(Double avgkhpf) {
		this.avgkhpf = avgkhpf;
	}

	public Integer getFinishYear() {
		return finishYear;
	}

	public void setFinishYear(Integer finishYear) {
		this.finishYear = finishYear;
	}

	public Integer getFinishSeasion() {
		return finishSeasion;
	}

	public void setFinishSeasion(Integer finishSeasion) {
		this.finishSeasion = finishSeasion;
	}

	public Integer getFisLeaderCheck() {
		return fisLeaderCheck;
	}

	public void setFisLeaderCheck(Integer fisLeaderCheck) {
		this.fisLeaderCheck = fisLeaderCheck;
	}

	public Integer getFisImportent() {
		return fisImportent;
	}

	public void setFisImportent(Integer fisImportent) {
		this.fisImportent = fisImportent;
	}

	public Date getfContractDate() {
		return fContractDate;
	}

	public void setfContractDate(Date fContractDate) {
		this.fContractDate = fContractDate;
	}

	public String getfContractNumber() {
		return fContractNumber;
	}

	public void setfContractNumber(String fContractNumber) {
		this.fContractNumber = fContractNumber;
	}

	public Double getWuchaRate() {
		Double temp = getWuchaAmount();
		if(temp == 0.0){
			return 0.0;
		}else if(fshenDing == 0.0){
			return 0.0;
		}else{
			wuchaRate = temp / fshenDing;
			return wuchaRate;
		}
//		return 0.25;
	}

	public void setWuchaRate(Double wuchaRate) {
		this.wuchaRate = wuchaRate;
	}

	public Double getWuchaAmount() {
		if(ffirstReCheckMoney != null && fshenDing != null){
			this.wuchaAmount = ffirstReCheckMoney - fshenDing;
		}else{
			this.wuchaAmount = 0.0;
		}
		return wuchaAmount;
	}

	public void setWuchaAmount(Double wuchaAmount) {
		this.wuchaAmount = wuchaAmount;
	}
	
	public Date getFdeleteDate() {
		return fdeleteDate;
	}

	public void setFdeleteDate(Date fdeleteDate) {
		this.fdeleteDate = fdeleteDate;
	}

	public String getFweituoZJCode() {
		return fweituoZJCode;
	}

	public void setFweituoZJCode(String fweituoZJCode) {
		this.fweituoZJCode = fweituoZJCode;
	}

	public Date getFrequireDuiShuTime() {
		return frequireDuiShuTime;
	}

	public void setFrequireDuiShuTime(Date frequireDuiShuTime) {
		this.frequireDuiShuTime = frequireDuiShuTime;
	}

	public Integer getFdelayDays() {
		return fdelayDays;
	}

	public void setFdelayDays(Integer fdelayDays) {
		this.fdelayDays = fdelayDays;
	}

	public Boolean getFisdelay() {
		return fisdelay;
	}

	public void setFisdelay(Boolean fisdelay) {
		this.fisdelay = fisdelay;
	}

	public Double getFyuFuKuan() {
		return fyuFuKuan;
	}

	public void setFyuFuKuan(Double fyuFuKuan) {
		this.fyuFuKuan = fyuFuKuan;
	}

	public Date getFfuKuanDate() {
		return ffuKuanDate;
	}

	public void setFfuKuanDate(Date ffuKuanDate) {
		this.ffuKuanDate = ffuKuanDate;
	}

	public Integer getFyuQiDays() {
		return fyuQiDays;
	}

	public void setFyuQiDays(Integer fyuQiDays) {
		this.fyuQiDays = fyuQiDays;
	}

	public Double getFwuChaLv() {
		return fwuChaLv;
	}

	public void setFwuChaLv(Double fwuChaLv) {
		this.fwuChaLv = fwuChaLv;
	}

	public Double getFyuQiKouKuan() {
		return fyuQiKouKuan;
	}

	public void setFyuQiKouKuan(Double fyuQiKouKuan) {
		this.fyuQiKouKuan = fyuQiKouKuan;
	}

	public Double getFwuChaLvKouFa() {
		return fwuChaLvKouFa;
	}

	public void setFwuChaLvKouFa(Double fwuChaLvKouFa) {
		this.fwuChaLvKouFa = fwuChaLvKouFa;
	}

	public Double getFweiKuan() {
		return fweiKuan;
	}

	public void setFweiKuan(Double fweiKuan) {
		this.fweiKuan = fweiKuan;
	}

	public Date getFfuKuanDate2() {
		return ffuKuanDate2;
	}

	public void setFfuKuanDate2(Date ffuKuanDate2) {
		this.ffuKuanDate2 = ffuKuanDate2;
	}

	public Double getFjsShenHeFei() {
		return fjsShenHeFei;
	}

	public void setFjsShenHeFei(Double fjsShenHeFei) {
		this.fjsShenHeFei = fjsShenHeFei;
	}

	public Double getFsjShenHeFei() {
		return fsjShenHeFei;
	}

	public void setFsjShenHeFei(Double fsjShenHeFei) {
		this.fsjShenHeFei = fsjShenHeFei;
	}

	public String getFbankNumber() {
		return fbankNumber;
	}

	public void setFbankNumber(String fbankNumber) {
		this.fbankNumber = fbankNumber;
	}

	public Integer getFwhoseTurn() {
		return fwhoseTurn;
	}

	public void setFwhoseTurn(Integer fwhoseTurn) {
		this.fwhoseTurn = fwhoseTurn;
	}

	public Integer getFisExportFinished() {
		return fisExportFinished;
	}

	public void setFisExportFinished(Integer fisExportFinished) {
		this.fisExportFinished = fisExportFinished;
	}

	public Long getFsort() {
		return fsort;
	}

	public void setFsort(Long fsort) {
		this.fsort = fsort;
	}

	public String getFlxProjectId() {
		return flxProjectId;
	}

	public void setFlxProjectId(String flxProjectId) {
		this.flxProjectId = flxProjectId;
	}

	public String getFlxProjectName() {
		return flxProjectName;
	}

	public void setFlxProjectName(String flxProjectName) {
		this.flxProjectName = flxProjectName;
	}

	public String getfManagerDepName() {
		return fManagerDepName;
	}

	public void setfManagerDepName(String fManagerDepName) {
		this.fManagerDepName = fManagerDepName;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getfManagerDepSn() {
		return fManagerDepSn;
	}

	public void setfManagerDepSn(String fManagerDepSn) {
		this.fManagerDepSn = fManagerDepSn;
	}

	public Integer getFentrustFsn() {
		return fentrustFsn;
	}

	public void setFentrustFsn(Integer fentrustFsn) {
		this.fentrustFsn = fentrustFsn;
	}

	public Boolean getFisYingji() {
		return fisYingji;
	}

	public void setFisYingji(Boolean fisYingji) {
		this.fisYingji = fisYingji;
	}

	public Date getFbaosongDate1() {
		return fbaosongDate1;
	}

	public void setFbaosongDate1(Date fbaosongDate1) {
		this.fbaosongDate1 = fbaosongDate1;
	}

	public Date getFbaosongDate2() {
		return fbaosongDate2;
	}

	public void setFbaosongDate2(Date fbaosongDate2) {
		this.fbaosongDate2 = fbaosongDate2;
	}

	public Date getFbaosongDate3() {
		return fbaosongDate3;
	}

	public void setFbaosongDate3(Date fbaosongDate3) {
		this.fbaosongDate3 = fbaosongDate3;
	}

	public String getFbuildCompanySn() {
		return fbuildCompanySn;
	}

	public void setFbuildCompanySn(String fbuildCompanySn) {
		this.fbuildCompanySn = fbuildCompanySn;
	}

	public String getFsongshenTaskCode() {
		return fsongshenTaskCode;
	}

	public void setFsongshenTaskCode(String fsongshenTaskCode) {
		this.fsongshenTaskCode = fsongshenTaskCode;
	}

	public String getFcreateRoleCode() {
		return fcreateRoleCode;
	}

	public void setFcreateRoleCode(String fcreateRoleCode) {
		this.fcreateRoleCode = fcreateRoleCode;
	}

	public String getFsongShenDaXie() {
		return fsongShenDaXie;
	}

	public void setFsongShenDaXie(String fsongShenDaXie) {
		this.fsongShenDaXie = fsongShenDaXie;
	}

	public String getFshenHeDaXie() {
		return fshenHeDaXie;
	}

	public void setFshenHeDaXie(String fshenHeDaXie) {
		this.fshenHeDaXie = fshenHeDaXie;
	}

	public String getFshenDingDaXie() {
		return fshenDingDaXie;
	}

	public void setFshenDingDaXie(String fshenDingDaXie) {
		this.fshenDingDaXie = fshenDingDaXie;
	}

	public String getFheJianDaXie() {
		return fheJianDaXie;
	}

	public void setFheJianDaXie(String fheJianDaXie) {
		this.fheJianDaXie = fheJianDaXie;
	}

	public String getFheZengDaXie() {
		return fheZengDaXie;
	}

	public void setFheZengDaXie(String fheZengDaXie) {
		this.fheZengDaXie = fheZengDaXie;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public void setAward(Double award) {
		this.award = award;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
}