package question;

import java.util.ArrayList;
import java.util.Arrays;

/**
* Allow to create question
* @author O.Gunes 
*/
public class Question {
    /**
     * Text of a question
     */
    private String text;

    /**
     * Answer of a question
     */
    private String answer;

    /**
    * Empty Constructor of Java. 
    */
    public Question(){
        this.text = "";
        this.answer = "";
    }

    /**
    * Constructor of Java
    *
    * @param text The text of question
    * @param answer The answer of question
     */
    public Question(String text, String answer){
        if(text != null){
            this.text = text;
        } else {
            System.out.println("text is null");
        }

        if(answer != null){
            this.answer = answer;
        } else {
            System.out.println("answer is null");
        }
    }

    /**
     * Allow to get the text of question
     * @return Text of question
     */
    public String getText(){
        return(this.text);
    }

    /**
     * Allow to set a text of a question
     * @param text The text of question
     */
    public void setText(String text){
        if(text != null){
            this.text = text;
        } else {
            System.out.println("text is null");
        }
    }

    /**
     * Allow to get an Answer 
     * @return An answer
     */
    public String getAnswer(){
        return(this.answer);
    }
    
    /**
     * Allow to set an answer in a question
     * @param answer The answer
     */
    public void setAnswer(String answer){
        if(answer != null){
            this.answer = answer;
        } else {
            System.out.println("answer is null");
        }
    }

    /**
     * Allow to check answer
     * 
     * @param response The user response
     * @return Booleaan true if response is correct, false isn't
     */
    public boolean checkAnswer(String response) {
        String expectedAnswerLower = this.answer.toLowerCase();
        String userResponseLower = response.toLowerCase();
        ArrayList<String> prepositions = new ArrayList<>(Arrays.asList("le", "la", "un", "une", "l'", "de"));
    
        if (prepositions.contains(userResponseLower.trim())) {
            return false;
        }
    
        boolean isResponseCorrect = false;
    
        isResponseCorrect = userResponseLower.equalsIgnoreCase(expectedAnswerLower);
    
        String[] expectedWords = expectedAnswerLower.split("\\s+");
    
        for (String word : expectedWords) {
            if (userResponseLower.equalsIgnoreCase(word)) {
                isResponseCorrect = true;
                break;
            }
        }
    
        return isResponseCorrect;
    }
    
    /***
    * Allow to display the question 
    */
    public void display(){
        System.out.println(this.getText());
    }
}
