package question;
import java.util.ArrayList;

/**
* Class which allow to add choices to a question
* @author O.Gunes
*/
public class ChoiceQuestion extends Question{
    /**
     * ArrayList which contains choices
     */
    private ArrayList<String> choices;

    /**
     * Empty constructor of ChoiceQuestion
     */
    public ChoiceQuestion(){
        super();
        this.choices = new ArrayList<String>();
    }

    /**
     * Allow to add choices in question
     * @param choice The answer
     * @param correct If it is correct or not
     */
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

    /**
     * Display choices.
     */
    public void display(){
        super.display();
        for (int i = 0; i < choices.size(); i++) {
            
            System.out.println(i+1 + ". " + choices.get(i));
        }
    }
}
