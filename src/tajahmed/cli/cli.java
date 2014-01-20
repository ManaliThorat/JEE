package tajahmed.cli;

import tajahmed.Evaluator.Evaluator;

public class cli {
    public static void main(String[] args) {
        Evaluator ev = new Evaluator();
        System.out.println(ev.Evaluate(args[0]));
    }
}
