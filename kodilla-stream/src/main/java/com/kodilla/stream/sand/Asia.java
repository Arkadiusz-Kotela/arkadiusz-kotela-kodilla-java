package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Asia implements SandStorage {
    @Override
    public BigDecimal getSandsBeanQuantity() {
        BigDecimal sandBeansQuantity = new BigDecimal("98765432101234567890");
        return sandBeansQuantity;
    }
}
