package com.phdua.manager.service.impl.user;

import com.phdua.manager.service.user.IUserService;
import com.phdua.manager.service.user.IUserTransactionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IUserTransactionalServiceImpl implements IUserTransactionalService {

    @Autowired
    private IUserService iUserService;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Boolean updateInsertUser() {

        iUserService.insertUser();




        try {
            iUserService.updateUser();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;
    }
}
