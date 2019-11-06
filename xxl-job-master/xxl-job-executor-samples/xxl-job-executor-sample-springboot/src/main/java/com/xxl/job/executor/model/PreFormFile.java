package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("pre_form_file")
public class PreFormFile {
	@TableField("ORGBUSNO")
	private String ORGBUSNO;	//原系统业务流水号。主键，不可空 
	@TableField("STDVER")
	private Integer STDVER;	//标准版本号。描述使用的数据采集标准的 版本号（必须有，写入 1 即 可）
	@TableField("PROJID")
	private String PROJID;	//"申办号。主键，为办件的唯一标识， 由业务系统按规则自动生 成，不可空 
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认为 1，用于重报数据 的情况（必须有，写入 1 即可）
	@TableField("REGION_ID")
	private String REGIONID;	//行政区划。可为空，默认值：370000 
	@TableField("SN")
	private String SN;	//序号。主键，不可空 
	@TableField("FILEPATH")
	private String FILEPATH;	//附件路径。可为空 
	@TableField("FILENAME")
	private String FILENAME;	//附件名称。附件的全称，包括文件后缀 名
	@TableField("FILECONTENT")
	private String FILECONTENT;	//附件实体。可为空 
	@TableField("BELONGORGID")
	private String BELONGORGID;	//所属单位编码。可为空 
	@TableField("BELONGORGNAME")
	private String BELONGORGNAME;	//所属单位名称。可为空 
	@TableField("CREATE_TIME")
	private Date CREATETIME;	//数据产生时间。由各业务系统产生，时间格式：yyyy-mm-ddhh24:mi:ss
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

	public Integer getSTDVER() {
		return STDVER;
	}
	
	public void setSTDVER(Integer STDVER) {
		this.STDVER = STDVER;
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

	public String getREGIONID() {
		return REGIONID;
	}
	
	public void setREGIONID(String REGIONID) {
		this.REGIONID = REGIONID;
	}

	public String getSN() {
		return SN;
	}
	
	public void setSN(String SN) {
		this.SN = SN;
	}

	public String getFILEPATH() {
		return FILEPATH;
	}
	
	public void setFILEPATH(String FILEPATH) {
		this.FILEPATH = FILEPATH;
	}

	public String getFILENAME() {
		return FILENAME;
	}
	
	public void setFILENAME(String FILENAME) {
		this.FILENAME = FILENAME;
	}

	public String getFILECONTENT() {
		return FILECONTENT;
	}
	
	public void setFILECONTENT(String FILECONTENT) {
		this.FILECONTENT = FILECONTENT;
	}

	public String getBELONGORGID() {
		return BELONGORGID;
	}
	
	public void setBELONGORGID(String BELONGORGID) {
		this.BELONGORGID = BELONGORGID;
	}

	public String getBELONGORGNAME() {
		return BELONGORGNAME;
	}
	
	public void setBELONGORGNAME(String BELONGORGNAME) {
		this.BELONGORGNAME = BELONGORGNAME;
	}

	public Date getCREATETIME() {
		return CREATETIME;
	}
	
	public void setCREATETIME(Date CREATETIME) {
		this.CREATETIME = CREATETIME;
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