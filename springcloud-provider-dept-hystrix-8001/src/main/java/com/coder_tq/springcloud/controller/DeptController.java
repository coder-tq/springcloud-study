package com.coder_tq.springcloud.controller;

import com.coder_tq.springcloud.pojo.Dept;
import com.coder_tq.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    private DeptService deptService;

    @Autowired
    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.queryById(id);
        if (dept == null){
            throw new RuntimeException("id " + id + " 不存在");
        }
        return dept;
    }

    public Dept hystrixGet(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDeptname("查询失败").setDbSource("查询失败");
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.queryAll();
    }
}
 