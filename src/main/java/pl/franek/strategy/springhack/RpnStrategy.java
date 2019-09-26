package pl.franek.strategy.springhack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import pl.franek.strategy.springhack.operation.ArithmeticOperation;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Map;

@Component
public class RpnStrategy {


    @Autowired
    private ApplicationContext applicationContext;

    private Map<String, ArithmeticOperation> operations;

    @PostConstruct
    public void init() {
        operations = applicationContext.getBeansOfType(ArithmeticOperation.class);
    }

    public String calculate(String firstToken, String secondToken, String operation) {
        BigDecimal first = new BigDecimal(firstToken);
        BigDecimal second = new BigDecimal(secondToken);
        return operations.get(operation).execute(first, second).toPlainString();
    }
}