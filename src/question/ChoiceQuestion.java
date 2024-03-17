package question;
import java.util.ArrayList;

public class ChoiceQuestion extends Question{
    private ArrayList<String> choices;

    public ChoiceQuestion(){
        super();
        this.choices = new ArrayList<String>();
    }

    public void addChoice(String choice, boolean correct){
        if(choice != null){
            this.choices.add(choice);
            if(correct){
                this.setAnswer(String.valueOf(choices.size()));
            }
        } else {
            System.out.println("choice is null");
        }
    }

    public void display(){
        super.display();
        for (int i = 0; i < choices.size(); i++) {
            
            System.out.println(i+1 + ". " + choices.get(i));
        }
    }
}
