package pl.franek.strategy.springpattern.operation;

import java.math.BigDecimal;

public interface ArithmeticOperation {

    BigDecimal execute(BigDecimal first, BigDecimal second);
    String getKey();
}
