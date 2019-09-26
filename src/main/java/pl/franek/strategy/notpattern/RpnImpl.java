package pl.franek.strategy.notpattern;

import pl.franek.strategy.Rpn;
import pl.franek.strategy.notpattern.operation.Calculation;
import pl.franek.strategy.notpattern.operation.Operation;

public class RpnImpl extends Rpn {

    private Calculation calculation = new Calculation();

    @Override
    protected String calculate(String first, String second, String token) {
        Operation operation = Operation.getByOperand(token);
        return calculation.calculate(first, second, operation);
    }
}
