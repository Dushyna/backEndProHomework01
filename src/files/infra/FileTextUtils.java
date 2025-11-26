package files.infra;

import arithmetic.model.Arithmetic;
import files.model.FilesText;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class FileTextUtils {
    public static void caller(String functionName, String arg1, String arg2) throws NoSuchMethodException {
        Class<FilesText> clazz = FilesText.class;
        try {
            Method method = clazz.getDeclaredMethod(functionName, String.class, String.class);
            Constructor<FilesText> constructor = clazz.getDeclaredConstructor();
            method.invoke(constructor.newInstance(), arg1, arg2);
        } catch (Exception e) {
            System.out.println(functionName + " is not supported");
        }


    }
}
