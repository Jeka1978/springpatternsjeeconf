package com.naya.never_use_switch;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;


/**
 * @author Evgeny Borisov
 */
@RestController
public class Pe4kin {


    private Map<String, MessageSender> map = new HashMap<>();

    public void register(MessageSender sender, String code) {
        map.put(code, sender);
    }

    public String distribute(@RequestBody Message message) {
        String type = message.getDistributionType();
        MessageSender messageSender = map.get(type);
        return messageSender.send(message);

    }


}
