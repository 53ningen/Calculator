import java.util.regex.*;
/**
 * Created by yuki_yanagi on 2014/04/17.
 */
public class Expression {
    String expression;

    /**
     * constructor of this class
     * @param expression
     */
    Expression(String expression){

        this.expression = expression;
    }

    /**
     * if expression has parentheses, return true
     * @return
     */
    public boolean hasParentheses(){
        Pattern pattern = Pattern.compile("[(][0-9¥+¥-¥*/]+[)]");
        Matcher matcher = pattern.matcher(expression);
        return matcher.find() ? true : false;
    }

    public String toString(){
        return expression;
    }

    public String expression(String expression){
        this.expression = expression;
        return this.expression;
    }

    /**
     * replace parentheses to %s, and add expression into list
     * @return
     */
    public void minimumParentheses(){
        Pattern pattern = Pattern.compile("[(][0-9¥+¥-¥*/]+[)]");
        Matcher matcher = pattern.matcher(expression);
        if (matcher.find()) {
            for(int i = 0; i < matcher.groupCount(); i++) {
                //add matched expression into list and replace it to %s
                //System.out.println(matcher.group(i));
            }
        }
        else {
            throw new IllegalStateException("No match found.");
        }
    }

    /**
     * replace parentheses to %s, and add expression into list
     * @return
     */
    public String[] extractMinimumParentheses(){
        Pattern pattern = Pattern.compile("[(][0-9¥+¥-¥*/]+[)]");
        Matcher matcher = pattern.matcher(expression);
        String[] extractedExpression = new String[matcher.groupCount()];

        if (matcher.find()) {
            for(int i = 0; i < matcher.groupCount(); i++) {
                extractedExpression[i] = matcher.group(i);
            }
        }
        else {
            throw new IllegalStateException("No match found.");
        }


        return new String[]{ };
    }



}
