package org.ugonna.springboot.keycloak;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/visitor")
    public String getVisitor(@RequestHeader String Authorization) {
        return "Hello Visitor";
    }

    @GetMapping("/admin")
    public String getAdmin(@RequestHeader String Authorization) {
        return "Hello admin";
    }

    @GetMapping("/user")
    public String getUsers() {
        return "Hello user";
    }

    @GetMapping("/random")
    public String getRandomUser() {
        return "Hello random user";
    }
}
