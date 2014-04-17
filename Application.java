/**
 * Created by yuki_yanagi on 2014/04/17.
 */
public class Application {

    public static boolean isDebug = true;
    private static boolean usesDecimal = false;

    public static void main(String[] args){
        args = removeOptionFromArgs(args);

        String calculatedValue = usesDecimal ? Calculator.run(args, true) : Calculator.run(args);
        System.out.println(calculatedValue);

        System.exit(0);
    }

    /**
     * checking command line arguments.
     * if having command line option,
     * removing it and return mathematical expression
     * @param args
     * @return mathematical expression
     */
    private static String[] removeOptionFromArgs(String[] args){
        // debug
        if(isDebug){
            for(String arg: args){
                System.out.println("[stdin] " + arg);
            }
        }

        // exit when not having command line argument
        if(args.length < 1){
            System.out.println("数式を入力してください。");
            System.exit(0);
        }

        // when using -d option, return decimal calculated value
        if(args[0].equals("-d")) {
            usesDecimal = true;
            args[0] = "";
            return args;
        }
        return args;
    }
}
