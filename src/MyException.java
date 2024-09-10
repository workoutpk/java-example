public class MyException extends Exception {
        int details;


        public MyException(int a) {
                details = a;
                System.out.println("Working ...");
        }


        public String toString() {
                return "details";

        }
}

class Output{
        static void  compute(int a) throws MyException{
                throw new MyException(a);
        }

        public static void main(String[] args) {
                try
                {
                        compute(3);
                }
                catch(MyException e)
                {
                        System.out.print("Exception");
                }
        }
}
