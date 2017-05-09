package jvros.test.cloud.services.time.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by jose on 09/05/2017.
 */
@RestController
public class TimeService {
    @RequestMapping("/now")
    public String sayTime(){
        LocalDateTime now = LocalDateTime.now();
        return now.toString();
    }
}
