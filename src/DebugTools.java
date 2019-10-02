import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class DebugTools {

    public static SixLineFix sixLineFix = new SixLineFix();
    public static Main main = new Main();
    public static ScreenEffects screenEffects = new ScreenEffects();
    public static Calculator calculator = new Calculator();
    public static Question question = new Question();

    public void debugTools()
    {
        debugMessages(4);

        //Debug Enablers
        boolean screenEffectsDebug = false;
        boolean calculatorComponentDebug = true;
        boolean calculatorDebug = true;
        boolean mainDebug = false;
        boolean sixLineFixDebug = true;
        boolean debugToolsDebug = true;
        boolean questionDebug = true;

        //Debug Tools
        if (screenEffectsDebug) System.out.println(screenEffects.debugText);
        if (sixLineFixDebug) {
            sixLineFix.debug();
            System.out.println(sixLineFix.debugText);
        }
    }

    public void debugMessages(int debugChooser)
    {
        String debug1 = "This is a very long sentence, with a lot of slashes/" +
                "so that I can test out my code, also, Lexus IS 300/" +
                "....I had to, I can't think of anything right now... lol/" +
                "Now, here is some random stuff to fill up the rest of this box./" +
                "Nismo, TRD, Mazdaspeed, Mugen, Ralliart, F-Sport, STI";
        String debug2 = "Takumi IRL";
        String debug3 = "I honestly dont know what im doing, nothing should/" +
                "be working and thankfully nothing really/" +
                "does work :^)";
        String debug4 = "Car Spawn Frequency Calculator/" +
                "By Firefoxray October 2019/" +
                "Version " + main.versionNum + " STATE: DEBUG";

        ArrayList<String> debugMessageArray = new ArrayList<>();
        debugMessageArray.add(debug1);
        debugMessageArray.add(debug2);
        debugMessageArray.add(debug3);
        debugMessageArray.add(debug4);
        int debugChooserHotfix = debugChooser - 1;
        sixLineFix.converter(debugMessageArray.get(debugChooserHotfix));
        //screenEffects.textSlide(debugMessage);
    }

}
