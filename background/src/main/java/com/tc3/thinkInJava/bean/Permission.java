package com.tc3.thinkInJava.bean;


public class Permission {

  private long permissionId;
  private String permissionName;
  private String permissionDesc;


  public long getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(long permissionId) {
    this.permissionId = permissionId;
  }


  public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }


  public String getPermissionDesc() {
    return permissionDesc;
  }

  public void setPermissionDesc(String permissionDesc) {
    this.permissionDesc = permissionDesc;
  }

}
