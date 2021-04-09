package com.coder_tq.springcloud.service;

import com.coder_tq.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();

}
