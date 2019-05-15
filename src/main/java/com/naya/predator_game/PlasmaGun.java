package com.naya.predator_game;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class PlasmaGun {
    public void shoot(Commando commando) {
        if (!commando.getClass().equals(Dutch.class)) {
            commando.setAlive(false);
        }
    }
}
