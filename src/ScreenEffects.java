public class ScreenEffects {

    public static SixLineFix screen = new SixLineFix();
    public static CalculatorComponent screenDisplay = new CalculatorComponent();
    public static String debugText;

    public void textSlide(String input){
        int runCount = 0;
        for (int n = 0; n <= 5; n++){
            if (n == 5) { n = 0; }
            if (runCount == 30) {n = 5;}
            runCount++;
            debugText = "Run Count: " + runCount +"\nN Count: " + n;
            try {
                Thread.sleep(200);
            } catch (Exception e){
                e.printStackTrace();
            }
            screen.displayer(input,n);
            screenDisplay.revalidate(); screenDisplay.repaint();
        }
    }

}
