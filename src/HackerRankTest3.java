import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class HackerRankTest3 {
        public static void main(String[] args) throws IOException {
                List<Integer> list = Arrays.asList(2,4,6,7,8);
                boolean allEven =list.stream().allMatch(i->{
                        System.out.println(i);
                        return i%2==0;
                });
        }
}
