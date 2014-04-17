/**
 * Created by yuki_yanagi on 2014/04/17.
 */
public class Application {

    public static boolean isDebug = true;
    private static boolean useDecimal = false;

    public static void main(String[] args){
        args = removeOptionFromArgs(args);

        Calculator calc = new Calculator(args);
        calc.run();
        System.exit(0);
    }

    /**
     * todo: inappropriately method name
     * checking command line arguments
     * @param args
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
            useDecimal = true;
            args[0] = "";
            return args;
        }
        return args;
    }
}
