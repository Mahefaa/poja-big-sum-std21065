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
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.TWO;

        BigInteger actual = subject.add(a, b);

        assertEquals(BigInteger.valueOf(3), actual);
    }
}
