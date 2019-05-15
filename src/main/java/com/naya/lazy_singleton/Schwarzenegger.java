package com.naya.lazy_singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class Schwarzenegger {
    @Autowired
    @Lazy
    private Ракетница ракетница;

    @EventListener(ContextRefreshedEvent.class)
    public void start() {
        if (враговМеньше100()) {
            битьБревном();
        } else {
            ракетница.бабах();
        }
    }

    private void битьБревном() {
        System.out.println("тыдыщ тыдыщ!!");
    }

    private boolean враговМеньше100() {
        return true;
    }

}
