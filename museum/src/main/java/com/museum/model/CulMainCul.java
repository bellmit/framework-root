package com.museum.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import com.framework.model.BaseModel;

/**
 *
 * This class was generated by MyBatis Generator. This class corresponds to the
 * database table cul_maincul
 *
 * @mbg.generated do_not_delete_during_merge Thu Mar 29 11:30:33 CST 2018
 */
public class CulMainCul extends BaseModel implements Serializable {
    /**
     * Database Column Remarks: 文物ID
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.CULID
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String culid;

    /**
     * Database Column Remarks: 文物所属单位
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.CULUNIT
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String culunit;

    /**
     * Database Column Remarks: 文物类型
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.CULTYPE
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String cultype;

    /**
     * Database Column Remarks: 级别
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.CULLEVEL
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String cullevel;

    /**
     * Database Column Remarks: 文物名称
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.CULNAME
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String culname;

    /**
     * Database Column Remarks: 创建人
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.creator
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String creator;

    /**
     * Database Column Remarks: 创建日期
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.createDate
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private Date createdate;

    /**
     * Database Column Remarks: 更新人
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.updatePersons
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String updatepersons;

    /**
     * Database Column Remarks: 更新日期
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.updateDate
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private Date updatedate;

    /**
     * Database Column Remarks: 是否审核
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.ISAUDIT
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String isaudit;

    /**
     * Database Column Remarks: 审核人员
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.AUDITUSER
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String audituser;

    /**
     * Database Column Remarks: 备注
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_maincul.remark
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private byte[] remark;

    private CulCustomDataDisp culCustomDataDisp;

    public CulCustomDataDisp getCulCustomDataDisp() {
	return culCustomDataDisp;
    }

    public void setCulCustomDataDisp(CulCustomDataDisp culCustomDataDisp) {
	this.culCustomDataDisp = culCustomDataDisp;
    }

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database table cul_maincul
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.CULID
     *
     * @return the value of cul_maincul.CULID
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getCulid() {
	return culid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.CULID
     *
     * @param culid
     *            the value for cul_maincul.CULID
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setCulid(String culid) {
	this.culid = culid == null ? null : culid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.CULUNIT
     *
     * @return the value of cul_maincul.CULUNIT
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getCulunit() {
	return culunit;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.CULUNIT
     *
     * @param culunit
     *            the value for cul_maincul.CULUNIT
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setCulunit(String culunit) {
	this.culunit = culunit == null ? null : culunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.CULTYPE
     *
     * @return the value of cul_maincul.CULTYPE
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getCultype() {
	return cultype;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.CULTYPE
     *
     * @param cultype
     *            the value for cul_maincul.CULTYPE
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setCultype(String cultype) {
	this.cultype = cultype == null ? null : cultype.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.CULLEVEL
     *
     * @return the value of cul_maincul.CULLEVEL
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getCullevel() {
	return cullevel;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.CULLEVEL
     *
     * @param cullevel
     *            the value for cul_maincul.CULLEVEL
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setCullevel(String cullevel) {
	this.cullevel = cullevel == null ? null : cullevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.CULNAME
     *
     * @return the value of cul_maincul.CULNAME
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getCulname() {
	return culname;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.CULNAME
     *
     * @param culname
     *            the value for cul_maincul.CULNAME
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setCulname(String culname) {
	this.culname = culname == null ? null : culname.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.creator
     *
     * @return the value of cul_maincul.creator
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getCreator() {
	return creator;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.creator
     *
     * @param creator
     *            the value for cul_maincul.creator
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setCreator(String creator) {
	this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.createDate
     *
     * @return the value of cul_maincul.createDate
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public Date getCreatedate() {
	return createdate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.createDate
     *
     * @param createdate
     *            the value for cul_maincul.createDate
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setCreatedate(Date createdate) {
	this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.updatePersons
     *
     * @return the value of cul_maincul.updatePersons
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getUpdatepersons() {
	return updatepersons;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.updatePersons
     *
     * @param updatepersons
     *            the value for cul_maincul.updatePersons
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setUpdatepersons(String updatepersons) {
	this.updatepersons = updatepersons == null ? null : updatepersons.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.updateDate
     *
     * @return the value of cul_maincul.updateDate
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public Date getUpdatedate() {
	return updatedate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.updateDate
     *
     * @param updatedate
     *            the value for cul_maincul.updateDate
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setUpdatedate(Date updatedate) {
	this.updatedate = updatedate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.ISAUDIT
     *
     * @return the value of cul_maincul.ISAUDIT
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getIsaudit() {
	return isaudit;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.ISAUDIT
     *
     * @param isaudit
     *            the value for cul_maincul.ISAUDIT
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setIsaudit(String isaudit) {
	this.isaudit = isaudit == null ? null : isaudit.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.AUDITUSER
     *
     * @return the value of cul_maincul.AUDITUSER
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getAudituser() {
	return audituser;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.AUDITUSER
     *
     * @param audituser
     *            the value for cul_maincul.AUDITUSER
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setAudituser(String audituser) {
	this.audituser = audituser == null ? null : audituser.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_maincul.remark
     *
     * @return the value of cul_maincul.remark
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public byte[] getRemark() {
	return remark;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_maincul.remark
     *
     * @param remark
     *            the value for cul_maincul.remark
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setRemark(byte[] remark) {
	this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table cul_maincul
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    @Override
    public Object getPrimaryKey() {
	return this.getCulid();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table cul_maincul
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(getClass().getSimpleName());
	sb.append(" [");
	sb.append("Hash = ").append(hashCode());
	sb.append(", culid=").append(culid);
	sb.append(", culunit=").append(culunit);
	sb.append(", cultype=").append(cultype);
	sb.append(", cullevel=").append(cullevel);
	sb.append(", culname=").append(culname);
	sb.append(", creator=").append(creator);
	sb.append(", createdate=").append(createdate);
	sb.append(", updatepersons=").append(updatepersons);
	sb.append(", updatedate=").append(updatedate);
	sb.append(", isaudit=").append(isaudit);
	sb.append(", audituser=").append(audituser);
	sb.append(", remark=").append(remark);
	sb.append(", serialVersionUID=").append(serialVersionUID);
	sb.append("]");
	return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table cul_maincul
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    @Override
    public boolean equals(Object that) {
	if (this == that) {
	    return true;
	}
	if (that == null) {
	    return false;
	}
	if (getClass() != that.getClass()) {
	    return false;
	}
	CulMainCul other = (CulMainCul) that;
	return (this.getCulid() == null ? other.getCulid() == null : this.getCulid().equals(other.getCulid()))
		&& (this.getCulunit() == null ? other.getCulunit() == null
			: this.getCulunit().equals(other.getCulunit()))
		&& (this.getCultype() == null ? other.getCultype() == null
			: this.getCultype().equals(other.getCultype()))
		&& (this.getCullevel() == null ? other.getCullevel() == null
			: this.getCullevel().equals(other.getCullevel()))
		&& (this.getCulname() == null ? other.getCulname() == null
			: this.getCulname().equals(other.getCulname()))
		&& (this.getCreator() == null ? other.getCreator() == null
			: this.getCreator().equals(other.getCreator()))
		&& (this.getCreatedate() == null ? other.getCreatedate() == null
			: this.getCreatedate().equals(other.getCreatedate()))
		&& (this.getUpdatepersons() == null ? other.getUpdatepersons() == null
			: this.getUpdatepersons().equals(other.getUpdatepersons()))
		&& (this.getUpdatedate() == null ? other.getUpdatedate() == null
			: this.getUpdatedate().equals(other.getUpdatedate()))
		&& (this.getIsaudit() == null ? other.getIsaudit() == null
			: this.getIsaudit().equals(other.getIsaudit()))
		&& (this.getAudituser() == null ? other.getAudituser() == null
			: this.getAudituser().equals(other.getAudituser()))
		&& (Arrays.equals(this.getRemark(), other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table cul_maincul
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((getCulid() == null) ? 0 : getCulid().hashCode());
	result = prime * result + ((getCulunit() == null) ? 0 : getCulunit().hashCode());
	result = prime * result + ((getCultype() == null) ? 0 : getCultype().hashCode());
	result = prime * result + ((getCullevel() == null) ? 0 : getCullevel().hashCode());
	result = prime * result + ((getCulname() == null) ? 0 : getCulname().hashCode());
	result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
	result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
	result = prime * result + ((getUpdatepersons() == null) ? 0 : getUpdatepersons().hashCode());
	result = prime * result + ((getUpdatedate() == null) ? 0 : getUpdatedate().hashCode());
	result = prime * result + ((getIsaudit() == null) ? 0 : getIsaudit().hashCode());
	result = prime * result + ((getAudituser() == null) ? 0 : getAudituser().hashCode());
	result = prime * result + (Arrays.hashCode(getRemark()));
	return result;
    }
}