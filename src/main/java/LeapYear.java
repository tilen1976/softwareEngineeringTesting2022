import java.util.regex.Pattern;

public class LeapYear {

    public static boolean isLeapYear(int i) {
        return year_after_1700(i) && (divisible_by_four(i) && not_divisible_by_100(i) || divisible_by_400(i));
    }

    private static boolean divisible_by_four(int i) {
        return i % 4 == 0;
    }

    private static boolean not_divisible_by_100(int i) {
        return i % 100 != 0;
    }

    private static boolean divisible_by_400(int i) {
        return i % 400 == 0;
    }

    private static boolean four_digits(int num) {
        String year = Integer.toString(num);
        return Pattern.compile("\\d{4}").matcher(year).matches();
    }

    private static boolean year_after_1700(int i) {
        if (four_digits(i)) {
            return i >= 1700;
        }
        return false;
    }
}



