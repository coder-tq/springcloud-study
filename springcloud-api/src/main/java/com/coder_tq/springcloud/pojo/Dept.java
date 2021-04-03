package com.coder_tq.springcloud.pojo;


import java.io.Serializable;

public class Dept implements Serializable {

  private long deptno;//主键
  private String deptname;

  //该数据存储在哪个数据库的字段，同一个信息可能在不同的数据库。
  private String dbSource;

  public Dept() {
  }

  public Dept(String deptname) {
    this.deptname = deptname;
  }

  public long getDeptno() {
    return deptno;
  }

  public void setDeptno(long deptno) {
    this.deptno = deptno;
  }


  public String getDeptname() {
    return deptname;
  }

  public void setDeptname(String deptname) {
    this.deptname = deptname;
  }


  public String getDbSource() {
    return dbSource;
  }

  public void setDbSource(String dbSource) {
    this.dbSource = dbSource;
  }

}
