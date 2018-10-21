package de.pinkpanther.papf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PAPFController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
