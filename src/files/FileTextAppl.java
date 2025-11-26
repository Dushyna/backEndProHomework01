package files;

import arithmetic.ArithmeticUtils;
import files.infra.FileTextUtils;

public class FileTextAppl {
    public static void main(String[] args) throws NoSuchMethodException {
        if (args.length != 3) {
            System.out.println("Wrong number of arguments");
            return;
        }
        try {
            FileTextUtils.caller(args[0], args[1], args[2]);
        }catch (Exception e){
            System.out.println( "Arguments are not numbers");

        }

    }

}
