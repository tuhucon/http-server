package com.example.serverhttp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hellox")
    public Person hellox() {
        return newPerson();
    }

    @PostMapping("/helloy")
    public Person helloy(@RequestBody Person p) {
        return p;
    }

    private Person newPerson() {
        return Person.builder()
                .firstName("bim")
                .lastName("bip")
                .age(40)
                .address("hung yen viet nam")
                .city("hung yen")
                .country("viet nam")
                .wifeFirstName("da")
                .wifeLastName("da")
                .wifeAge(36)
                .wifeAddress("hung yen viet nam")
                .wifeCity("hung yen")
                .wifeCountry("viet name")
                .build();
    }
}
