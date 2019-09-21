package com.museum.model;

import com.framework.model.BaseModel;
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cul_customdatadisp
 *
 * @mbg.generated do_not_delete_during_merge Thu Mar 29 11:30:33 CST 2018
 */
public class CulCustomDataDisp extends BaseModel implements Serializable {
    /**
     * Database Column Remarks:
     *   文物ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.CULID
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String culid;

    /**
     * Database Column Remarks:
     *   第1列
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C01
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c01;

    /**
     * Database Column Remarks:
     *   第2列
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C02
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c02;

    /**
     * Database Column Remarks:
     *   第3列
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C03
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c03;

    /**
     * Database Column Remarks:
     *   C04
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C04
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c04;

    /**
     * Database Column Remarks:
     *   C05
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C05
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c05;

    /**
     * Database Column Remarks:
     *   C06
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C06
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c06;

    /**
     * Database Column Remarks:
     *   C07
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C07
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c07;

    /**
     * Database Column Remarks:
     *   C08
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C08
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c08;

    /**
     * Database Column Remarks:
     *   C09
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C09
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c09;

    /**
     * Database Column Remarks:
     *   C10
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.C10
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private String c10;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cul_customdatadisp.remark
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private byte[] remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cul_customdatadisp
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.CULID
     *
     * @return the value of cul_customdatadisp.CULID
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getCulid() {
        return culid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.CULID
     *
     * @param culid the value for cul_customdatadisp.CULID
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setCulid(String culid) {
        this.culid = culid == null ? null : culid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C01
     *
     * @return the value of cul_customdatadisp.C01
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC01() {
        return c01;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C01
     *
     * @param c01 the value for cul_customdatadisp.C01
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC01(String c01) {
        this.c01 = c01 == null ? null : c01.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C02
     *
     * @return the value of cul_customdatadisp.C02
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC02() {
        return c02;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C02
     *
     * @param c02 the value for cul_customdatadisp.C02
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC02(String c02) {
        this.c02 = c02 == null ? null : c02.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C03
     *
     * @return the value of cul_customdatadisp.C03
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC03() {
        return c03;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C03
     *
     * @param c03 the value for cul_customdatadisp.C03
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC03(String c03) {
        this.c03 = c03 == null ? null : c03.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C04
     *
     * @return the value of cul_customdatadisp.C04
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC04() {
        return c04;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C04
     *
     * @param c04 the value for cul_customdatadisp.C04
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC04(String c04) {
        this.c04 = c04 == null ? null : c04.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C05
     *
     * @return the value of cul_customdatadisp.C05
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC05() {
        return c05;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C05
     *
     * @param c05 the value for cul_customdatadisp.C05
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC05(String c05) {
        this.c05 = c05 == null ? null : c05.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C06
     *
     * @return the value of cul_customdatadisp.C06
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC06() {
        return c06;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C06
     *
     * @param c06 the value for cul_customdatadisp.C06
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC06(String c06) {
        this.c06 = c06 == null ? null : c06.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C07
     *
     * @return the value of cul_customdatadisp.C07
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC07() {
        return c07;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C07
     *
     * @param c07 the value for cul_customdatadisp.C07
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC07(String c07) {
        this.c07 = c07 == null ? null : c07.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C08
     *
     * @return the value of cul_customdatadisp.C08
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC08() {
        return c08;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C08
     *
     * @param c08 the value for cul_customdatadisp.C08
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC08(String c08) {
        this.c08 = c08 == null ? null : c08.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C09
     *
     * @return the value of cul_customdatadisp.C09
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC09() {
        return c09;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C09
     *
     * @param c09 the value for cul_customdatadisp.C09
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC09(String c09) {
        this.c09 = c09 == null ? null : c09.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.C10
     *
     * @return the value of cul_customdatadisp.C10
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public String getC10() {
        return c10;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.C10
     *
     * @param c10 the value for cul_customdatadisp.C10
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setC10(String c10) {
        this.c10 = c10 == null ? null : c10.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cul_customdatadisp.remark
     *
     * @return the value of cul_customdatadisp.remark
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public byte[] getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cul_customdatadisp.remark
     *
     * @param remark the value for cul_customdatadisp.remark
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    public void setRemark(byte[] remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cul_customdatadisp
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    @Override
    public Object getPrimaryKey() {
        return this.getCulid();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cul_customdatadisp
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
        sb.append(", c01=").append(c01);
        sb.append(", c02=").append(c02);
        sb.append(", c03=").append(c03);
        sb.append(", c04=").append(c04);
        sb.append(", c05=").append(c05);
        sb.append(", c06=").append(c06);
        sb.append(", c07=").append(c07);
        sb.append(", c08=").append(c08);
        sb.append(", c09=").append(c09);
        sb.append(", c10=").append(c10);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cul_customdatadisp
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
        CulCustomDataDisp other = (CulCustomDataDisp) that;
        return (this.getCulid() == null ? other.getCulid() == null : this.getCulid().equals(other.getCulid()))
            && (this.getC01() == null ? other.getC01() == null : this.getC01().equals(other.getC01()))
            && (this.getC02() == null ? other.getC02() == null : this.getC02().equals(other.getC02()))
            && (this.getC03() == null ? other.getC03() == null : this.getC03().equals(other.getC03()))
            && (this.getC04() == null ? other.getC04() == null : this.getC04().equals(other.getC04()))
            && (this.getC05() == null ? other.getC05() == null : this.getC05().equals(other.getC05()))
            && (this.getC06() == null ? other.getC06() == null : this.getC06().equals(other.getC06()))
            && (this.getC07() == null ? other.getC07() == null : this.getC07().equals(other.getC07()))
            && (this.getC08() == null ? other.getC08() == null : this.getC08().equals(other.getC08()))
            && (this.getC09() == null ? other.getC09() == null : this.getC09().equals(other.getC09()))
            && (this.getC10() == null ? other.getC10() == null : this.getC10().equals(other.getC10()))
            && (Arrays.equals(this.getRemark(), other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cul_customdatadisp
     *
     * @mbg.generated Thu Mar 29 11:30:33 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCulid() == null) ? 0 : getCulid().hashCode());
        result = prime * result + ((getC01() == null) ? 0 : getC01().hashCode());
        result = prime * result + ((getC02() == null) ? 0 : getC02().hashCode());
        result = prime * result + ((getC03() == null) ? 0 : getC03().hashCode());
        result = prime * result + ((getC04() == null) ? 0 : getC04().hashCode());
        result = prime * result + ((getC05() == null) ? 0 : getC05().hashCode());
        result = prime * result + ((getC06() == null) ? 0 : getC06().hashCode());
        result = prime * result + ((getC07() == null) ? 0 : getC07().hashCode());
        result = prime * result + ((getC08() == null) ? 0 : getC08().hashCode());
        result = prime * result + ((getC09() == null) ? 0 : getC09().hashCode());
        result = prime * result + ((getC10() == null) ? 0 : getC10().hashCode());
        result = prime * result + (Arrays.hashCode(getRemark()));
        return result;
    }
}