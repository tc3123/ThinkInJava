package com.tc3.thinkInJava.bean;


import java.util.Date;

public class User {

  private long userId;
  private String userName;
  private Date cDate;
  private String pasword;
  private String name;
  private String phone;
  private String email;
  private String qq;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public Date getCDate() {
    return cDate;
  }

  public void setCDate(java.sql.Date cDate) {
    this.cDate = cDate;
  }


  public String getPasword() {
    return pasword;
  }

  public void setPasword(String pasword) {
    this.pasword = pasword;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

}
