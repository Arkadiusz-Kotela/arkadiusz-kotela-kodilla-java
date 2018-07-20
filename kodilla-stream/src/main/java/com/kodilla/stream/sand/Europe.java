package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Europe implements SandStorage {
    @Override
    public BigDecimal getSandsBeanQuantity() {
        BigDecimal sandBeansQuantity = new BigDecimal("12345678901234567890");
        return sandBeansQuantity;
    }
}
