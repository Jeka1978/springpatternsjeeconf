package com.naya.exception_handling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class JEEconfServiceImpl implements JEEconfService {
    @Autowired
    private JEEConfDao JEEConfDao;

    @Override
    public void saveModel() {
        JEEConfDao.save();
    }
}
