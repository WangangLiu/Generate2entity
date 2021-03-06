package model;

import java.util.Date;

public class Student {
    /**
     * <pre>
     * 表字段 : STUDENT.STUID
     * </pre>
     * 
     */
    private Short stuid;

    /**
     * <pre>
     * 表字段 : STUDENT.STUNAME
     * </pre>
     * 
     */
    private String stuname;

    /**
     * <pre>
     * 表字段 : STUDENT.GENDER
     * </pre>
     * 
     */
    private String gender;

    /**
     * <pre>
     * 表字段 : STUDENT.AGE
     * </pre>
     * 
     */
    private Short age;

    /**
     * <pre>
     * 表字段 : STUDENT.JOINDATE
     * </pre>
     * 
     */
    private Date joindate;

    /**
     * <pre>
     * 表字段 : STUDENT.CLASSID
     * </pre>
     * 
     */
    private Short classid;

    /**
     * <pre>
     * 表字段 : STUDENT.ADDRESS
     * </pre>
     * 
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.STUID
     *
     * @return the value of STUDENT.STUID
     *
     * @mbg.generated
     */
    public Short getStuid() {
        return stuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.STUID
     *
     * @param stuid the value for STUDENT.STUID
     *
     * @mbg.generated
     */
    public void setStuid(Short stuid) {
        this.stuid = stuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.STUNAME
     *
     * @return the value of STUDENT.STUNAME
     *
     * @mbg.generated
     */
    public String getStuname() {
        return stuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.STUNAME
     *
     * @param stuname the value for STUDENT.STUNAME
     *
     * @mbg.generated
     */
    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.GENDER
     *
     * @return the value of STUDENT.GENDER
     *
     * @mbg.generated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.GENDER
     *
     * @param gender the value for STUDENT.GENDER
     *
     * @mbg.generated
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.AGE
     *
     * @return the value of STUDENT.AGE
     *
     * @mbg.generated
     */
    public Short getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.AGE
     *
     * @param age the value for STUDENT.AGE
     *
     * @mbg.generated
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.JOINDATE
     *
     * @return the value of STUDENT.JOINDATE
     *
     * @mbg.generated
     */
    public Date getJoindate() {
        return joindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.JOINDATE
     *
     * @param joindate the value for STUDENT.JOINDATE
     *
     * @mbg.generated
     */
    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.CLASSID
     *
     * @return the value of STUDENT.CLASSID
     *
     * @mbg.generated
     */
    public Short getClassid() {
        return classid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.CLASSID
     *
     * @param classid the value for STUDENT.CLASSID
     *
     * @mbg.generated
     */
    public void setClassid(Short classid) {
        this.classid = classid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STUDENT.ADDRESS
     *
     * @return the value of STUDENT.ADDRESS
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STUDENT.ADDRESS
     *
     * @param address the value for STUDENT.ADDRESS
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }
}