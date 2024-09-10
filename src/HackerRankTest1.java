import java.util.*;

public class HackerRankTest1 {
        public static void miniMaxSum(List<Integer> arr) {
                // Write your code here
                //List<Integer> list1 = arr.stream().sorted(Comparator.reverseOrder()).skip(1).toList();
                //List<Integer> list2 = arr.stream().sorted(Comparator.naturalOrder()).skip(1).toList();
                //int sum1= list1.stream().reduce(Integer::sum).get();
                //int sum2= list2.stream().reduce(Integer::sum).get();
                Collections.sort(arr);
                long sum1 =0;
                long sum2 =0;

                for (Integer integer:arr.subList(1,arr.size())){
                        sum1=sum1+integer;
                }
                Collections.sort(arr,Comparator.reverseOrder());
                for (Integer integer:arr.subList(1,arr.size())){
                        sum2=sum2+integer;
                }
                System.out.printf(sum2+ " "+sum1);
        }
        public static void main(String[] args) {
                List<Integer> list = Arrays.asList(256741038, 623958417, 467905213 ,714532089, 938071625);
                miniMaxSum(list);
        }
}
