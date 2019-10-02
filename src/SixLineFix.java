import java.util.Arrays;

public class SixLineFix {

    //Screens
    public static String one = "Line 1";
    public static String two = "Line 2";
    public static String three = "Line 3";
    public static String four = "Line 4";
    public static String five = "Line 5";
    public static String six = "Line 6";
    public static String inputValue;

    public void converter(String inputValue){
        String[] convertArray = inputValue.split("/");
        int lineAmount = convertArray.length - 1;
        if (lineAmount >= 0) { one = convertArray[0]; } else { one = " "; }
        if (lineAmount >= 1) { two = convertArray[1]; } else { two = " "; }
        if (lineAmount >= 2) { three = convertArray[2]; } else { three = " "; }
        if (lineAmount >= 3) { four = convertArray[3]; } else { four = " "; }
        if (lineAmount >= 4) { five = convertArray[4]; } else { five = " "; }
        if (lineAmount >= 5) { six = convertArray[5]; } else { six = " "; }
        Arrays.fill(convertArray, "In Use");
    }

}
