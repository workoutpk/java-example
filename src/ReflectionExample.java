public class ReflectionExample {
        public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
                // Get the class loader for the current class.
                ClassLoader classLoader = ReflectionExample.class.getClassLoader();

                // Load the class at runtime.
                Class<?> clazz = classLoader.loadClass("com.example.MyClass");

                // Create an instance of the class.
                Object object = clazz.newInstance();

                // Do something with the object.
                System.out.println(object);
        }
}
