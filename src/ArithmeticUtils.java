import model.Arithmetic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ArithmeticUtils {
    public static void caller(String functionName, int arg1, int arg2) throws NoSuchMethodException {
        Class<Arithmetic> clazz = Arithmetic.class;
        try {
            Method method = clazz.getDeclaredMethod(functionName, int.class, int.class);
            Constructor<Arithmetic> constructor = clazz.getDeclaredConstructor();
            method.invoke(constructor.newInstance(), arg1, arg2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(functionName + " is not supported");
        }


    }
}