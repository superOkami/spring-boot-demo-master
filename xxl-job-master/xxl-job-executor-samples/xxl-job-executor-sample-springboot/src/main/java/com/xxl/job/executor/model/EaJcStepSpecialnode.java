package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("ea_jc_step_specialnode")
public class EaJcStepSpecialnode {
	@TableField("ORGBUSNO")
	private String ORGBUSNO;	//原系统业务流水号。主键，不可空 
	@TableField("PROJID")
	private String PROJID;	//申办号。主键，为办件的唯一标识，由rn业务系统按规则自动生成，不rn可空 
	@TableField("REGION_ID")
	private String REGIONID;	//行政区划。可为空，默认值：370000 
	@TableField("STDVER")
	private Integer STDVER;	//标准版本号。描述使用的数据采集标准的版 本号， 不可空
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认为 1，用于重报数据 的情况
	@TableField("SN")
	private Integer SN;	//序号。主键，特殊环节序号，标识第 几次特殊环节
	@TableField("NODENAME")
	private String NODENAME;	//环节名称。不可空
	@TableField("PROCUNITNAME")
	private String PROCUNITNAME;	//处理单位名称。不可空
	@TableField("PROCUNITID")
	private String PROCUNITID;	//处理单位，组 织机构代码。不可空
	@TableField("PROCERID")
	private String PROCERID;	//处理人 id。不可空
	@TableField("PROCERNAME")
	private String PROCERNAME;	//处理人姓名。不可空 
	@TableField("PROCERREMARK")
	private String PROCERREMARK;	//处理人相关备注。可为空 
	@TableField("NODESTARTTIME")
	private Date NODESTARTTIME;	//环节开始时间。不可空 
	@TableField("NODEENDTIME")
	private Date NODEENDTIME;	//环节结束时间。不可空（如果没有结束时间， 填写开始时间) 
	@TableField("NOTETIME")
	private Date NOTETIME;	//通知申请人时间。可为空 
	@TableField("NODEPROCADV")
	private String NODEPROCADV;	//环节处理意见。不可空
	@TableField("NODEPROCADDR")
	private String NODEPROCADDR;	//环节处理地点。可为空 
	@TableField("NODEPROCACCORD")
	private String NODEPROCACCORD;	//环节处理依据。不可空 
	@TableField("LISTS")
	private String LISTS;	//材料清单。可为空
	@TableField("NODERESULT")
	private String NODERESULT;	//环节处理结果。 1 - 补齐补正。2 - 听证。3 - 公示。4 - 核实。5 - 挂起。 6 – 预审补齐补正 不可空
	@TableField("NODETIME")
	private Date NODETIME;	//环节发生时间。这里取环节开始时间，不可空 
	@TableField("MAKETIME")
	private Date MAKETIME;	//数据存库时间。非空，默认 SYSDATE 
	@TableField("SIGNSTATE")
	private String SIGNSTATE;	//标志位。不可空。数据交换状态标志位，默认为 0
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

	public Integer getDATAVER() {
		return DATAVER;
	}
	
	public void setDATAVER(Integer DATAVER) {
		this.DATAVER = DATAVER;
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

	public String getPROCUNITNAME() {
		return PROCUNITNAME;
	}
	
	public void setPROCUNITNAME(String PROCUNITNAME) {
		this.PROCUNITNAME = PROCUNITNAME;
	}

	public String getPROCUNITID() {
		return PROCUNITID;
	}
	
	public void setPROCUNITID(String PROCUNITID) {
		this.PROCUNITID = PROCUNITID;
	}

	public String getPROCERID() {
		return PROCERID;
	}
	
	public void setPROCERID(String PROCERID) {
		this.PROCERID = PROCERID;
	}

	public String getPROCERNAME() {
		return PROCERNAME;
	}
	
	public void setPROCERNAME(String PROCERNAME) {
		this.PROCERNAME = PROCERNAME;
	}

	public String getPROCERREMARK() {
		return PROCERREMARK;
	}
	
	public void setPROCERREMARK(String PROCERREMARK) {
		this.PROCERREMARK = PROCERREMARK;
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

	public Date getNOTETIME() {
		return NOTETIME;
	}
	
	public void setNOTETIME(Date NOTETIME) {
		this.NOTETIME = NOTETIME;
	}

	public String getNODEPROCADV() {
		return NODEPROCADV;
	}
	
	public void setNODEPROCADV(String NODEPROCADV) {
		this.NODEPROCADV = NODEPROCADV;
	}

	public String getNODEPROCADDR() {
		return NODEPROCADDR;
	}
	
	public void setNODEPROCADDR(String NODEPROCADDR) {
		this.NODEPROCADDR = NODEPROCADDR;
	}

	public String getNODEPROCACCORD() {
		return NODEPROCACCORD;
	}
	
	public void setNODEPROCACCORD(String NODEPROCACCORD) {
		this.NODEPROCACCORD = NODEPROCACCORD;
	}

	public String getLISTS() {
		return LISTS;
	}
	
	public void setLISTS(String LISTS) {
		this.LISTS = LISTS;
	}

	public String getNODERESULT() {
		return NODERESULT;
	}
	
	public void setNODERESULT(String NODERESULT) {
		this.NODERESULT = NODERESULT;
	}

	public Date getNODETIME() {
		return NODETIME;
	}
	
	public void setNODETIME(Date NODETIME) {
		this.NODETIME = NODETIME;
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