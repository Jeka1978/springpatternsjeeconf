package com.naya.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
public class DistributionController {
    @Autowired
    private Pe4kin печкин;

    @PostMapping("/send")
    public String distribute(@RequestBody Message message) {
        return печкин.distribute(message);
    }
}
