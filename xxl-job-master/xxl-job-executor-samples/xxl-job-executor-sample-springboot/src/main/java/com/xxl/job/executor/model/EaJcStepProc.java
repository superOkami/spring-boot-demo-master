package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("ea_jc_step_proc")
public class EaJcStepProc {
	@TableField("ORGBUSNO")
	private String ORGBUSNO;	//原系统业务流水号。主键，具体数据的唯一 id，中间 库表之间数据的关联，不可空 
	@TableField("PROJID")
	private String PROJID;	//申办号。主键，为办件的唯一标识，由业rn务系统按规则自动生成，不可空 
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认为 1，用于重报数据 的情况。不可空
	@TableField("STDVER")
	private Integer STDVER;	//标准版本号。描述使用的数据采集标准的版 本号， 不可空
	@TableField("SN")
	private Integer SN;	//序号。主键，审批过程序号，不可空
	@TableField("NODENAME")
	private String NODENAME;	//环节名称。不可空
	@TableField("NODECODE")
	private String NODECODE;	//环节批次 id。记录环节的批次信息，可为空 
	@TableField("NODETYPE")
	private String NODETYPE;	//环节类型。（不可空）1-开始环节；2-中间 环节；3-结束环节；4-只有一条 审批数据（开始即是结束） 
	@TableField("NODEPROCER")
	private String NODEPROCER;	//环节处理人 id。不可空 
	@TableField("NODEPROCERNAME")
	private String NODEPROCERNAME;	//环节处理人姓名。不可空 
	@TableField("NODEPROCERAREA")
	private String NODEPROCERAREA;	//环节处理人行政 区划。可为空，默认值：370000 
	@TableField("REGION_ID")
	private String REGIONID;	//处理行政区划。可为空，默认值：370000 
	@TableField("PROCUNIT")
	private String PROCUNIT;	//处理单位 id，组 织机构代码。不可空
	@TableField("PROCUNITNAME")
	private String PROCUNITNAME;	//处理单位名称。不可空
	@TableField("NODESTATE")
	private String NODESTATE;	//环节办理状态 。主键不可空 01-待办，02-已办 
	@TableField("NODESTARTTIME")
	private Date NODESTARTTIME;	//环节开始时间。不可空
	@TableField("NODEENDTIME")
	private Date NODEENDTIME;	//环节结束时间 。如果没有结束时间，填写开始时 间，不可空 
	@TableField("NODEADV")
	private String NODEADV;	//环节处理意见 。可为空
	@TableField("TIMELIMIT")
	private Integer TIMELIMIT;	//环节承诺时限。可为空
	@TableField("PROMISETIMEUNIT")
	private String PROMISETIMEUNIT;	//环节承诺时限单位。环节承诺时限单位 1-工作日； 2-自然日；3-小时；4-分钟；5月（可空） 
	@TableField("NODERESULT")
	private String NODERESULT;	//环节处理结果。不可空。0 - 不同意，1 - 同意 ， 2-不受理， 3-不予受理， 4-受理， 5-补齐补正，6-特别程序（挂起 操作），7-退回 
	@TableField("OCCURTIME")
	private Date OCCURTIME;	//环节办理时间。这里取环节开始时间，不可空 
	@TableField("MAKETIME")
	private Date MAKETIME;	//数据存库时间。非空，默认 SYSDATE 
	@TableField("SIGNSTATE")
	private String SIGNSTATE;	//标志位。不可空。数据交换状态标志位，默认为 0
	@TableField("NOTICE")
	private String NOTICE;	//环节通知内容。本环节的通知说明
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

	public Integer getDATAVER() {
		return DATAVER;
	}
	
	public void setDATAVER(Integer DATAVER) {
		this.DATAVER = DATAVER;
	}

	public Integer getSTDVER() {
		return STDVER;
	}
	
	public void setSTDVER(Integer STDVER) {
		this.STDVER = STDVER;
	}

	public Integer getSN() {
		return SN;
	}
	
	public void setSN(Integer SN) {
		this.SN = SN;
	}

	public String getNODENAME() {
		return NODENAME;
	}
	
	public void setNODENAME(String NODENAME) {
		this.NODENAME = NODENAME;
	}

	public String getNODECODE() {
		return NODECODE;
	}
	
	public void setNODECODE(String NODECODE) {
		this.NODECODE = NODECODE;
	}

	public String getNODETYPE() {
		return NODETYPE;
	}
	
	public void setNODETYPE(String NODETYPE) {
		this.NODETYPE = NODETYPE;
	}

	public String getNODEPROCER() {
		return NODEPROCER;
	}
	
	public void setNODEPROCER(String NODEPROCER) {
		this.NODEPROCER = NODEPROCER;
	}

	public String getNODEPROCERNAME() {
		return NODEPROCERNAME;
	}
	
	public void setNODEPROCERNAME(String NODEPROCERNAME) {
		this.NODEPROCERNAME = NODEPROCERNAME;
	}

	public String getNODEPROCERAREA() {
		return NODEPROCERAREA;
	}
	
	public void setNODEPROCERAREA(String NODEPROCERAREA) {
		this.NODEPROCERAREA = NODEPROCERAREA;
	}

	public String getREGIONID() {
		return REGIONID;
	}
	
	public void setREGIONID(String REGIONID) {
		this.REGIONID = REGIONID;
	}

	public String getPROCUNIT() {
		return PROCUNIT;
	}
	
	public void setPROCUNIT(String PROCUNIT) {
		this.PROCUNIT = PROCUNIT;
	}

	public String getPROCUNITNAME() {
		return PROCUNITNAME;
	}
	
	public void setPROCUNITNAME(String PROCUNITNAME) {
		this.PROCUNITNAME = PROCUNITNAME;
	}

	public String getNODESTATE() {
		return NODESTATE;
	}
	
	public void setNODESTATE(String NODESTATE) {
		this.NODESTATE = NODESTATE;
	}

	public Date getNODESTARTTIME() {
		return NODESTARTTIME;
	}
	
	public void setNODESTARTTIME(Date NODESTARTTIME) {
		this.NODESTARTTIME = NODESTARTTIME;
	}

	public Date getNODEENDTIME() {
		return NODEENDTIME;
	}
	
	public void setNODEENDTIME(Date NODEENDTIME) {
		this.NODEENDTIME = NODEENDTIME;
	}

	public String getNODEADV() {
		return NODEADV;
	}
	
	public void setNODEADV(String NODEADV) {
		this.NODEADV = NODEADV;
	}

	public Integer getTIMELIMIT() {
		return TIMELIMIT;
	}
	
	public void setTIMELIMIT(Integer TIMELIMIT) {
		this.TIMELIMIT = TIMELIMIT;
	}

	public String getPROMISETIMEUNIT() {
		return PROMISETIMEUNIT;
	}
	
	public void setPROMISETIMEUNIT(String PROMISETIMEUNIT) {
		this.PROMISETIMEUNIT = PROMISETIMEUNIT;
	}

	public String getNODERESULT() {
		return NODERESULT;
	}
	
	public void setNODERESULT(String NODERESULT) {
		this.NODERESULT = NODERESULT;
	}

	public Date getOCCURTIME() {
		return OCCURTIME;
	}
	
	public void setOCCURTIME(Date OCCURTIME) {
		this.OCCURTIME = OCCURTIME;
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

	public String getNOTICE() {
		return NOTICE;
	}
	
	public void setNOTICE(String NOTICE) {
		this.NOTICE = NOTICE;
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