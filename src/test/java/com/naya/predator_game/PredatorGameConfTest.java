package com.naya.predator_game;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MockConf.class)
public class PredatorGameConfTest {
    @Autowired
    private Billy billy;

    @Autowired
    private Predator predator;
    @Test
    public void predatorKillNotDutch() {
        predator.fight(billy);
        Assert.assertFalse(billy.isAlive());
    }
}