import java.util.Arrays;

public class SixLineFix {

    static String debugText;
    Boolean converterRunning = false;
    Boolean displayerRunning = false;

    //Screens
    public static String[] screen = new String[6];
    public static CalculatorComponent screenDisplay = new CalculatorComponent();

    public void converter(String inputValue){
        Arrays.fill(screen, " ");
        converterRunning = true;
        String[] convertArray = inputValue.split("/");
        int lineAmount = convertArray.length - 1;
        for (int n = 0; n <= convertArray.length; n++){
            if (lineAmount >= n) { screen[n] = convertArray[n]; } else { screen[n] = " "; }
        }
        screenDisplay.revalidate(); screenDisplay.repaint();
        debug();
    }

    public void displayer(String inputValue, int inputLine){
        Arrays.fill(screen, " ");
        displayerRunning = true;
        screen[inputLine] = inputValue;
        screenDisplay.revalidate(); screenDisplay.repaint();
        debug();
    }

    public void debug(){
        Boolean isConverterRunning = false;
        Boolean isDisplayerRunning = false;
        if (converterRunning) {isConverterRunning = true;} else {isConverterRunning = false;}
        if (displayerRunning) {isDisplayerRunning = true;} else {isDisplayerRunning = false;}

        String debug = ("Converter Running: "+ isConverterRunning + "\nDisplayer Running: " + isDisplayerRunning);
        debugText = debug;
    }

}
