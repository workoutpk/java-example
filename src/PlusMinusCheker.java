import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinusCheker {
        public static void plusMinus(List<Integer> arr) {
                // Write your code here
                int arrlength = arr.size();
                List list = new ArrayList();
                int positveCount = 0;
                int negativeCount = 0;
                int zeroCount = 0;
                for (Integer integer : arr) {

                        if (integer < 0) {
                                negativeCount = negativeCount + 1;

                        }
                        if (integer > 0) {
                                positveCount = positveCount + 1;

                        }
                        if (integer == 0) {
                                zeroCount = zeroCount + 1;

                        }


                }
                System.out.println(Math.abs(arrlength));
                list.add(positveCount);
                list.add(negativeCount);
                list.add(zeroCount);

                System.out.println("given number:: " + list);
                for (int i = 0; i < list.size(); i++) {
                        float su = (int) list.get(i);
                        System.out.printf("%.6f", Math.abs((float) su / arrlength));
                        System.out.println();
                }
        }

        public static void main(String[] args) {
                PlusMinusCheker plusMinusCheker = new PlusMinusCheker();
                List list = Arrays.asList(-4, 3, -9, 0, 4, 1);
                plusMinus(list);
        }
}
