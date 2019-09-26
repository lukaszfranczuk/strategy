package pl.franek.strategy.springhack.operation;

import java.math.BigDecimal;

public interface ArithmeticOperation {

    BigDecimal execute(BigDecimal first, BigDecimal second);
    String getKey();
}
