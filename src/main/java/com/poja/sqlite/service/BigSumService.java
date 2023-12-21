package com.poja.sqlite.service;

import java.math.BigInteger;
import org.springframework.stereotype.Service;

@Service
public class BigSumService {
    public BigInteger add(BigInteger a, BigInteger b) {
        return a.add(b);
    }
}
