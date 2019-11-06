package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("pre_file")
public class PreFile {
	@TableField("UNID")
	private String UNID;	//唯一标识。主键，由业务系统自动产rn生，不可空 
	@TableField("PROJID")
	private String PROJID;	//申办号。主键，为办件的唯一标识，rn由业务系统按规则自动生rn成，不可空 
	@TableField("ATTRNAME")
	private String ATTRNAME;	//材料名称。审批事项所对应的提交材rn料，不可空 
	@TableField("DEPTID")
	private String DEPTID;	//收件部门编码。审批事项所对应的负责部rn门组织机构代码，不可空 
	@TableField("ATTRID")
	private String ATTRID;	//材料标识。材料唯一标识，不可空 
	@TableField("SORTID")
	private String SORTID;	//材料序号。根据材料顺序依次编号 
	@TableField("TAKETYPE")
	private String TAKETYPE;	//收取方式。纸质收取、附件上传、电rn子证照库，不可空 
	@TableField("ISTAKE")
	private String ISTAKE;	//是否收取。标识材料收取的情况，1=rn是，0=否，不可空 
	@TableField("AMOUNT")
	private String AMOUNT;	//收取数量。记录所收取材料的数量 
	@TableField("TAKETIME")
	private String TAKETIME;	//收取时间。时间格式：yyyy-mm-dd rnhh24:mi:ss，不可空
	@TableField("FILENAME")
	private String FILENAME;	//附件文件名称。如果有上传附件必填，上rn传附件的文件全称包含后rn缀名，如身份证.jpg 
	@TableField("ENTITY")
	private String ENTITY;	//附件实体。如果有上传附件，则该信rn息保存的是具体的附件信rn息，如无特殊需求以文件rn方式交换，该字段值为空 
	@TableField("ENTITYPATH")
	private String ENTITYPATH;	//附件路径。附件实体文件路径，附件rn默认以文件形式交换 
	@TableField("MEMO")
	private String MEMO;	//备注。作为材料收取情况的补充rn说明
	@TableField("CREATE_TIME")
	private String CREATETIME;	//数据产生时间。由各业务系统产生，时间rn格式：rnyyyy-mm-ddhh24:mi:ss，rn不可空
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认值=1，如果有rn信息变更，则版本号递增
	@TableField("MAKETIME")
	private Date MAKETIME;	//数据存库时间。非空，默认 SYSDATE 
	@TableField("SIGNSTATE")
	private String SIGNSTATE;	//标志位。数据交换状态标志位，默 认为 0，不可空 
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

	public String getATTRNAME() {
		return ATTRNAME;
	}
	
	public void setATTRNAME(String ATTRNAME) {
		this.ATTRNAME = ATTRNAME;
	}

	public String getDEPTID() {
		return DEPTID;
	}
	
	public void setDEPTID(String DEPTID) {
		this.DEPTID = DEPTID;
	}

	public String getATTRID() {
		return ATTRID;
	}
	
	public void setATTRID(String ATTRID) {
		this.ATTRID = ATTRID;
	}

	public String getSORTID() {
		return SORTID;
	}
	
	public void setSORTID(String SORTID) {
		this.SORTID = SORTID;
	}

	public String getTAKETYPE() {
		return TAKETYPE;
	}
	
	public void setTAKETYPE(String TAKETYPE) {
		this.TAKETYPE = TAKETYPE;
	}

	public String getISTAKE() {
		return ISTAKE;
	}
	
	public void setISTAKE(String ISTAKE) {
		this.ISTAKE = ISTAKE;
	}

	public String getAMOUNT() {
		return AMOUNT;
	}
	
	public void setAMOUNT(String AMOUNT) {
		this.AMOUNT = AMOUNT;
	}

	public String getTAKETIME() {
		return TAKETIME;
	}
	
	public void setTAKETIME(String TAKETIME) {
		this.TAKETIME = TAKETIME;
	}

	public String getFILENAME() {
		return FILENAME;
	}
	
	public void setFILENAME(String FILENAME) {
		this.FILENAME = FILENAME;
	}

	public String getENTITY() {
		return ENTITY;
	}
	
	public void setENTITY(String ENTITY) {
		this.ENTITY = ENTITY;
	}

	public String getENTITYPATH() {
		return ENTITYPATH;
	}
	
	public void setENTITYPATH(String ENTITYPATH) {
		this.ENTITYPATH = ENTITYPATH;
	}

	public String getMEMO() {
		return MEMO;
	}
	
	public void setMEMO(String MEMO) {
		this.MEMO = MEMO;
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