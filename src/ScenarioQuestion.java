import java.util.Scanner;

import question.*;

public class ScenarioQuestion{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Question one = new Question("Quelle est la capitale de l'Australie ?", "Canberra");
        one.display();

        String response = in.nextLine();
        System.out.println(one.checkAnswer(response));

        System.out.println("\n");

        ChoiceQuestion two = new ChoiceQuestion();

        // Définir le texte de la question
        two.setText("Quelle est la capitale de la France ?");

        // Ajouter des choix avec la méthode addChoice
        two.addChoice("Paris", true);
        two.addChoice("Londres", false);
        two.addChoice("Berlin", false);
        two.addChoice("Madrid", false);

        
        // Afficher la question et les choix
        two.display();


        response = in.nextLine();
        System.out.println(two.checkAnswer(response));


    }
}