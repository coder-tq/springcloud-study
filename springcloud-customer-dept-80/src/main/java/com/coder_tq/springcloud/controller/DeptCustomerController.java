package com.coder_tq.springcloud.controller;

import com.coder_tq.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptCustomerController {

    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("customer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,boolean.class);
    }

    @RequestMapping("/customer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/customer/dept/list")
    public List<Dept> list()
    {
        return  restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
