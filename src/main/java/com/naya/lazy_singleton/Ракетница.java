package com.naya.lazy_singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@Lazy
public class Ракетница {
    @PostConstruct
    private void init(){
        System.out.println("Ракетница доставлена");
    }

    public void бабах() {
        System.out.println("Трах бабах!!!");
    }

}
