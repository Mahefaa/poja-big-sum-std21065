package com.poja.sqlite.endpoint.rest.controller;

import com.poja.sqlite.service.BigSumService;
import java.math.BigInteger;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BigSumController {
    private final BigSumService service;

    @GetMapping("/big-sum")
    public BigInteger add(@RequestParam BigInteger a, @RequestParam BigInteger b) {
        return service.add(a, b);
    }
}
