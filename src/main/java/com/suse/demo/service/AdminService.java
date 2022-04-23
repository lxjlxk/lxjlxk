package com.suse.demo.service;

import com.suse.demo.entity.Admin;

public interface AdminService {
    Admin login(Admin admin);

    boolean selectByName(String name);

    int insertAdmin(Admin admin);
}
