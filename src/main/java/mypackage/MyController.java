package mypackage;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
   // private Service service;

    @RequestMapping(value = "/ping")
    public String ping() {
        return "pong";
    }
    // Implement some more
}
