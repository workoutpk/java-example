import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HackerRankTest2 {
        public static void timeConversion(String s) throws ParseException {
                char[] character = s.toCharArray();
                List<Character> list = new ArrayList<>();
                String time = null;
                String med = null;
                for (char cs : character) {
                        list.add(cs);
                }
                for (int i = 0; i < character.length - 2; i++) {
                        time = time + character[i];
                }

                for (int i = character.length - 2; i < character.length; i++) {
                        med = med + character[i];
                }
                String d = time.replace("null", "");
                String m = med.replace("null", "");
                String newDt = d + " " + m;

                SimpleDateFormat simpleDateFormat12 = new SimpleDateFormat("hh:mm:ss a");
                Date date = simpleDateFormat12.parse(newDt);

                SimpleDateFormat simpleDateFormat24 = new SimpleDateFormat("HH:mm:ss");
                String s2 = simpleDateFormat24.format(date);
                System.out.println("Return '" + s2 + "'");


        }

        public static void main(String[] args) throws ParseException {
                String timeIn12HourFormat = "07:05:45PM";
                timeConversion(timeIn12HourFormat);
                String timeString = "07:05:45 PM";


        }
}
