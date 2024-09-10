import java.lang.reflect.Method;

public class ReflectionDemo {
        public static void main(String[] args) {
                // Get the Class object for the String class
                Class<String> stringClass = String.class;

                // Get the methods declared in the String class
                Method[] methods = stringClass.getDeclaredMethods();
                String  s= stringClass.getName();;

                // Print the names of the methods
                for (Method method : methods) {
                        System.out.println(method.getName());
                }
                System.out.println("Class Name ::: " + s);
        }
}
