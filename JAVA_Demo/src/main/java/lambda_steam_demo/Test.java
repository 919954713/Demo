package lambda_steam_demo;


import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Test {

    public static Object stringToType(Class<?> type, String arg)
    {
        String name = type.getName();
        switch (name)
        {
            case "java.lang.String":
                return new String(arg);
            case "java.lang.Integer":
                return new Integer(arg);
            case  "java.lang.Boolean":
                return new Boolean(arg);
            case "java.util.Date":
                return new Date(Integer.parseInt(arg));
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Object o = stringToType(Date.class, "1590051691916");
        System.out.println(o);
    }
}
