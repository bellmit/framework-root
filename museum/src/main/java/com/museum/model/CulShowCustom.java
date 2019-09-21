package com.museum.model;

import java.io.Serializable;
import java.util.Arrays;

import com.framework.model.BaseModel;

/**
 *
 * This class was generated by MyBatis Generator. This class corresponds to the
 * database table cul_mainshowcustom
 *
 * @mbg.generated do_not_delete_during_merge Thu Mar 29 15:57:31 CST 2018
 */
public class CulShowCustom extends BaseModel implements Serializable {
    /**
     * Database Column Remarks: customId
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_mainshowcustom.customId
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    private String customid;

    /**
     * Database Column Remarks: 指标ID
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_mainshowcustom.IndexID
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    private String indexid;

    /**
     * Database Column Remarks: 指标名
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_mainshowcustom.IndexName
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    private String indexname;

    /**
     * Database Column Remarks: 定制类型分为三种 1、缺省的定制 2、人员定制 3、单位缺省定制
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_mainshowcustom.customType
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    private String customtype;

    /**
     * Database Column Remarks: 定制业务ID，缺省时为0，其它为用户id或单位ID
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_mainshowcustom.customDataId
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    private String customdataid;

    /**
     * Database Column Remarks: 存储CUL_CustomDataDIS表中的列名，c01到c10列，第一次定制时，由系统自动对应
     * 后调整显示顺序时不再更改
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_mainshowcustom.colName
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    private String colname;

    /**
     * Database Column Remarks: 显示顺序
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_mainshowcustom.ShowSort
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    private Integer showsort;

    /**
     * Database Column Remarks: 备注
     *
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database column cul_mainshowcustom.remark
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    private byte[] remark;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the
     * database table cul_mainshowcustom
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_mainshowcustom.customId
     *
     * @return the value of cul_mainshowcustom.customId
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public String getCustomid() {
	return customid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_mainshowcustom.customId
     *
     * @param customid
     *            the value for cul_mainshowcustom.customId
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public void setCustomid(String customid) {
	this.customid = customid == null ? null : customid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_mainshowcustom.IndexID
     *
     * @return the value of cul_mainshowcustom.IndexID
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public String getIndexid() {
	return indexid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_mainshowcustom.IndexID
     *
     * @param indexid
     *            the value for cul_mainshowcustom.IndexID
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public void setIndexid(String indexid) {
	this.indexid = indexid == null ? null : indexid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_mainshowcustom.IndexName
     *
     * @return the value of cul_mainshowcustom.IndexName
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public String getIndexname() {
	return indexname;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_mainshowcustom.IndexName
     *
     * @param indexname
     *            the value for cul_mainshowcustom.IndexName
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public void setIndexname(String indexname) {
	this.indexname = indexname == null ? null : indexname.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_mainshowcustom.customType
     *
     * @return the value of cul_mainshowcustom.customType
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public String getCustomtype() {
	return customtype;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_mainshowcustom.customType
     *
     * @param customtype
     *            the value for cul_mainshowcustom.customType
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public void setCustomtype(String customtype) {
	this.customtype = customtype == null ? null : customtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_mainshowcustom.customDataId
     *
     * @return the value of cul_mainshowcustom.customDataId
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public String getCustomdataid() {
	return customdataid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_mainshowcustom.customDataId
     *
     * @param customdataid
     *            the value for cul_mainshowcustom.customDataId
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public void setCustomdataid(String customdataid) {
	this.customdataid = customdataid == null ? null : customdataid.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_mainshowcustom.colName
     *
     * @return the value of cul_mainshowcustom.colName
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public String getColname() {
	return colname;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_mainshowcustom.colName
     *
     * @param colname
     *            the value for cul_mainshowcustom.colName
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public void setColname(String colname) {
	this.colname = colname == null ? null : colname.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_mainshowcustom.ShowSort
     *
     * @return the value of cul_mainshowcustom.ShowSort
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public Integer getShowsort() {
	return showsort;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_mainshowcustom.ShowSort
     *
     * @param showsort
     *            the value for cul_mainshowcustom.ShowSort
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public void setShowsort(Integer showsort) {
	this.showsort = showsort;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value
     * of the database column cul_mainshowcustom.remark
     *
     * @return the value of cul_mainshowcustom.remark
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public byte[] getRemark() {
	return remark;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of
     * the database column cul_mainshowcustom.remark
     *
     * @param remark
     *            the value for cul_mainshowcustom.remark
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    public void setRemark(byte[] remark) {
	this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table cul_mainshowcustom
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    @Override
    public Object getPrimaryKey() {
	return this.getCustomid();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table cul_mainshowcustom
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(getClass().getSimpleName());
	sb.append(" [");
	sb.append("Hash = ").append(hashCode());
	sb.append(", customid=").append(customid);
	sb.append(", indexid=").append(indexid);
	sb.append(", indexname=").append(indexname);
	sb.append(", customtype=").append(customtype);
	sb.append(", customdataid=").append(customdataid);
	sb.append(", colname=").append(colname);
	sb.append(", showsort=").append(showsort);
	sb.append(", remark=").append(remark);
	sb.append(", serialVersionUID=").append(serialVersionUID);
	sb.append("]");
	return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table cul_mainshowcustom
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
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
	CulShowCustom other = (CulShowCustom) that;
	// return (this.getCustomid() == null ? other.getCustomid() == null :
	// this.getCustomid().equals(other.getCustomid()))
	// && (this.getIndexid() == null ? other.getIndexid() == null :
	// this.getIndexid().equals(other.getIndexid()))
	// && (this.getIndexname() == null ? other.getIndexname() == null :
	// this.getIndexname().equals(other.getIndexname()))
	// && (this.getCustomtype() == null ? other.getCustomtype() == null :
	// this.getCustomtype().equals(other.getCustomtype()))
	// && (this.getCustomdataid() == null ? other.getCustomdataid() == null :
	// this.getCustomdataid().equals(other.getCustomdataid()))
	// && (this.getColname() == null ? other.getColname() == null :
	// this.getColname().equals(other.getColname()))
	// && (this.getShowsort() == null ? other.getShowsort() == null :
	// this.getShowsort().equals(other.getShowsort()))
	// && (Arrays.equals(this.getRemark(), other.getRemark()));
	return this.getIndexid() == null ? other.getIndexid() == null : this.getIndexid().equals(other.getIndexid());

    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table cul_mainshowcustom
     *
     * @mbg.generated Thu Mar 29 15:57:31 CST 2018
     */
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((getCustomid() == null) ? 0 : getCustomid().hashCode());
	result = prime * result + ((getIndexid() == null) ? 0 : getIndexid().hashCode());
	result = prime * result + ((getIndexname() == null) ? 0 : getIndexname().hashCode());
	result = prime * result + ((getCustomtype() == null) ? 0 : getCustomtype().hashCode());
	result = prime * result + ((getCustomdataid() == null) ? 0 : getCustomdataid().hashCode());
	result = prime * result + ((getColname() == null) ? 0 : getColname().hashCode());
	result = prime * result + ((getShowsort() == null) ? 0 : getShowsort().hashCode());
	result = prime * result + (Arrays.hashCode(getRemark()));
	return result;
    }
}