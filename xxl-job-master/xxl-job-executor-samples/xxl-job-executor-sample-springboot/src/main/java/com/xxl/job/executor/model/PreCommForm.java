package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("pre_comm_form")
public class PreCommForm {
	@TableField("UNID")
	private String UNID;	//唯一标识。主键，由业务系统自动产rn生，不可空 rn2
	@TableField("PROJID")
	private String PROJID;	//申办号。主键，为办件的唯一标识，rn由业务系统按规则自动生rn成，不可空 
	@TableField("DEPTID")
	private String DEPTID;	//收件部门编码。审批事项所对应的负责部rn门组织机构代码，不可空 
	@TableField("FORM_NAME")
	private String FORMNAME;	//业务表单名称。业务表单的具体中文名称，rn不可空 
	@TableField("FORM_UNID")
	private String FORMUNID;	//业务表单唯一标识。如果业务系统有该字段，则rn填写，可为空 
	@TableField("FORM_SORT")
	private String FORMSORT;	//业务表单顺序号。业务表单展示的顺序号，如rn果只有一个表单则值=1，不rn可空 
	@TableField("USE_UNID")
	private String USEUNID;	//使用对象关联号。如材料的表单、办件申报号rn等，不可空 
	@TableField("USE_TYPE")
	private String USETYPE;	//使用对象类型。详见数据字典中证件类型，rn可为空 
	@TableField("ITEM_VALUES")
	private String ITEMVALUES;	//业务表单信息项的值。详见 附录中业务表单 JSON定义，可空 
	@TableField("REMARK")
	private String REMARK;	//备注。补充说明 
	@TableField("CREATE_TIME")
	private String CREATETIME;	//"数据产生时间。由各业务系统产生，时间rn格 式 ：rnyyyy-mm-ddhh24:mi:ss，rn不可空"
	@TableField("DATAVER")
	private Integer DATAVER;	//"数据版本号。主键，默认值=1，如果有rn信息变更，则版本号递增 "
	@TableField("MAKETIME")
	private Date MAKETIME;	//数据存库时间。非空，默认 SYSDATE 
	@TableField("SIGNSTATE")
	private String SIGNSTATE;	//标志位。数据交换状态标志位，默 认为 0
	@TableField("EXT1")
	private String EXT1;	//扩展备用字段
	@TableField("EXT2")
	private String EXT2;	//扩展备用字段
	@TableField("EXT3")
	private String EXT3;	//扩展备用字段
	@TableField("EXT4")
	private String EXT4;	//扩展备用字段
	public String getUNID() {
		return UNID;
	}
	
	public void setUNID(String UNID) {
		this.UNID = UNID;
	}

	public String getPROJID() {
		return PROJID;
	}
	
	public void setPROJID(String PROJID) {
		this.PROJID = PROJID;
	}

	public String getDEPTID() {
		return DEPTID;
	}
	
	public void setDEPTID(String DEPTID) {
		this.DEPTID = DEPTID;
	}

	public String getFORMNAME() {
		return FORMNAME;
	}
	
	public void setFORMNAME(String FORMNAME) {
		this.FORMNAME = FORMNAME;
	}

	public String getFORMUNID() {
		return FORMUNID;
	}
	
	public void setFORMUNID(String FORMUNID) {
		this.FORMUNID = FORMUNID;
	}

	public String getFORMSORT() {
		return FORMSORT;
	}
	
	public void setFORMSORT(String FORMSORT) {
		this.FORMSORT = FORMSORT;
	}

	public String getUSEUNID() {
		return USEUNID;
	}
	
	public void setUSEUNID(String USEUNID) {
		this.USEUNID = USEUNID;
	}

	public String getUSETYPE() {
		return USETYPE;
	}
	
	public void setUSETYPE(String USETYPE) {
		this.USETYPE = USETYPE;
	}

	public String getITEMVALUES() {
		return ITEMVALUES;
	}
	
	public void setITEMVALUES(String ITEMVALUES) {
		this.ITEMVALUES = ITEMVALUES;
	}

	public String getREMARK() {
		return REMARK;
	}
	
	public void setREMARK(String REMARK) {
		this.REMARK = REMARK;
	}

	public String getCREATETIME() {
		return CREATETIME;
	}
	
	public void setCREATETIME(String CREATETIME) {
		this.CREATETIME = CREATETIME;
	}

	public Integer getDATAVER() {
		return DATAVER;
	}
	
	public void setDATAVER(Integer DATAVER) {
		this.DATAVER = DATAVER;
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