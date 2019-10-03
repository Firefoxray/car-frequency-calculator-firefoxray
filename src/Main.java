import java.util.Date;

/**
Car Spawn Frequency Calculator
 By Firefoxray, 2019
Version 0.1 CONCEPT
**/
public class Main {

    static double versionNum = 0.5;
    static boolean gdfe = false;//Global Debug Flag Enabler
    static boolean testClass = false;//Global Debug Flag Enabler
    public static String welcome = "Car Spawn Frequency Calculator/By Firefoxray October 2019/Version " + versionNum + " STATE: Alpha";
    static Calculator calculator = new Calculator();
    static SixLineFix sixLineFix = new SixLineFix();
    static ArrayTest arrayTest = new ArrayTest();
    static ScreenEffects screenEffects = new ScreenEffects();
    static DebugTools debugTools = new DebugTools();
    //static Question question = new Question();
    static Engine engine = new Engine();

    public static void main(String[] args) {
        Date date=java.util.Calendar.getInstance().getTime();
        System.out.println(date);
        calculator.calculatorFrame();
        engine.welcome(); //Start Engine | 2JZ-GE Vroom Vroom
        if(gdfe)debugTools.debugTools(); //Enables Debug Mode
        if(testClass)arrayTest.arraytest(); //Enables Test Class
    }
}
