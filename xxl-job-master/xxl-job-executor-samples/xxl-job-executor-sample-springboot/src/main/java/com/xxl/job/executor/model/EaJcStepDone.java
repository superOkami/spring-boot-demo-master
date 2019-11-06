package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("ea_jc_step_done")
public class EaJcStepDone {
	@TableField("ORGBUSNO")
	private String ORGBUSNO;	//原系统业务流水号。主键，具体数据的唯一 id，中间 库表之间数据的关联，不可空 
	@TableField("PROJID")
	private String PROJID;	//"申办号。主键，为办件的唯一标识，由业rn务系统按规则自动生成，不可空 "
	@TableField("STDVER")
	private Integer STDVER;	//标准版本号。描述使用的数据采集标准的版 本号， 不可空
	@TableField("REGION_ID")
	private String REGIONID;	//行政区划。可为空，默认值：370000 
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认为 1，用于重报数据 的情况。不可空
	@TableField("DONERESULT")
	private String DONERESULT;	//办结结果。办结结果代码：0 – 出证办 结（正常产生证照、批文的办 结），1 – 退回办结（退回或 驳回申请的办结），2 – 作废 办结（指业务处理上无效的纪 录），3 – 删除办结（指录入 错误、操作错误等技术上的无 效纪录），4 – 转报办结（指 转报其他单位或上级单位的 办结情况），5 – 补正不来办 结（指出现补正告知时，通知 之后，申请人长期不来补正材 料的办结），6 – 办结（除以 上所述情况外的办结）。不可空
	@TableField("EXITRES")
	private String EXITRES;	//作废或退回原 因。在办结结果是上述的 1、 2、 3、 4、5 时，本字段必须写明原 因。
	@TableField("CERTIFICATENAM")
	private String CERTIFICATENAM;	//证件名称。提供的有效证件名称，包括身 份证、组织机构代码证等详见 数据字典证件类型，可为空 
	@TableField("CERTIFICATENO")
	private String CERTIFICATENO;	//证件编号。如果出证办结，必须有证件编 号（可为空） 
	@TableField("CERTIFICATELIMIT")
	private String CERTIFICATELIMIT;	//证件有效期限。如果出证办结，必须有（可为空）
	@TableField("PUBLISHER")
	private String PUBLISHER;	//发证/盖章单位。如果出证办结，必须有（可为空）
	@TableField("ISFEE")
	private String ISFEE;	//是否收费 0不收 1-收。不可空。1-是，0-否
	@TableField("FEE")
	private Integer FEE;	//收费金额。如果收费，不可空（可为空）rn
	@TableField("FEESTANDARD")
	private String FEESTANDARD;	//收费标准。如果收费，不可空（可为空）rn 
	@TableField("FEESTANDACCORD")
	private String FEESTANDACCORD;	//收费依据。如果收费，不可空（可为空）rn 
	@TableField("PAYPERSONNAME")
	private String PAYPERSONNAME;	//缴费人姓名。如果收费，不可空(可为空) 
	@TableField("PAYPERIDCARD")
	private String PAYPERIDCARD;	//缴费人身份证 号。如果收费，不可空(可为空) 
	@TableField("PAYERMOBILE")
	private String PAYERMOBILE;	//缴费人手机号。如果收费，不可空(可为空) 
	@TableField("PAYERTEL")
	private String PAYERTEL;	//缴费人电话。如果收费，不可空(可为空) 
	@TableField("OCCURTIME")
	private Date OCCURTIME;	//环节发生时间。环节发生时间，非空 
	@TableField("TRANSACTOR")
	private String TRANSACTOR;	//环节办理人。环节办理人，非空 
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

	public String getREGIONID() {
		return REGIONID;
	}
	
	public void setREGIONID(String REGIONID) {
		this.REGIONID = REGIONID;
	}

	public Integer getDATAVER() {
		return DATAVER;
	}
	
	public void setDATAVER(Integer DATAVER) {
		this.DATAVER = DATAVER;
	}

	public String getDONERESULT() {
		return DONERESULT;
	}
	
	public void setDONERESULT(String DONERESULT) {
		this.DONERESULT = DONERESULT;
	}

	public String getEXITRES() {
		return EXITRES;
	}
	
	public void setEXITRES(String EXITRES) {
		this.EXITRES = EXITRES;
	}

	public String getCERTIFICATENAM() {
		return CERTIFICATENAM;
	}
	
	public void setCERTIFICATENAM(String CERTIFICATENAM) {
		this.CERTIFICATENAM = CERTIFICATENAM;
	}

	public String getCERTIFICATENO() {
		return CERTIFICATENO;
	}
	
	public void setCERTIFICATENO(String CERTIFICATENO) {
		this.CERTIFICATENO = CERTIFICATENO;
	}

	public String getCERTIFICATELIMIT() {
		return CERTIFICATELIMIT;
	}
	
	public void setCERTIFICATELIMIT(String CERTIFICATELIMIT) {
		this.CERTIFICATELIMIT = CERTIFICATELIMIT;
	}

	public String getPUBLISHER() {
		return PUBLISHER;
	}
	
	public void setPUBLISHER(String PUBLISHER) {
		this.PUBLISHER = PUBLISHER;
	}

	public String getISFEE() {
		return ISFEE;
	}
	
	public void setISFEE(String ISFEE) {
		this.ISFEE = ISFEE;
	}

	public Integer getFEE() {
		return FEE;
	}
	
	public void setFEE(Integer FEE) {
		this.FEE = FEE;
	}

	public String getFEESTANDARD() {
		return FEESTANDARD;
	}
	
	public void setFEESTANDARD(String FEESTANDARD) {
		this.FEESTANDARD = FEESTANDARD;
	}

	public String getFEESTANDACCORD() {
		return FEESTANDACCORD;
	}
	
	public void setFEESTANDACCORD(String FEESTANDACCORD) {
		this.FEESTANDACCORD = FEESTANDACCORD;
	}

	public String getPAYPERSONNAME() {
		return PAYPERSONNAME;
	}
	
	public void setPAYPERSONNAME(String PAYPERSONNAME) {
		this.PAYPERSONNAME = PAYPERSONNAME;
	}

	public String getPAYPERIDCARD() {
		return PAYPERIDCARD;
	}
	
	public void setPAYPERIDCARD(String PAYPERIDCARD) {
		this.PAYPERIDCARD = PAYPERIDCARD;
	}

	public String getPAYERMOBILE() {
		return PAYERMOBILE;
	}
	
	public void setPAYERMOBILE(String PAYERMOBILE) {
		this.PAYERMOBILE = PAYERMOBILE;
	}

	public String getPAYERTEL() {
		return PAYERTEL;
	}
	
	public void setPAYERTEL(String PAYERTEL) {
		this.PAYERTEL = PAYERTEL;
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