package no.pgr301d.cddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CDController {
    //Hahaha

    @GetMapping(path = "/")
    public String hello() {
        return "Hello";
    }

}