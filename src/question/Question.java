package question;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    private String text;
    private String answer;


    public Question(){
        this.text = "";
        this.answer = "";
    }

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

    public String getText(){
        return(this.text);
    }

    public void setText(String text){
        if(text != null){
            this.text = text;
        } else {
            System.out.println("text is null");
        }
    }

    public String getAnswer(){
        return(this.answer);
    }
    
    public void setAnswer(String answer){
        if(answer != null){
            this.answer = answer;
        } else {
            System.out.println("answer is null");
        }
    }

    public boolean checkAnswer(String response) {
        String expectedAnswerLower = this.answer.toLowerCase();
        String userResponseLower = response.toLowerCase();
        ArrayList<String> prepositions = new ArrayList<>(Arrays.asList("le", "la", "un", "une", "l'", "de"));
    
        // Vérifier si la réponse de l'utilisateur est une préposition seule
        if (prepositions.contains(userResponseLower.trim())) {
            return false; // Préposition seule n'est pas une réponse correcte
        }
    
        boolean isResponseCorrect = false;
    
        // Vérifier si la réponse de l'utilisateur est égale à la réponse attendue (en ignorant la casse)
        isResponseCorrect = userResponseLower.equals(expectedAnswerLower);
    
        // Vérifier si la réponse de l'utilisateur est une sous-chaîne de la réponse attendue
        isResponseCorrect = isResponseCorrect || expectedAnswerLower.contains(userResponseLower);
    
        // Vérifier si chaque mot de la réponse attendue est présent dans la réponse de l'utilisateur
        String[] expectedWords = expectedAnswerLower.split("\\s+"); // Diviser la réponse attendue en mots
    
        // Si la réponse n'est pas déjà correcte
        if (!isResponseCorrect) {
            // Vérifier si chaque mot de la réponse attendue est présent dans la réponse de l'utilisateur
            boolean allWordsFound = true;
            for (String word : expectedWords) {
                if (!userResponseLower.contains(word)) {
                    allWordsFound = false;
                    break; // Arrêter la recherche dès qu'un mot manque
                }
            }
            // isResponseCorrect sera vrai seulement si la réponse complète de l'utilisateur correspond à la réponse attendue
            isResponseCorrect = allWordsFound && userResponseLower.equals(expectedAnswerLower);
        }
    
        return isResponseCorrect;
    }
    


    public void display(){
        System.out.println(this.getText());
    }
}
