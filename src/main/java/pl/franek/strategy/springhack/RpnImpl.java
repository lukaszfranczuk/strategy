package pl.franek.strategy.springhack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.franek.strategy.Rpn;

@Component
public class RpnImpl extends Rpn {

    private RpnStrategy rpnStrategy;

    @Autowired
    public RpnImpl(RpnStrategy rpnStrategy) {
        this.rpnStrategy = rpnStrategy;
    }

    @Override
    protected String calculate(String first, String second, String operation) {
        return rpnStrategy.calculate(first, second, operation);
    }
}