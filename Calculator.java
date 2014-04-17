/**
 * Created by yuki_yanagi on 2014/04/17.
 */

import java.util.Objects;

/**
 * Order of operations
 * 1. ()    parentheses
 * 2. * /   multiplication division
 * 3. + -   addition subtraction
 */
public class Calculator{
    /**
     * running calculation and return fraction
     * @param args
     * @return
     */
    public static String run(String[] args) {
        Expression expression = new Expression(argsToExpression(args));

        //remove brackets
        while(expression.hasParentheses()){

        }
        return "";
    }

    public static String run(String[] args, boolean useFixedPointRepresentation){
        if(!useFixedPointRepresentation)
            return run(args);

        return "";
    }
    /**
     * convert arguments to mathematical expression
     *
     * @param args
     * @return expression
     */
    private static String argsToExpression(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < args.length; i++)
            builder.append(args[i]);

        return builder.toString();
    }

    /**
     * if expression can calculate, return true
     * @param expression
     * @return if calculable, return true
     */
    private boolean canCalculate(String expression){
        //todo: not implemented
        return true;
    }
}
