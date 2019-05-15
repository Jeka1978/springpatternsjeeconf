package com.naya.never_use_switch;

import org.springframework.stereotype.Service;

import static com.naya.never_use_switch.DeliveryType.WHATS_APP;

/**
 * @author Evgeny Borisov
 */
@Service(WHATS_APP)
public class WhatsAppSender implements MessageSender {
    @Override
    public String send(Message message) {
        String status = "WhatsApp msg was sent";
        System.out.println(status);
        return status;
    }

    @Override
    public String myCode() {
        return WHATS_APP;
    }


}
