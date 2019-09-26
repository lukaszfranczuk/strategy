package pl.franek.strategy.pattern;

import pl.franek.strategy.Rpn;

public class RpnImpl extends Rpn {

    private RpnStrategy rpnStrategy = new RpnStrategy();

    @Override
    protected String calculate(String first, String second, String operation) {
        return rpnStrategy.calculate(first, second, operation);
    }
}
