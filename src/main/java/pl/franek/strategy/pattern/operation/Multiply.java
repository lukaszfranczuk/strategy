package pl.franek.strategy.pattern.operation;

import java.math.BigDecimal;

public class Multiply implements ArithmeticOperation {

    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        return first.multiply(second);
    }
}
