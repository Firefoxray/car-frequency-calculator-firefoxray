/**
Car Spawn Frequency Calculator
 By Firefoxray, 2019
Version 0.1 CONCEPT
**/
public class Main {

    static double versionNum = 0.2;
    static boolean gdfe = false;//Global Debug Flag Enabler
    public static String welcome = "Car Spawn Frequency Calculator/By Firefoxray, 2019/Version " + versionNum + " STATE: Concept";
    static Calculator calculator = new Calculator();
    static SixLineFix sixLineFix = new SixLineFix();

    public static void main(String[] args) {
        sixLineFix.converter(welcome);
        calculator.calculatorFrame();

        if (gdfe = true) { debug();}
    }

    public static void debug(){
        String debugMessage = "This is a very long/sentence, with alot of slashes/so that I can test out/my code, also, i fucking hate/....actually i cant think of anything/right now... lol";
        sixLineFix.converter(debugMessage);
    }
}
