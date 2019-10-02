import java.util.concurrent.TimeUnit;
/**
Car Spawn Frequency Calculator
 By Firefoxray, 2019
Version 0.1 CONCEPT
**/
public class Main {

    static double versionNum = 0.4;
    static boolean gdfe = false;//Global Debug Flag Enabler
    static boolean testClass = false;//Global Debug Flag Enabler
    public static String welcome = "Car Spawn Frequency Calculator/By Firefoxray October 2019/Version " + versionNum + " STATE: Concept";
    static Calculator calculator = new Calculator();
    static SixLineFix sixLineFix = new SixLineFix();
    static ArrayTest arrayTest = new ArrayTest();
    static ScreenEffects screenEffects = new ScreenEffects();
    static DebugTools debugTools = new DebugTools();

    public static void main(String[] args) {
        sixLineFix.converter(welcome);
        calculator.calculatorFrame();
        if(gdfe)debugTools.debugTools(); //Enables Debug Mode
        if(testClass)arrayTest.arraytest(); //Enables Test Class
    }

    public static void debug(){

    }
}
