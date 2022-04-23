package com.suse.demo.service;

import com.suse.demo.entity.Admin;
import com.suse.demo.entity.AdminExample;
import com.suse.demo.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin) {
        AdminExample adminExample=new AdminExample();
        adminExample.createCriteria().andUsernameEqualTo(admin.getUsername()).andPasswordEqualTo(admin.getPassword());
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return (admins.size()>0?admins.get(0):null);
    }

    @Override
    public boolean selectByName(String name) {
        AdminExample adminExample=new AdminExample();
        adminExample.createCriteria().andUsernameEqualTo(name);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return (admins.size()==0?true:false);
    }

    @Override
    public int insertAdmin(Admin admin) {
        return adminMapper.insert(admin);
    }
}
