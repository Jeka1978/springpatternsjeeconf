package com.naya.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface MessageSender {

    @Autowired
    default void regMe(Pe4kin печкин) {
        печкин.register(this,myCode());
    }

    String send(Message message);

    String myCode();

}
