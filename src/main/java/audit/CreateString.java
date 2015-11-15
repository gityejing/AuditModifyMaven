package audit;


public class CreateString {
	public static void main(String[] args) {
		createUpdataProcessOrderby();
	}

	public static void createUpdataProcessOrderby() {
		String[] s = new String[] { "建设单位报送", "建设单位复核", "主管部门审核", "主管部门复核",
				"业务处室审核", "业务处室复核", "待受理", "接收任务", "确认任务", "审批任务", "分配审核复核人",
				"分配复审人", "制定审核方案", "复核审核方案", "业务科复核审核方案", "复审审核方案",
				"复审科复审审核方案", "审核", "中介复核人复核", "中介负责人复核", "对数", "复核", "业务科复核",
				"复审人复审", "复审科复审", "提交评审结论", "复核评审结论", "业务科复核评审结论", "复审评审结论",
				"复审科复审评审结论", "分管领导审批", "主任审批", "发出评审结论(清稿)", "发出评审结论(已发)",
				"建设单位反馈评审结论意见", "修正报告", "复核修正报告", "业务科复核修正报告", "复审修正报告",
				"复审科复审修正报告", "综合科核稿", "分管领导审定", "主任审定", "收件员编号", "业务处室报送结果",
				"归档", "协管领导复核", "协管领导审批评审结论", "协管领导审定", "归档完成", "分配审核复核复审人*",
				"审核*", "稽核复审*", "评审结论*", "稽核复审修正报告及核稿*" };

		s = new String[] { "建设单位报送", "建设单位复核", "主管部门审核", "主管部门复核", "业务处室审核",
				"业务处室复核", "待受理", "接收任务", "确认任务", "审批任务", "分配审核复核人", "分配复审人",
				"制定审核方案", "复核审核方案", "业务科复核审核方案", "复审审核方案", "复审科复审审核方案", "审核",
				"中介复核人复核", "中介负责人复核", "对数", "复核", "业务科复核", "复审", "复审科复审",
				"提交评审结论", "复核评审结论", "业务科复核评审结论", "复审评审结论", "复审科复审评审结论",
				"协管领导审批评审结论", "分管领导审批评审结论", "主任审批评审结论", "发出评审结论(清稿)",
				"建设单位反馈评审结论意见", "发出评审结论(已发)", "修正报告", "复核修正报告", "业务科复核修正报告",
				"复审修正报告", "复审科复审修正报告", "综合科核稿", "协管领导审定", "分管领导审定", "主任审定",
				"收件员编号", "业务处室报送结果", "归档", "协管领导复核", "协管领导审批评审结论", "协管领导审定",
				"归档完成", "分配审核复核复审人*", "审核*", "稽核复审*", "评审结论*", "协管分管领导审批*",
				"稽核复审修正报告及核稿*", "协管分管领导审定*" };

		s = new String[] { "建设单位报送", "建设单位复核", "主管部门审核", "主管部门复核", "业务处室审核",
				"业务处室复核", "待受理", "接收任务", "确认任务", "审批任务", "分配审核人", "分配复审人",
				"审核", "复核", "业务科复核", "复审", "复审科负责人复审", "分管领导审定", "主任审定",
				"业务处室报送结果", "归档", "业务组负责人评分", "复审人评分", "复审组负责人评分", "分管领导评分",
				"中心领导评分", "协管领导审批", "归档完成" };

		s = new String[] { "建设单位报送", "建设单位复核", "主管部门审核", "主管部门复核", "业务处室审核",
				"业务处室复核", "待受理", "接收任务", "确认任务", "审批任务", "分配审核复核人", "分配复审人",
				"制定审核方案", "复核审核方案", "业务科复核方案", "复审审核方案", "复审科复审方案", "审核",
				"中介复核人复核", "中介负责人复核", "复核", "对数", "业务科复核", "复审", "复审科复审",
				"提交评审结论", "复审科复审评审结论", "协管领导审批评审结论", "分管领导审批评审结论", "主任审批评审结论",
				"复审人评分", "业务处室报送结果", "归档", "稽核人评分", "业务组负责人评分", "复审组负责人评分",
				"分管领导评分", "中心领导评分", "协管领导复核", "结束", "分配审核复核复审人*", "审核*",
				"稽核复审*", "协管分管领导审批*", "评分*" };

		s = new String[] { "建设单位报送", "建设单位复核", "主管部门审核", "主管部门复核", "业务处室审核",
				"业务处室复核", "待受理", "接收任务", "确认任务", "审批任务", "分配审核人", "分配复审人",
				"审核", "复核", "科负责人复核", "复审", "复审科负责人复审", "分管领导审批", "中心领导审批",
				"业务处室报送结果", "归档", "结束" };

		s = new String[] { "业务处室报送", "待受理", "接受任务", "确认任务", "审批任务", "分配审核人",
				"分配复审人", "审核", "业务组复核", "复审", "复审组组长复审", "分管领导审定", "主任审定",
				"审核人清稿", "业务处室签收结果", "业务处室复核", "归档", "结束" };
		for (int i = 0; i < s.length; i++) {
			String string = "update TblProcess set orderBy = " + (i + 1)
					+ " where AppID = 22 and ProcessName = '" + s[i] + "'";
			System.out.println(string);
		}
	}
}
