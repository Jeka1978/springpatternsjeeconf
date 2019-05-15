

package com.naya.exception_handling;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class JEEConfDaoImpl implements JEEConfDao {
    @Override
    public void save() {
        throw new DBException("говно ваша база");
    }
}
