package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("ea_jc_serveval")
public class EaJcServeval {
	@TableField("ORGBUSNO")
	private String ORGBUSNO;	//原系统业务流水号。主键，不可空 
	@TableField("PROJID")
	private String PROJID;	//申办号。主键，为办件的唯一标识，由业rn务系统按规则自动生成，不可空 
	@TableField("STDVER")
	private Integer STDVER;	//标准版本号。描述使用的数据采集标准的版 本号， 不可空
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认为 1，用于重报数据 的情况。不可空
	@TableField("EVALRESULT")
	private String EVALRESULT;	//评价结果。由于评价结果在业务系统中是自 定义的，评价结果需对应字典项， 不可空
	@TableField("EVALDATE")
	private Date EVALDATE;	//评价时间。不可空
	@TableField("REGION_ID")
	private String REGIONID;	//行政区划。可为空，默认值：370000 
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

	public String getEVALRESULT() {
		return EVALRESULT;
	}
	
	public void setEVALRESULT(String EVALRESULT) {
		this.EVALRESULT = EVALRESULT;
	}

	public Date getEVALDATE() {
		return EVALDATE;
	}
	
	public void setEVALDATE(Date EVALDATE) {
		this.EVALDATE = EVALDATE;
	}

	public String getREGIONID() {
		return REGIONID;
	}
	
	public void setREGIONID(String REGIONID) {
		this.REGIONID = REGIONID;
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