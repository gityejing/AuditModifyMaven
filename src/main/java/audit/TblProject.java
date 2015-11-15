package audit;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
public class TblProject implements java.io.Serializable, Cloneable {
	// Fields
	private String fid; // 项目编号
	private String flxProjectId;// 关联审核项目
	private String flxProjectName;//审核项目名称
	private String fauditKey;//对接唯一编码
	private Integer fappId; // 所属流程
	private String fappName; // 流程名称
	private String fflowId; // 流程实例编号
	private String fprojectName; // 项目名称
	private String fcurrentJob; // 当前工作
	
	private String fsongshenTaskCode;// 送审任务编号

	// 建设单位创建人
	private String fbuildCompanySn;// 建设单位id
	private String fbuildCompanyName; // 建设单位
	
	private Long fcreaterSn; // 项目创建人（以前是收件员，现在是建设单位）
	private String fcreaterName; // 项目创建人名称
	private String fcreateRoleCode;// 创建人的角色（建设单位，主管单位，业务处室都有可能发起评审任务）

	// 归口处室
	private String fdeletegateOrganize; 
	private Integer fentrustFsn;  // 委托单位 

	private String fManagerDepSn;// 主管部门id
	private String fManagerDepName;// 主管部门

	// 审核任务单中的审核科室
	private Long fcheckDepartmentSn; // 审核科室
	private String fcheckDepartmentName; // 审核科室名称
	private Long fcheckDepartmentManagerSn; // 审核科负责人编号
	private String fcheckDepartmentManagerName; // 审核科负责人名称
	//////////////////////////////////////////////////////////////////////
	
	private Date fnewProjectDate = new Date(); // 新建项目的时间
	private Date fdeletegateDate; // 委托时间
	
	private Date fplanEndDate; // 实际需要的完成时间（在用）规定完成日期(规定完成时限)
	private Date fplanFinishDate; // 计划完成时间
	private Integer fplanFinishDays;//完成工作日
	private String fcheckerIds; // 审核人编号
	private String fcheckerNames; // 审核人名称
	private String freCheckerIds; // 复核人
	private String freCheckerNames; // 复核人名称
	private String freReCheckerIds; // 复审人
	private String freReCheckerNames; // 复审人名称
	private Long fcenterLeaderSn; // 主任编号
	private String fcenterLeaderName; // 主任姓名
	private Long fassistantCenterLeaderSn; // 副主任编号
	private String fassistantCenterLeaderName; // 副主任名称
	private Long freReCheckDepartMentLeaderSn; // 复审科负责人编号
	private String freReCheckDepartMentLeaderName; // 复审科负责人名称
	private Long freceiverSn; // 收件人编号
	private String freceiverName; // 收件人名称
	private Long fzongHeKeManagerSn; // 综合科负责人编号
	private String fzongHeKeManagerName; // 综合科负责人名称
	private Double fapplyAmount = 0.00; // 送审金额
	private String fmeno; // 备注
	private Integer fisGreateProject; // 是否重点项目
	private Integer fifHastenHandle; // 是否催办
	private Integer fpri; // 优先级

	private String fsecrecyRating; // 保密等级
	private Integer fisPaused; // 是否中止
	private Integer fendStatus; // 结束状态
	private Long fcheckContentSn; // 关联流程，存放的是审查内容的fsn，查询流程appid根据这个
	private String fcheckContentName; // 流程的名字
	private Long fcheckContentViewSn; // 不关联流程，存放的是审查内容的fsn，少了简易流程
	private String fcheckContentViewName; // 审查内容名称
	private String fpsName; // 评审机构名称
	private Integer fisHistoryProject; // 是否是历史项目
	private Integer fisSignHeTong;//是否已签合同
	private Integer fisRandomFuShen;//是否进行抽查复审:1,抽查复审；2,不抽查复审
	private Date fprojectCreateDate; // 项目创建日期
	private Integer fauditTimes; // 审核次数
	private String fleaderOpType; // 领导意见类型
	private Integer fisChangeCheckDept; // 领导是否修改过审核科室
	private Date fpigeonholeDate; // 归档日期
	private String fhistoryTreeId = "3"; // 所属历史项目树ID 默认ID为为归档
	private Double ffirstCheckMoney = 0.00; // 业务科初审造价 [第一次出业务科的时间]
	private Double freCheckMoney = 0.00; // 复审科复审造价 [没有这个意义]
	private Date fcheckDepToReCheckDepDate; // 业务科送达复审时间 [复审科接受业务科复审时,填了复审意见表时]
	private Double frecheckDepartFirstAmout = 0.00; // 复审科初审金额 第一次从复审科到领导。
	private Date fcompleteFuShenTime; // 完成复审时间 [从复审科负责人回退或者到领导]
	private Double ffirstReCheckMoney=0.00;//审核到复核的审定金额，初审审定金额（可以用来计算误差：（初审审定金额-审定金额）/ 审定金额）
	private Double fsongShen = 0.00; // 最终的送审金额汇总
	private Double fshenHe = 0.00; // 最终的审核金额汇总
	private Double fshenDing = 0.00; // 最终审定金额的汇总
	private Double fheJian = 0.00;
	private String fsongShenDaXie = ""; // 最终的送审金额汇总
	private String fshenHeDaXie = ""; // 最终的审核金额汇总
	private String fshenDingDaXie = ""; // 最终审定金额的汇总
	private String fheJianDaXie = "";
	private String fheZengDaXie = "";
	private Date ftaskDingAnTianXieDate; // 项目造价定案表用户选择的日期
	private String ffawengaoNo; // 发文稿号
	private String ftaskCode; // 委托书编号
	private String fweituoZJCode;// 委托中介code
	private String fshouLiCode; // 项目受理编号
	private String fcheckItems; // 项目审查事项id
	private String fcheckItemsName; // 项目审查事项name
	private String fnewJobId; // 新步骤实例编号,上一步流转完的流转记录tbljobbase的fsn。正在流转的任然在tbljobbase中
	private Integer fnewJobStatus; // 新步骤实例状态
	private Date fcheckCompareDate; // 竣工财务决算审核对比表日期
	private Integer fisCenterBack; // 中心领导是否回退过。
	private Date fsheHeDate; // 审核时间
	private Double yeWuKeShenDingMoney; // 业务科审定金额 [没有意义]
	private String fyiJiaoRen; // 归档移交清单-移交人姓名
	private Date fyiJiaoRiQi; // 归档移交清单-移交日期
	private String fjieShouRen; // 归档移交清单-接收人姓名
	private Date fjieShouRiQi; // 归档移交清单-接收日期
	private String jobId;
	private String miniJobId;
	private Date fendDate;
	
	private Long fshenheType = 1L;// (默认选中审核中心审核)审核方式 1-中心审核 2-中介审核 3-合作审核
	private Integer fround;// 第几轮项目：项目最新的轮次值
	private String froundName;// 轮次名
	private Integer fbatch;// 第几批次
	private Integer isDanduWt; // 单独委托次数
	private Integer isZhuanXiangSh; // 专项审核次数:民生水利
	private String fzhuanXiangSh;// 专项审核名

	private String fshenheZhuanGuanYuanIds;// 审核专管员id
	private String fshenheZhuanGuanYuanNames;// 审核专管员Name
	private String projectId;
	private Double heJianAmount;// 统计报表字段核减金额
	private Double wuchaAmount;// 统计报表的误差金额
	private Double heJianRate;// 统计报表字段核减率
	private Double wuchaRate;// 统计报表字段误差率
	private Integer projCount = 1;// 统计报表字段项目数（此默认值统计时有用，不能任意改变）
	private Integer finishCount = 1;//已经完成的项目数
	private Double finishSongShen=0.00;
	private Integer diffCount;// 对比接收增/减
	private Double diffCountRate;// 对比接收增/减率
	private Double diffSongShen;// 对比接收增/减
	private Double diffSongShenRate;// 对比接收增/减率
	private Double diffShenHe;// 最终的审核金额汇总
	private Double diffShenHeRate;// 最终的审核金额汇总
	private Double diffShenDing;
	private Double diffShenDingRate;
	private Double diffHeJianAmount;
	private Double diffHeJianAmountRate;
	private Double diffHeJianRate;
	private Double fbasicRate;// 基本审核费费率
	private Double fawardRate;// 奖励审核费费率
	private Double fbasicMax;// 基本最高限额
	private Double fbasicMin;// 基本最低限额
	private Double fawardMax;// 奖励最高限额
	private Double fawardMin;// 奖励最低限额
	private Double basic = 0.00;// 审核费用-基本(get方法有业务)
	private Double award = 0.00;// 审核费用-奖励(get方法有业务)
	private Double total = 0.00;// 审核费用-小计
	private Double basicCount = 0.00;// 审核费用-基本//统计
	private Double awardCount = 0.00;// 审核费用-奖励//统计
	private Double totalCount = 0.00;// 审核费用-小计//统计
	private Collection<TblProject> childen = new ArrayList<TblProject>();
	private List<TblProject> childens = new ArrayList<TblProject>();
	// 项目列表中，颜色和提示信息
	private String contentColor;
	private String titleTip;
	private Double fheZeng;// 核增。
	private Integer fleaderSaveId;// 审查内容保存标记
	private Integer fifFreezeFuHeYiJianBiao;// 是否冻结复核意见表
	private Integer fifFreezeFuShenYiJianBiao;// 是否冻结复审意见表
	private Integer fifFreeFaWenGaoNumber;// 是否打开编写发文号功能
	
	private Integer fifOpen;//
	private String fminiJobUserName;// 当前任务的处理人，根据tblminijob和tblemployeeinfo来
	
	private String fhuiBaiIds; // 会办科室编号
	private String fhuiBaiNames; // 会办科室名称
	
	private String flockState;// 锁定权限状态
	
	private int currentUserIsRechecker = 0;// 当前用户是否是稽核人
	private int currentUserIsReRechecker = 0;// 当前用户是否是复审人
	private int currentUserIsCheckDptMan = 0;// 当前用户是否是主办科负责人
	private int currentUserIsReRecheckMan = 0;// 当前用户是否是复审组负责人
	private int currentUserIsCenterZhuRen = 0;// 当前用户是否中心主任
	private int currentUserIsCenterFuZhuRen = 0;// 当前用户是否中心副主任
	
	private Long fcooperatorSn;
	private Integer fifdd = 0;// 是否是待定项目//0和空代表正常
	private Integer fpoint;// 历史项目标记
	private Integer fisDelete;// 是否是退审项目//0和空代表正常
	private Date fdeleteDate;// 退审时间
	private Integer fisFiddOrDelete;// 看是否是要进入待定还是退审项目1:待定；2：退审
	private Date fshouLiDate;// 受理时间 : 审批任务流程步骤提交后，在后置处理器中设置
	private Date fdaiDingDate;// 待定时间
	private Long shenheNum; // 这个是用于审核业务统计报表（二）
	
	private Integer fmenuType;//菜单版本 ----菜单版本控制--1：表示旧的菜单--2：表示新的菜单-----
	private Date fleaderAuditTime;///领导审批时间（项目的完成时间）
	private Date fweiTuoZhongjieTime;// 委托中介时间
	
	private Double khpf=0.00;//用于报表显示
	private Double avgkhpf=0.00;
	private Integer shdays=0;//用于报表显示
	private Integer htdays=0;//用于报表显示
	private Double wclv=0.00;//用于报表显示
	
	// 标记项目用到的字段
	private Integer finishYear; // 完成年份
	private Integer finishSeasion;// 完成季度
	private Integer fisLeaderCheck;// 是否领导督办 1，是；0，否
	private Integer fisImportent; // 是否重点项目1，是；0，否
	private String fContractNumber;// 合同编号
	private Date fContractDate;// 合同时间
	private Date frequireDuiShuTime;/// 要求提交对数时间(对数前初稿时限)
	private Integer fdelayDays;// 延期天数
	private Boolean fisdelay;// 是否延期
	private Boolean fisYingji;// 是否应急项目
	
	// 计算中介审核费用用到的字段
	private Double fyuFuKuan;// 预付款
	private Date ffuKuanDate;// 付款时间
	private Integer fyuQiDays;// 逾期天数
	private Double fwuChaLv;// 误差率
	private Double fyuQiKouKuan;// 逾期扣款
	private Double fwuChaLvKouFa;// 误差率扣罚
	private Double fweiKuan;// 尾款
	private Date ffuKuanDate2;// 付款时间
	private Double fjsShenHeFei;// 计算审核费
	private Double fsjShenHeFei;// 实际审核费
	private String fbankNumber;
	
	private Integer fwhoseTurn;
	private Integer fisExportFinished;
	private Long fsort;// 用来排序，初始化的时候将原来bigint的主键拷贝过来，以后的在上一条的基础上加1
	
	private String statusName;// 用来记录流程步骤状态（tblprocess表中的statusName) 不映射
	private Boolean fisCurrentJob;

	// 报送时间
	private Date fbaosongDate1;// 建设单位报送时间
	private Date fbaosongDate2;// 主管单位报送时间
	private Date fbaosongDate3;// 业务处室报送时间
	
	
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

	// 此构造自定义报表用到,不能删
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

	// 此构造自定义报表用到,不能删
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

	// 此构造实时报表用到,不能删
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

	// 构建对比表用到,不能删
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

	// 此构造固定报表用到,不能删
	public TblProject(String fcheckContentViewName) {
		super();
		this.fcheckContentViewName = fcheckContentViewName;
		this.fcheckContentViewSn = 0L;
		this.projCount = 0;
		this.fsongShen = 0.0;
		this.fshenHe = 0.0;
		this.fshenDing = 0.0;
		this.diffCount = 0;// 对比接收增/减
		this.diffCountRate = 0.0;// 对比接收增/减率
		this.diffSongShen = 0.0;// 对比接收增/减
		this.diffSongShenRate = 0.0;// 对比接收增/减率
		this.diffShenHe = 0.0;// 最终的审核金额汇总
		this.diffShenHeRate = 0.0;// 最终的审核金额汇总
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
	
	// 此构造中介机构报表用到,不能删
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
//			System.out.println("审核金额:"+fshenHe+ "  核减额："+temp + "  核减率："+heJianRate * 100 + "%");
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