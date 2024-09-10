import java.util.Stack;

public class GenericStackExample<E> {
        Stack<E> eStack = new Stack<E>();
        public void push(E obj){
                eStack.push(obj);
        }
        public E pop(){
                E obj=eStack.pop();
                return obj;
        }
}

class OutputGenrics {
        public static void main(String[] args) {
                GenericStackExample<String> genericStackExample=new GenericStackExample();
                genericStackExample.push("hello");
                System.out.println(genericStackExample.pop());

        }
}
