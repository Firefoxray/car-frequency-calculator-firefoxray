public class Question {
    public SixLineFix display = new SixLineFix();
    public Points points = new Points();
    public CalculatorComponent calculatorComponent = new CalculatorComponent();

    public void question(String question, Boolean correctAnswer)
    {
        Engine engine = new Engine();
        int answerInt = 4;
        double button = engine.buttonPressed;

        if (correctAnswer)
        {
            answerInt = 0;
        } else {
            answerInt = 1;
        }
        answerInt = 4;

        display.converter(question);
        calculatorComponent.repaint();
        calculatorComponent.revalidate();
        System.out.println("here");
        while(button == 4) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
        if (button == answerInt){
            points.storage++;
        }
    }

    public void question1(){
        String question = "Test Question, Yes or No/Are Lexus IS300's Cool?";
        Boolean correctAnswer = true;
        question(question,correctAnswer);
    }

}
