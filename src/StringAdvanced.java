public class StringAdvanced {
        public static void main(String[] args) {
                String s = "hello";
                Object o = s;
                if (o.equals(s)) {
                        System.out.println("A");
                } else {
                        System.out.println("B");
                }
                if (s.equals(o)) {
                        System.out.println("C");
                } else {
                        System.out.println("D");
                }
        /*If you use == instead of equals(), the output of the below code will be:AA

        This is because the == operator compares the references of the objects,
        not their content. Since both o and s refer to the same string object “hello”,
         their references are equal. Therefore, both o == s and s == o return true,
         and A and A are printed. 😊*/
        }
}
