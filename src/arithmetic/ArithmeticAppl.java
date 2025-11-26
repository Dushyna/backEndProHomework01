package arithmetic;

public class ArithmeticAppl {

    public static void main(String[] args) throws NoSuchMethodException {
        if (args.length != 3) {
            System.out.println("Wrong number of arguments");
            return;
        }
        try {
            ArithmeticUtils.caller(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        }catch (Exception e){
            System.out.println( "Arguments are not numbers");

        }

    }
}
