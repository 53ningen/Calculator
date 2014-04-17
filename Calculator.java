/**
 * Created by yuki_yanagi on 2014/04/17.
 */

/**
 * Order of operations
 * 1. ()    parentheses
 * 2. * /   multiplication division
 * 3. + -   addition subtraction
 */
public class Calculator {
    private Expression expression;

    /**
     * constructor of this class
     * convert arguments to mathematical expression
     * @param args
     */
    Calculator(String[] args) {
        expression = new Expression(argsToExpression(args));
    }

    /**
     * running calculation
     */
    public void run() {
        //括弧の処理
        while(expression.hasParentheses()){
            System.out.println();
        }


        //
    }

    /**
     * convert arguments to mathematical expression
     *
     * @param args
     * @return expression
     */
    private String argsToExpression(String[] args) {
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
