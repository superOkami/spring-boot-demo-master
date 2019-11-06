package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("ea_jc_feeinfo")
public class EaJcFeeinfo {
	@TableField("ORGBUSNO")
	private String ORGBUSNO;	//原系统业务流水号。主键，不可空 
	@TableField("PROJID")
	private String PROJID;	//申办号。主键，为办件的唯一标识，由业rn务系统按规则自动生成，不可空 
	@TableField("STDVER")
	private Integer STDVER;	//标准版本号。描述使用的数据采集标准的版 本号， 不可空
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认为 1，用于重报数据 的情况
	@TableField("REGION_ID")
	private String REGIONID;	//行政区划。可为空，默认值：370000 
	@TableField("SN")
	private String SN;	//序号。主键，特殊环节序号，标识第 几次特殊环节 
	@TableField("FEEORGID")
	private String FEEORGID;	//收费单位编码 。不可空 
	@TableField("FEEORGNAME")
	private String FEEORGNAME;	//收费单位名称。不可空 
	@TableField("BILLNUM")
	private String BILLNUM;	//征缴单编码。可为空 
	@TableField("PAYPERSON")
	private String PAYPERSON;	//缴款人。不可空 
	@TableField("FEETYPENAME")
	private String FEETYPENAME;	//费用名称。不可空 
	@TableField("FEESTAND")
	private String FEESTAND;	//收费标准。可为空 
	@TableField("FEEAMOUNT")
	private String FEEAMOUNT;	//实收标准。可为空 
	@TableField("FEENUM")
	private String FEENUM;	//数量。 可为空 
	@TableField("FEESTANDAMOUNT")
	private Double FEESTANDAMOUNT;	//应收总额。 可为空
	@TableField("FEEDERATE")
	private Double FEEDERATE;	//减免总额。 可为空 
	@TableField("FEETOTAL")
	private Double FEETOTAL;	//实收总额 。不可空 
	@TableField("REDUCEREASON")
	private String REDUCEREASON;	//减免原因 。可为空 
	@TableField("AUDIPERSON")
	private String AUDIPERSON;	//审核人。 可为空 
	@TableField("PAYTIME")
	private Date PAYTIME;	//缴款时间。 不可空 
	@TableField("STATE")
	private String STATE;	//状态。 1-已缴 2-未缴（可以没有）不 可空 
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

	public String getFEEORGID() {
		return FEEORGID;
	}
	
	public void setFEEORGID(String FEEORGID) {
		this.FEEORGID = FEEORGID;
	}

	public String getFEEORGNAME() {
		return FEEORGNAME;
	}
	
	public void setFEEORGNAME(String FEEORGNAME) {
		this.FEEORGNAME = FEEORGNAME;
	}

	public String getBILLNUM() {
		return BILLNUM;
	}
	
	public void setBILLNUM(String BILLNUM) {
		this.BILLNUM = BILLNUM;
	}

	public String getPAYPERSON() {
		return PAYPERSON;
	}
	
	public void setPAYPERSON(String PAYPERSON) {
		this.PAYPERSON = PAYPERSON;
	}

	public String getFEETYPENAME() {
		return FEETYPENAME;
	}
	
	public void setFEETYPENAME(String FEETYPENAME) {
		this.FEETYPENAME = FEETYPENAME;
	}

	public String getFEESTAND() {
		return FEESTAND;
	}
	
	public void setFEESTAND(String FEESTAND) {
		this.FEESTAND = FEESTAND;
	}

	public String getFEEAMOUNT() {
		return FEEAMOUNT;
	}
	
	public void setFEEAMOUNT(String FEEAMOUNT) {
		this.FEEAMOUNT = FEEAMOUNT;
	}

	public String getFEENUM() {
		return FEENUM;
	}
	
	public void setFEENUM(String FEENUM) {
		this.FEENUM = FEENUM;
	}

	public Double getFEESTANDAMOUNT() {
		return FEESTANDAMOUNT;
	}
	
	public void setFEESTANDAMOUNT(Double FEESTANDAMOUNT) {
		this.FEESTANDAMOUNT = FEESTANDAMOUNT;
	}

	public Double getFEEDERATE() {
		return FEEDERATE;
	}
	
	public void setFEEDERATE(Double FEEDERATE) {
		this.FEEDERATE = FEEDERATE;
	}

	public Double getFEETOTAL() {
		return FEETOTAL;
	}
	
	public void setFEETOTAL(Double FEETOTAL) {
		this.FEETOTAL = FEETOTAL;
	}

	public String getREDUCEREASON() {
		return REDUCEREASON;
	}
	
	public void setREDUCEREASON(String REDUCEREASON) {
		this.REDUCEREASON = REDUCEREASON;
	}

	public String getAUDIPERSON() {
		return AUDIPERSON;
	}
	
	public void setAUDIPERSON(String AUDIPERSON) {
		this.AUDIPERSON = AUDIPERSON;
	}

	public Date getPAYTIME() {
		return PAYTIME;
	}
	
	public void setPAYTIME(Date PAYTIME) {
		this.PAYTIME = PAYTIME;
	}

	public String getSTATE() {
		return STATE;
	}
	
	public void setSTATE(String STATE) {
		this.STATE = STATE;
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