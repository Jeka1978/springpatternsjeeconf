package com.naya.never_use_switch;

import org.springframework.stereotype.Service;

import static com.naya.never_use_switch.DeliveryType.SMS;

/**
 * @author Evgeny Borisov
 */
@Service
public class SmsSender implements MessageSender {

    @Override
    public String send(Message message) {
        String status = "Sms msg was sent ";
        System.out.println(status);
        return status;
    }

    @Override
    public String myCode() {
        return SMS;
    }


}
