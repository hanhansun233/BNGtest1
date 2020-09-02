package com.BNGtest.www.service.impl;

import com.BNGtest.www.dao.ManagerDao;
import com.BNGtest.www.dao.impl.ManagerDaoImpl;
import com.BNGtest.www.po.Manager;
import com.BNGtest.www.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {

    ManagerDao managerDao = new ManagerDaoImpl();

    @Override
    public boolean login(String managerId, String passWord) {
        Manager manager = managerDao.queryManagerByIdAndPwd(managerId,passWord);
        if (manager != null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Manager queryManagerById(String managerId) {
        return managerDao.queryManagerById(managerId);
    }
}
