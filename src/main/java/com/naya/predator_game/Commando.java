package com.naya.predator_game;

import lombok.Data;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */
@Data
public abstract class Commando {

    private boolean alive;
    public Commando() {
        System.out.println(getClass().getSimpleName()+" was created");
    }
}
