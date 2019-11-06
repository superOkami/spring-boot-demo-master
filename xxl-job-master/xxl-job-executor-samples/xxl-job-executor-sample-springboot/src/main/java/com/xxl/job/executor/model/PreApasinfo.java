package com.xxl.job.executor.model;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

@TableName("pre_apasinfo")
public class PreApasinfo {
	@TableField("PROJID")
	private String PROJID;	//"申办号。主键，作为办件的唯一标rn识，由业务系统按规则自rn动生成，不可空"
	@TableField("PROJPWD")
	private String PROJPWD;	//"查询密码。由业务系统随机自动生rn成的数字，如：234765，rn不可空 "
	@TableField("ITEMNO")
	private String ITEMNO;	//"审批事项编号。审批事项的唯一标示，不rn可空"
	@TableField("ITEMVERSION")
	private Integer ITEMVERSION;	//审批事项的版本号，可为空
	@TableField("ITEMNAME")
	private String ITEMNAME;	//"审批事项名称。申报的事项名称，如：交rn通建设工程施工许可，不rn可空 rn"
	@TableField("PROJECTNAME")
	private String PROJECTNAME;	//"申报名称。申请审批的项目的具体rn名称。如：关于 XXX 的交rn通建设工程施工许可，不rn可空 "
	@TableField("PROJECTSTATE")
	private String PROJECTSTATE;	//办件状态。请参考字典项：办件状态 
	@TableField("INFOTYPE")
	private String INFOTYPE;	//办件类型。不可空，1-即办件，2rn承诺件，3-联办件，4rn上报件。 rn
	@TableField("ACCEPTLIST")
	private String ACCEPTLIST;	//申报材料清单。不可空。 格式为 ：rnid:name,id:name,··· 
	@TableField("APPLYNAME")
	private String APPLYNAME;	//申报者名称。填写申报者的名称，如为rn个人，则填写姓名；如为rn法人，则填写单位名称，rn不可空 
	@TableField("APPLY_CARDTYPE")
	private String APPLYCARDTYPE;	//申报者证件类型。申报者提供的有效证件rn名称，包括身份证、组织rn机构代码证等，详见 数rn据字典中编号证件类型，rn可为空 
	@TableField("APPLY_CARDTYPENUMBER")
	private String APPLYCARDTYPENUMBER;	//申报者证件号码。申报者提供的有效证件rn的识别号。如身份证号rn码： rn340102198805059786，可rn为空
	@TableField("CONTACTMAN")
	private String CONTACTMAN;	//联系人/代理人姓名。如果无代理人，联系人就是申报者，不可空 
	@TableField("CONTACTMAN_CARDTYPE")
	private String CONTACTMANCARDTYPE;	//联系人/代理人证件类型。提供的有效证件名称，包rn括身份证、组织机构代码rn证等详见数据字典证件rn类型，可为空 
	@TableField("CONTACTMAN_CARDNUMBER")
	private String CONTACTMANCARDNUMBER;	//联系人/代理人证件号码。提供的有效证件的识别rn号。如身份证号码： rn340111199303222102，可rn为空
	@TableField("TELPHONE")
	private String TELPHONE;	//联系人手机号码。申报者的联系号码，可为rn空 
	@TableField("POSTCODE")
	private String POSTCODE;	//邮编。申报者联系地址对应的rn邮政编码，可为空
	@TableField("ADDRESS")
	private String ADDRESS;	//通讯地址。申报者的联系地址，可为空
	@TableField("LEGALMAN")
	private String LEGALMAN;	//法人代表。对于企事业单位，填写对应的法人代，可为空 
	@TableField("DEPTID")
	private String DEPTID;	//收件部门编码。审批事项所对应的负责部门组织机构代码，不可空
	@TableField("DEPTNAME")
	private String DEPTNAME;	//收件部门名称。审批事项所对应的负责rn部门名称，不可空
	@TableField("RECEIVE_USEID")
	private String RECEIVEUSEID;	//创建用户标识。创建用户唯一标识，可为空 
	@TableField("RECEIVE_NAME")
	private String RECEIVENAME;	//创建用户名称。创建用户名称，可为空 
	@TableField("APPLYFROM")
	private String APPLYFROM;	//申报来源。标识办件的申报源头：网rn上、窗口、其它。不可空
	@TableField("RECEIVETIME")
	private Date RECEIVETIME;	//申报时间。时间格式：yyyy-mm-dd rnhh24:mi:ss。不可空 
	@TableField("APPROVE_TYPE")
	private String APPROVETYPE;	//审批类型。详见 数据字典中编号事rn项类型编码。不可空 
	@TableField("REGION_ID")
	private String REGIONID;	//行政区划。可为空，默认值：370000 
	@TableField("DATASTATE")
	private String DATASTATE;	//数据状态。标识办件是否为有效件，rn默认是有效。0=作废 1=rn有效，不可空 
	@TableField("CREATE_TIME")
	private String CREATETIME;	//数据产生时间。由各业务系统产生，时间rn格 式 ：rnyyyy-mm-ddhh24:mi:ss，rn不可空
	@TableField("DATAVER")
	private Integer DATAVER;	//数据版本号。主键，默认值=1，如果有rn信息变更，则版本号递增
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

	public String getITEMNO() {
		return ITEMNO;
	}
	
	public void setITEMNO(String ITEMNO) {
		this.ITEMNO = ITEMNO;
	}

	public Integer getITEMVERSION() {
		return ITEMVERSION;
	}
	
	public void setITEMVERSION(Integer ITEMVERSION) {
		this.ITEMVERSION = ITEMVERSION;
	}

	public String getITEMNAME() {
		return ITEMNAME;
	}
	
	public void setITEMNAME(String ITEMNAME) {
		this.ITEMNAME = ITEMNAME;
	}

	public String getPROJECTNAME() {
		return PROJECTNAME;
	}
	
	public void setPROJECTNAME(String PROJECTNAME) {
		this.PROJECTNAME = PROJECTNAME;
	}

	public String getPROJECTSTATE() {
		return PROJECTSTATE;
	}
	
	public void setPROJECTSTATE(String PROJECTSTATE) {
		this.PROJECTSTATE = PROJECTSTATE;
	}

	public String getINFOTYPE() {
		return INFOTYPE;
	}
	
	public void setINFOTYPE(String INFOTYPE) {
		this.INFOTYPE = INFOTYPE;
	}

	public String getACCEPTLIST() {
		return ACCEPTLIST;
	}
	
	public void setACCEPTLIST(String ACCEPTLIST) {
		this.ACCEPTLIST = ACCEPTLIST;
	}

	public String getAPPLYNAME() {
		return APPLYNAME;
	}
	
	public void setAPPLYNAME(String APPLYNAME) {
		this.APPLYNAME = APPLYNAME;
	}

	public String getAPPLYCARDTYPE() {
		return APPLYCARDTYPE;
	}
	
	public void setAPPLYCARDTYPE(String APPLYCARDTYPE) {
		this.APPLYCARDTYPE = APPLYCARDTYPE;
	}

	public String getAPPLYCARDTYPENUMBER() {
		return APPLYCARDTYPENUMBER;
	}
	
	public void setAPPLYCARDTYPENUMBER(String APPLYCARDTYPENUMBER) {
		this.APPLYCARDTYPENUMBER = APPLYCARDTYPENUMBER;
	}

	public String getCONTACTMAN() {
		return CONTACTMAN;
	}
	
	public void setCONTACTMAN(String CONTACTMAN) {
		this.CONTACTMAN = CONTACTMAN;
	}

	public String getCONTACTMANCARDTYPE() {
		return CONTACTMANCARDTYPE;
	}
	
	public void setCONTACTMANCARDTYPE(String CONTACTMANCARDTYPE) {
		this.CONTACTMANCARDTYPE = CONTACTMANCARDTYPE;
	}

	public String getCONTACTMANCARDNUMBER() {
		return CONTACTMANCARDNUMBER;
	}
	
	public void setCONTACTMANCARDNUMBER(String CONTACTMANCARDNUMBER) {
		this.CONTACTMANCARDNUMBER = CONTACTMANCARDNUMBER;
	}

	public String getTELPHONE() {
		return TELPHONE;
	}
	
	public void setTELPHONE(String TELPHONE) {
		this.TELPHONE = TELPHONE;
	}

	public String getPOSTCODE() {
		return POSTCODE;
	}
	
	public void setPOSTCODE(String POSTCODE) {
		this.POSTCODE = POSTCODE;
	}

	public String getADDRESS() {
		return ADDRESS;
	}
	
	public void setADDRESS(String ADDRESS) {
		this.ADDRESS = ADDRESS;
	}

	public String getLEGALMAN() {
		return LEGALMAN;
	}
	
	public void setLEGALMAN(String LEGALMAN) {
		this.LEGALMAN = LEGALMAN;
	}

	public String getDEPTID() {
		return DEPTID;
	}
	
	public void setDEPTID(String DEPTID) {
		this.DEPTID = DEPTID;
	}

	public String getDEPTNAME() {
		return DEPTNAME;
	}
	
	public void setDEPTNAME(String DEPTNAME) {
		this.DEPTNAME = DEPTNAME;
	}

	public String getRECEIVEUSEID() {
		return RECEIVEUSEID;
	}
	
	public void setRECEIVEUSEID(String RECEIVEUSEID) {
		this.RECEIVEUSEID = RECEIVEUSEID;
	}

	public String getRECEIVENAME() {
		return RECEIVENAME;
	}
	
	public void setRECEIVENAME(String RECEIVENAME) {
		this.RECEIVENAME = RECEIVENAME;
	}

	public String getAPPLYFROM() {
		return APPLYFROM;
	}
	
	public void setAPPLYFROM(String APPLYFROM) {
		this.APPLYFROM = APPLYFROM;
	}

	public Date getRECEIVETIME() {
		return RECEIVETIME;
	}
	
	public void setRECEIVETIME(Date RECEIVETIME) {
		this.RECEIVETIME = RECEIVETIME;
	}

	public String getAPPROVETYPE() {
		return APPROVETYPE;
	}
	
	public void setAPPROVETYPE(String APPROVETYPE) {
		this.APPROVETYPE = APPROVETYPE;
	}

	public String getREGIONID() {
		return REGIONID;
	}
	
	public void setREGIONID(String REGIONID) {
		this.REGIONID = REGIONID;
	}

	public String getDATASTATE() {
		return DATASTATE;
	}
	
	public void setDATASTATE(String DATASTATE) {
		this.DATASTATE = DATASTATE;
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