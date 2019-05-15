package com.naya.never_use_switch;

import org.springframework.stereotype.Service;

import static com.naya.never_use_switch.DeliveryType.SMS;
import static com.naya.never_use_switch.DeliveryType.VIBER;

/**
 * @author Evgeny Borisov
 */
@Service
public class ViberSender implements MessageSender {

    @Override
    public String send(Message message) {
        String status = "Viber msg was sent ";
        System.out.println(status);
        return status;
    }

    @Override
    public String myCode() {
        return VIBER;
    }


}
