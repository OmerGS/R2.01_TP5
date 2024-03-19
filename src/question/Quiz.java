package question;
import java.util.ArrayList;

/**
* A method which allow to create a quiz of questions
* @author O.Gunes
*/
public class Quiz {
    /**
     * ArrayList which contain question
     */
    private ArrayList<Question> questionList;
    
    /**
    * An empty constructor of Quizz.
    */
    public Quiz(){
        this.questionList = new ArrayList<>();  
    }

    /**
    * Constructor of Quizz. 
    *
    * @param list An ArrayList who contain question
    */
    public Quiz(ArrayList list){
        if(list != null){
            this.questionList = list;
        } else {
            System.out.println("List of question is null");
        }
    }

    /**
    * Allow to know the text of a question. 
    * @param index Position of question in ArrayList
    * @return The text of question
    */
    public String getQuestionText(int index){
        String text = null;
        if((index >= 0) && (index < questionList.size())){
            text = questionList.get(index).getText();
        } else {
            System.out.println("Quiz.java - getQuestionText - Erreur");
        }
        return(text);
    }

    /**
    * Allow to pick a random question in the ArrayList. 
    * @return A question.
    */
    public Question pickAtRandom(){
        int index = (int) (Math.random() * questionList.size());

        return(questionList.get(index));
    }

    /**
    * Return the size of question.
    * @return The number of question in the quiz
    */
    public int getQNumber(){
        return(questionList.size());
    }

    /**
    * Allow to add a question in quiz
    * @param q The Question
    */
    public void add(Question q){
        if(q != null){
            questionList.add(q);
        } else {
            System.out.println("Question is null");
        }
    }

    /**
    * Allow to display the Quiz.
    */
    public void display(){
        for (Question questionQuiz : questionList) {
            System.out.println(questionQuiz);
        }
    }
}
