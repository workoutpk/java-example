import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewThreadExample {
        public static void main(String[] args) {
                System.out.println("length :: " +args.length);
                String input = "John Doe";
                Pattern pattern = Pattern.compile("(\\w+)\\s(\\w+)");
                Matcher matcher = pattern.matcher(input);

                if (matcher.find()) {
                        System.out.println("First name: " + matcher.group(1));
                        System.out.println("Last name: " + matcher.group(2));
                }
        }
}
