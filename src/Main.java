import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
        public static void main(String[] args) {
                System.out.println("Hello world!");
                Date date = new Date();
                System.out.println(date);
                TreeMap treeMap = new TreeMap<>();
                treeMap.put("A", 1);
                treeMap.put("B", 2);
                treeMap.put("C", 3);
                System.out.println("::: "+treeMap.entrySet());
                HashMap hashMap= new HashMap<>();
                hashMap.put("A",1);
                hashMap.put("B",2);
                hashMap.put("C",3);

                System.out.println("HasMap :: " +hashMap);
        }
}