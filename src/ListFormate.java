import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListFormate {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);//      12,0.1.78,12 ...5 23
                System.out.println("Enter size....");
                int size = scanner.nextInt();
                List<Integer> list1 = new LinkedList<>();
                for (int i = 0; i < size; i++) {
                        System.out.println("Enter the list  "+ i +" element ......");
                        int a = scanner.nextInt();
                        list1.add(a);
                }
                System.out.println("type of query");
                System.out.println("Enter the operation ...................");
                String string = scanner.next();
                System.out.println(string);


                System.out.println("Enter the Number ...........");
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                System.out.println("Enter the Operation ...........");
                String st = scanner.next();

                int d = scanner.nextInt();
                list1.remove(0);
//                list1.set(b-1,c);
                list1.add(c);
                for (Integer integer : list1) {
                        System.out.print(integer+" ");
                }
        }
}
