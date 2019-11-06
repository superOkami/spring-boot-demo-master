package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("ea_jc_serveval_dict")
public class EaJcServevalDict {
	@TableField("ID")
	private String ID;	//id 主键，不可空 
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认为 1，用于重报数据的 情况。
	@TableField("DIC_CODE")
	private String DICCODE;	//字典编码。主键，不可空 
	@TableField("DIC_NAME")
	private String DICNAME;	//字典名称。不可空 
	@TableField("DESCRIBE")
	private String DESCRIBE;	//描述 
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
	public String getEXT4() {
		return EXT4;
	}
	public void setEXT4(String EXT4) {
		this.EXT4 = EXT4;
	}


	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}

	public Integer getDATAVER() {
		return DATAVER;
	}
	
	public void setDATAVER(Integer DATAVER) {
		this.DATAVER = DATAVER;
	}

	public String getDICCODE() {
		return DICCODE;
	}
	
	public void setDICCODE(String DICCODE) {
		this.DICCODE = DICCODE;
	}

	public String getDICNAME() {
		return DICNAME;
	}
	
	public void setDICNAME(String DICNAME) {
		this.DICNAME = DICNAME;
	}

	public String getDESCRIBE() {
		return DESCRIBE;
	}
	
	public void setDESCRIBE(String DESCRIBE) {
		this.DESCRIBE = DESCRIBE;
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

	@Override
	public String toString() {
		return "EaJcServevalDict{" +
				"ID='" + ID + '\'' +
				", DATAVER=" + DATAVER +
				", DICCODE='" + DICCODE + '\'' +
				", DICNAME='" + DICNAME + '\'' +
				", DESCRIBE='" + DESCRIBE + '\'' +
				", REGIONID='" + REGIONID + '\'' +
				", MAKETIME=" + MAKETIME +
				", SIGNSTATE='" + SIGNSTATE + '\'' +
				", EXT1='" + EXT1 + '\'' +
				", EXT2='" + EXT2 + '\'' +
				", EXT3='" + EXT3 + '\'' +
				", EXT4='" + EXT4 + '\'' +
				'}';
	}
}