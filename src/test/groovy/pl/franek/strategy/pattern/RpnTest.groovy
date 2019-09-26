package pl.franek.strategy.pattern

import spock.lang.Specification

class RpnTest extends Specification {

    def "should calculate rpn"() {
        when:
        def actual = new RpnImpl().calculate(expression)

        then:
        actual == result

        where:
        expression                       | result
        "2 3 +"                          | "5"
        "4 5 -"                          | "-1"
        "6 3 *"                          | "18"
        "12 2 /"                         | "6"
        "15 7 1 1 + - / 3 * 2 1 1 + + -" | "5"
    }
}