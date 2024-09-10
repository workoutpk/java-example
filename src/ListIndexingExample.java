import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListIndexingExample {
        public static void main(String[] args) {
                List<Integer> list1 = Arrays.asList(1,2,3);
                LinkedList<Object> list3 = new LinkedList<>(list1);
                list3.set(2,4);
                list3.add(list1.get(2));
                System.out.println(list3);

        }
}
