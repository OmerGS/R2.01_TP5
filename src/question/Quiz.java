package question;
import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questionList;
    
    public Quiz(){
        
    }

    public Quiz(ArrayList list){
        if(list != null){
            this.questionList = list;
        } else {
            System.out.println("List of question is null");
        }
    }

    public String getQuestionText(int index){
        String text = null;
        if((index >= 0) && (index < questionList.size())){
            text = questionList.get(index).getText();
        } else {
            System.out.println("Quiz.java - getQuestionText - Erreur");
        }
        return(text);
    }

    public Question pickAtRandom(){
        int index = (int) (Math.random() * questionList.size());

        return(questionList.get(index));
    }

    public int getQNumber(){
        return(questionList.size());
    }

    public void add(Question q){
        if(q != null){
            questionList.add(q);
        } else {
            System.out.println("Question is null");
        }
    }

    public void display(){
        for (Question questionQuiz : questionList) {
            System.out.println(questionQuiz);
        }
    }
}
