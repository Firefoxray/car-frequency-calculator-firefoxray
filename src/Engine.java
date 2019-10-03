import org.w3c.dom.ls.LSOutput;

public class Engine {
    public SixLineFix display = new SixLineFix();
    public Main main = new Main();
    public Points points = new Points();
    public CalculatorComponent screenDisplay = new CalculatorComponent();

    //String[] buttonPressed = {"yesButton", "noButton", "enterButton"};
    public volatile double buttonPressed = 4;
    public boolean firstStart = true;
    public int questionNumber = 1;

    public void engine() {
        Question question = new Question();
        System.out.println("engine start");
        if (questionNumber == 1) {question.question1();}
        questionNumber++;System.out.println(questionNumber);
        //if (questionNumber == 2) {question.question2();}
        //if (questionNumber == 3) {question.question3();}
        //if (questionNumber == 4) {question.question4();}
        //if (questionNumber == 5) {question.question5();}
        //if (questionNumber == 6) {question.question6();}

        points.calc();
        //add finish text
        display.displayer("" +points.storage,3);
    }

    public void welcome() {
        display.converter(main.welcome + "/ /Press Any Button To Continue");
        while (buttonPressed == 4) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        engine();
    }

    public void buttonInput(int button){
        buttonPressed = button;
        if (firstStart == true)
        {
            firstStart = false;
            welcome();
        }
    }
}
