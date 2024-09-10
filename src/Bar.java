public class Bar extends Foo{
        Bar(){
                super();
                System.out.println("Bar");
                //super() Error: Call to 'super' must be first statement in constructor
                // This will not compile because the call to super is not the first statement
        }

        public static void main(String[] args) {
                new Bar();
        }
}
