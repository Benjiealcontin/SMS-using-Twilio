package com.operation.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController

public class Controller {

    @GetMapping(value = "/sendSMS")
    public ResponseEntity<String> sendSMS() {
    	var sid = "AC6324c4964b21ed56d28d099e0626e41a";			//Account SID
    	var authToken = "f94eca553ad258230d840c202114878a";		//Auth Token

    	Twilio.init(sid, authToken);


    	Message.creator(new com.twilio.type.PhoneNumber("+639350624969"), 					// Where to send the Message
                new com.twilio.type.PhoneNumber("+18124414329"), "vhuy ka? 📞").create();	//Number from Twilio

            return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
    }
}
