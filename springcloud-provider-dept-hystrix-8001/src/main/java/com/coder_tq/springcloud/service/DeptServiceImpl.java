package com.coder_tq.springcloud.service;

import com.coder_tq.springcloud.dao.DeptDao;
import com.coder_tq.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    private DeptDao deptDao;
    @Autowired
    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
