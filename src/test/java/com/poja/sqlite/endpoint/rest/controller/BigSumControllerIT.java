package com.poja.sqlite.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.poja.sqlite.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BigSumControllerIT extends FacadeIT {
    @Autowired
    BigSumController subject;

    @Test
    void add_ok() {
        BigInteger a = new BigInteger("1000000000000000000000");
        BigInteger b = BigInteger.TWO;

        BigInteger actual = subject.add(a, b);

        assertEquals(new BigInteger("1000000000000000000002"), actual);
    }
}
