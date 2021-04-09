package com.coder_tq.springcloud.pojo;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
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

}
