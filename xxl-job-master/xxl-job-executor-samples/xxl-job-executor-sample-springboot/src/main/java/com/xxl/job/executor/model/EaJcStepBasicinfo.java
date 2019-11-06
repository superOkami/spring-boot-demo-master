package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("ea_jc_step_basicinfo")
public class EaJcStepBasicinfo {
	@TableField("ORGBUSNO")
	private String ORGBUSNO;	//原系统业务流水 号，可使用业务系 统自己的流水号。主键，原系统中具体数据的 唯一 id，不可空 
	@TableField("PROJID")
	private String PROJID;	//申办号。主键，为办件的唯一标识，rn由省级政务服务平台按规rn则自动生成，不可空 
	@TableField("PROJPWD")
	private String PROJPWD;	//查询密码。由省级政务服务平台随机rn自动生成的数字，如：rn234765，不可空 
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认为 1，用于重报 数据的情况。不可空
	@TableField("REGION_ID")
	private String REGIONID;	//受理行政区划。可为空，默认值：370000
	@TableField("STDVER")
	private Integer STDVER;	//标准版本号。描述使用的数据采集标准 的版本号。不可空
	@TableField("ITEMNO")
	private String ITEMNO;	//审批事项编号。不可空 
	@TableField("SUBITEMNO")
	private String SUBITEMNO;	//事项子项编号。审批事项子项编号（可为 空） 
	@TableField("ITEMNAME")
	private String ITEMNAME;	//审批事项名称。不可空 
	@TableField("SUBITEMNAME")
	private String SUBITEMNAME;	//事项子项名称。若审批事项，不按大小项 分，则子项名称等于审批事 项名称（可为空） 
	@TableField("PROJECTNAME")
	private String PROJECTNAME;	//申报名称。申请审批的项目的具体名 称。如：关于 XXX 的交通建 设工程施工许可，不可空 
	@TableField("APPLICANT")
	private String APPLICANT;	//申报者或申报单 位名称。申请人或申请单位名称（不 可空） rn
	@TableField("APPLICANTMOBILE")
	private String APPLICANTMOBILE;	//申报者手机。可为空
	@TableField("APPLICANTTEL")
	private String APPLICANTTEL;	//申报者电话。可为空
	@TableField("APPLICANTEMAIL")
	private String APPLICANTEMAIL;	//申报者邮箱。可为空
	@TableField("ACCEPTLIST")
	private String ACCEPTLIST;	//申报材料清单。不可空 
	@TableField("ACCEPTDEPTID")
	private String ACCEPTDEPTID;	//受理单位 id，组 织机构代码。不可空，组织机构代码
	@TableField("ACCEPTDEPTNAME")
	private String ACCEPTDEPTNAME;	//受理单位名称。不可空 
	@TableField("APPROVALTYPE")
	private String APPROVALTYPE;	//办件类型。不可空，1-即办件，2-承诺 件，3-联办件，4-上报件。 
	@TableField("PROMISETIMELIMIT")
	private Integer PROMISETIMELIMIT;	//事项办理承诺时限。不可空。
	@TableField("PROMISETIMEUNIT")
	private String PROMISETIMEUNIT;	//事项办理承诺时限单位。不可空。1-工作日；2-自然 日；3-小时；4-分钟；5-月 
	@TableField("TIMELIMIT")
	private Integer TIMELIMIT;	//规定办理时限。不为空。按法律、法规规定 的办理此项审批事项的时 限。
	@TableField("TIMEUNIT")
	private String TIMEUNIT;	//规定办理时限的 单位。不为空。规定办理时限的单 位（年、月的情况需要换算 成天，1 年等于 365 天，1 个月等于 30 天）：g – 工 作日（不包含法定节假日） z – 自然日
	@TableField("SUBMIT")
	private String SUBMIT;	//业务归类。0-窗口提交，1-网上提交， 2-信函,3-电报，4-电传， 5-传真，6-邮件,7-电子数 据交换，8-其他 
	@TableField("OCCURTIME")
	private Date OCCURTIME;	//环节发生时间。环节发生时间，不可空
	@TableField("TRANSACTOR")
	private String TRANSACTOR;	//环节办理人。环节办理人，可为空 
	@TableField("MAKETIME")
	private Date MAKETIME;	//数据存库时间。非空，默认 SYSDATE 
	@TableField("SIGNSTATE")
	private String SIGNSTATE;	//标志位。非空，数据交换状态标志位，默 认为 0
	@TableField("EXT1")
	private String EXT1;	//扩展备用字段
	@TableField("EXT2")
	private String EXT2;	//扩展备用字段
	@TableField("EXT3")
	private String EXT3;	//扩展备用字段
	@TableField("EXT4")
	private String EXT4;	//扩展备用字段
	public String getORGBUSNO() {
		return ORGBUSNO;
	}
	
	public void setORGBUSNO(String ORGBUSNO) {
		this.ORGBUSNO = ORGBUSNO;
	}

	public String getPROJID() {
		return PROJID;
	}
	
	public void setPROJID(String PROJID) {
		this.PROJID = PROJID;
	}

	public String getPROJPWD() {
		return PROJPWD;
	}
	
	public void setPROJPWD(String PROJPWD) {
		this.PROJPWD = PROJPWD;
	}

	public Integer getDATAVER() {
		return DATAVER;
	}
	
	public void setDATAVER(Integer DATAVER) {
		this.DATAVER = DATAVER;
	}

	public String getREGIONID() {
		return REGIONID;
	}
	
	public void setREGIONID(String REGIONID) {
		this.REGIONID = REGIONID;
	}

	public Integer getSTDVER() {
		return STDVER;
	}
	
	public void setSTDVER(Integer STDVER) {
		this.STDVER = STDVER;
	}

	public String getITEMNO() {
		return ITEMNO;
	}
	
	public void setITEMNO(String ITEMNO) {
		this.ITEMNO = ITEMNO;
	}

	public String getSUBITEMNO() {
		return SUBITEMNO;
	}
	
	public void setSUBITEMNO(String SUBITEMNO) {
		this.SUBITEMNO = SUBITEMNO;
	}

	public String getITEMNAME() {
		return ITEMNAME;
	}
	
	public void setITEMNAME(String ITEMNAME) {
		this.ITEMNAME = ITEMNAME;
	}

	public String getSUBITEMNAME() {
		return SUBITEMNAME;
	}
	
	public void setSUBITEMNAME(String SUBITEMNAME) {
		this.SUBITEMNAME = SUBITEMNAME;
	}

	public String getPROJECTNAME() {
		return PROJECTNAME;
	}
	
	public void setPROJECTNAME(String PROJECTNAME) {
		this.PROJECTNAME = PROJECTNAME;
	}

	public String getAPPLICANT() {
		return APPLICANT;
	}
	
	public void setAPPLICANT(String APPLICANT) {
		this.APPLICANT = APPLICANT;
	}

	public String getAPPLICANTMOBILE() {
		return APPLICANTMOBILE;
	}
	
	public void setAPPLICANTMOBILE(String APPLICANTMOBILE) {
		this.APPLICANTMOBILE = APPLICANTMOBILE;
	}

	public String getAPPLICANTTEL() {
		return APPLICANTTEL;
	}
	
	public void setAPPLICANTTEL(String APPLICANTTEL) {
		this.APPLICANTTEL = APPLICANTTEL;
	}

	public String getAPPLICANTEMAIL() {
		return APPLICANTEMAIL;
	}
	
	public void setAPPLICANTEMAIL(String APPLICANTEMAIL) {
		this.APPLICANTEMAIL = APPLICANTEMAIL;
	}

	public String getACCEPTLIST() {
		return ACCEPTLIST;
	}
	
	public void setACCEPTLIST(String ACCEPTLIST) {
		this.ACCEPTLIST = ACCEPTLIST;
	}

	public String getACCEPTDEPTID() {
		return ACCEPTDEPTID;
	}
	
	public void setACCEPTDEPTID(String ACCEPTDEPTID) {
		this.ACCEPTDEPTID = ACCEPTDEPTID;
	}

	public String getACCEPTDEPTNAME() {
		return ACCEPTDEPTNAME;
	}
	
	public void setACCEPTDEPTNAME(String ACCEPTDEPTNAME) {
		this.ACCEPTDEPTNAME = ACCEPTDEPTNAME;
	}

	public String getAPPROVALTYPE() {
		return APPROVALTYPE;
	}
	
	public void setAPPROVALTYPE(String APPROVALTYPE) {
		this.APPROVALTYPE = APPROVALTYPE;
	}

	public Integer getPROMISETIMELIMIT() {
		return PROMISETIMELIMIT;
	}
	
	public void setPROMISETIMELIMIT(Integer PROMISETIMELIMIT) {
		this.PROMISETIMELIMIT = PROMISETIMELIMIT;
	}

	public String getPROMISETIMEUNIT() {
		return PROMISETIMEUNIT;
	}
	
	public void setPROMISETIMEUNIT(String PROMISETIMEUNIT) {
		this.PROMISETIMEUNIT = PROMISETIMEUNIT;
	}

	public Integer getTIMELIMIT() {
		return TIMELIMIT;
	}
	
	public void setTIMELIMIT(Integer TIMELIMIT) {
		this.TIMELIMIT = TIMELIMIT;
	}

	public String getTIMEUNIT() {
		return TIMEUNIT;
	}
	
	public void setTIMEUNIT(String TIMEUNIT) {
		this.TIMEUNIT = TIMEUNIT;
	}

	public String getSUBMIT() {
		return SUBMIT;
	}
	
	public void setSUBMIT(String SUBMIT) {
		this.SUBMIT = SUBMIT;
	}

	public Date getOCCURTIME() {
		return OCCURTIME;
	}
	
	public void setOCCURTIME(Date OCCURTIME) {
		this.OCCURTIME = OCCURTIME;
	}

	public String getTRANSACTOR() {
		return TRANSACTOR;
	}
	
	public void setTRANSACTOR(String TRANSACTOR) {
		this.TRANSACTOR = TRANSACTOR;
	}

	public Date getMAKETIME() {
		return MAKETIME;
	}
	
	public void setMAKETIME(Date MAKETIME) {
		this.MAKETIME = MAKETIME;
	}

	public String getSIGNSTATE() {
		return SIGNSTATE;
	}
	
	public void setSIGNSTATE(String SIGNSTATE) {
		this.SIGNSTATE = SIGNSTATE;
	}

	public String getEXT1() {
		return EXT1;
	}
	
	public void setEXT1(String EXT1) {
		this.EXT1 = EXT1;
	}

	public String getEXT2() {
		return EXT2;
	}
	
	public void setEXT2(String EXT2) {
		this.EXT2 = EXT2;
	}

	public String getEXT3() {
		return EXT3;
	}
	
	public void setEXT3(String EXT3) {
		this.EXT3 = EXT3;
	}

	public String getEXT4() {
		return EXT4;
	}
	
	public void setEXT4(String EXT4) {
		this.EXT4 = EXT4;
	}


}