package test;

import junit.framework.Assert;
import org.junit.Test;
import tajahmed.Evaluator.Evaluator;

public class EvaluatorTest {
    @Test
    public void twoPlusThreeIsFive(){
        Evaluator ev = new Evaluator();
        int expected = 5;
        Assert.assertEquals(expected,ev.Evaluate("2 + 3"));
    }
}
