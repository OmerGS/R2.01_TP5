import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import question.*;

public class ScenarioQuiz {
    private static ArrayList <Integer> tableauScore;
    private static ArrayList <Question> question;
    private static Quiz quiz;

    public static void main(String[] args) {
        //Création des questions normaux

        Question question1 = new Question("Quelle est la capitale de l'Australie ?", "Canberra");
        Question question2 = new Question("Qui a peint la Joconde ?", "Léonard de Vinci");
        Question question3 = new Question("Quel est le plus grand oc\u00E9an du monde ?", "L'océan Pacifique");
        Question question4 = new Question("Quelle est la limitation maximal autoris\u00E9 sur autoroute en France ?", "130");
        Question question5 = new Question("Qui est le pr\u00E9sident actuel des USA ?", "Joe Biden");
        Question question6 = new Question("Quel est le plus haut sommet du monde ?", "Le Mont Everest");
        Question question7 = new Question("Que veut dire 'Hyper-Text-Markup-Language' ?", "html");
        Question question8 = new Question("Quel est le plus grand désert du monde ?", "Antarctique");
        Question question9 = new Question("Quel est le pays le plus peuplé au monde ?", "La Chine");
        Question question10 = new Question("Qui a \u00E9t\u00E9 le premier homme à marcher sur la Lune ?", "Neil Armstrong");
        Question question11 = new Question("Quel organe est responsable de l'\u00E9quilibre d'un être humain", "L'oreille");
        Question question12 = new Question("Quelle ann\u00E9e a \u00E9t\u00E9 conquis constantinople ?", "1453");
        Question question13 = new Question("Quel est le plus grand fleuve d'Am\u00E9rique du Sud ?", "L'Amazone");
        Question question14 = new Question("Quel est le symbole chimique de l'eau ?", "H2O");
        Question question15 = new Question("Quel pays produit les Rafales ?", "La France");
        
        //Création des questions à choix mutliples

        // Question 1
        ChoiceQuestion qcm1 = new ChoiceQuestion();
        qcm1.setText("Quelle est la p\u00E9riode de r\u00E9volution de la Terre autour du Soleil ?");
        qcm1.addChoice("365 jours", true);
        qcm1.addChoice("30 jours", false);
        qcm1.addChoice("24 heures", false);
        qcm1.addChoice("1 an lunaire", false);

        // Question 2
        ChoiceQuestion qcm2 = new ChoiceQuestion();
        qcm2.setText("Quel est l'organe principal du système respiratoire chez les humains ?");
        qcm2.addChoice("Le cerveau", false);
        qcm2.addChoice("Les poumons", true);
        qcm2.addChoice("Le foie", false);
        qcm2.addChoice("Le coeur", false);

        // Question 3
        ChoiceQuestion qcm3 = new ChoiceQuestion();
        qcm3.setText("Qui a peint la Joconde ?");
        qcm3.addChoice("Pablo Picasso", false);
        qcm3.addChoice("Leonardo da Vinci", true);
        qcm3.addChoice("Vincent van Gogh", false);
        qcm3.addChoice("Claude Monet", false);

        // Question 4
        ChoiceQuestion qcm4 = new ChoiceQuestion();
        qcm4.setText("Quelle est la plan\u00E8te la plus proche du Soleil ?");
        qcm4.addChoice("V\u00E9nus", false);
        qcm4.addChoice("Mercure", true);
        qcm4.addChoice("Mars", false);
        qcm4.addChoice("Jupiter", false);

        // Question 5
        ChoiceQuestion qcm5 = new ChoiceQuestion();
        qcm5.setText("Qui a \u00E9crit 'Romeo et Juliette' ?");
        qcm5.addChoice("William Shakespeare", true);
        qcm5.addChoice("Charles Dickens", false);
        qcm5.addChoice("Jane Austen", false);
        qcm5.addChoice("Leo Tolstoi", false);

        // Question 6
        ChoiceQuestion qcm6 = new ChoiceQuestion();
        qcm6.setText("Quel est l'\u00E9l\u00E9ment chimique le plus abondant dans l'univers ?");
        qcm6.addChoice("Hydrog\u00E8ne", true);
        qcm6.addChoice("Oxyg\u00E8ne", false);
        qcm6.addChoice("Fer", false);
        qcm6.addChoice("Carbone", false);

        // Question 7
        ChoiceQuestion qcm7 = new ChoiceQuestion();
        qcm7.setText("Quelle est la langue la plus parl\u00E9e dans le monde ?");
        qcm7.addChoice("Anglais", false);
        qcm7.addChoice("Mandarin", true);
        qcm7.addChoice("Espagnol", false);
        qcm7.addChoice("Hindi", false);

        // Question 8
        ChoiceQuestion qcm8 = new ChoiceQuestion();
        qcm8.setText("Quel est le plus grand océan du monde ?");
        qcm8.addChoice("Oc\u00E9an Atlantique", false);
        qcm8.addChoice("Oc\u00E9an Indien", false);
        qcm8.addChoice("Oc\u00E9an Pacifique", true);
        qcm8.addChoice("Oc\u00E9an Arctique", false);

        // Question 9
        ChoiceQuestion qcm9 = new ChoiceQuestion();
        qcm9.setText("Qui a d\u00E9couvert la gravitation universelle ?");
        qcm9.addChoice("Isaac Newton", true);
        qcm9.addChoice("Galil\u00E9e", false);
        qcm9.addChoice("Albert Einstein", false);
        qcm9.addChoice("Nikola Tesla", false);

        // Question 10
        ChoiceQuestion qcm10 = new ChoiceQuestion();
        qcm10.setText("Combien de continents y a-t-il sur Terre ?");
        qcm10.addChoice("Cinq", false);
        qcm10.addChoice("Six", false);
        qcm10.addChoice("Sept", true);
        qcm10.addChoice("Huit", false);

        // Question 11
        ChoiceQuestion qcm11 = new ChoiceQuestion();
        qcm11.setText("Quelle est la plus grande plan\u00E8te du syst\u00E8me solaire ?");
        qcm11.addChoice("Jupiter", true);
        qcm11.addChoice("Saturne", false);
        qcm11.addChoice("Neptune", false);
        qcm11.addChoice("Uranus", false);

        // Question 12
        ChoiceQuestion qcm12 = new ChoiceQuestion();
        qcm12.setText("Qui a peint la 'Nuit \u00E9toil\u00E9e' ?");
        qcm12.addChoice("Vincent van Gogh", true);
        qcm12.addChoice("Leonardo da Vinci", false);
        qcm12.addChoice("Pablo Picasso", false);
        qcm12.addChoice("Claude Monet", false);

        // Question 13
        ChoiceQuestion qcm13 = new ChoiceQuestion();
        qcm13.setText("Quel est le plus grand d\u00E9sert du monde ?");
        qcm13.addChoice("Le Sahara", true);
        qcm13.addChoice("Le d\u00E9sert du Kalahari", false);
        qcm13.addChoice("Le d\u00E9sert de Gobi", false);
        qcm13.addChoice("Le d\u00E9sert d'Atacama", false);

        // Question 14
        ChoiceQuestion qcm14 = new ChoiceQuestion();
        qcm14.setText("Qui a \u00E9crit '1984' ?");
        qcm14.addChoice("George Orwell", true);
        qcm14.addChoice("J.R.R. Tolkien", false);
        qcm14.addChoice("Ray Bradbury", false);
        qcm14.addChoice("Aldous Huxley", false);

        // Question 15
        ChoiceQuestion qcm15 = new ChoiceQuestion();
        qcm15.setText("Quelle est la monnaie du Japon ?");
        qcm15.addChoice("Le won", false);
        qcm15.addChoice("Le yen", true);
        qcm15.addChoice("Le yuan", false);
        qcm15.addChoice("Le rouble", false);

        question = new ArrayList<Question>(Arrays.asList(qcm1, qcm2, qcm3, qcm4, qcm5, qcm6, qcm7, qcm8, qcm9, qcm10, qcm11,qcm12, qcm13, qcm14, qcm15, question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, question13, question14, question15));

        lancementRound();
    }

    public static void lancementRound(){
        ArrayList <Question> listeQuestion = new ArrayList<Question>();
        int i = 0;
        while(i < 15){
            int random = (int) (Math.random() * 29);
            Question questionAjoute = question.get(random);
            listeQuestion.add(questionAjoute);
            
            i++;
        }
        tableauScore = new ArrayList<>();
        quiz = new Quiz(listeQuestion);
        round();
    }

    public static void round(){
        ArrayList <Question> questionsPosees = new ArrayList<>();
        ArrayList <String> reponse = new ArrayList<>(Arrays.asList("bonjour"));
        int compteur = 1;
        int score = 0;

        while(compteur < 11){
            System.out.print("\033[H\033[2J");
            System.out.print("Score : " + score + " ");

            for (int i = 1; i < reponse.size(); i++) {
                String element = reponse.get(i);
                if(element.contains("Correct")){
                    System.out.print("\033[0;32m" + "Q" + i);
                    System.out.print("\033[0m" + " ");
                } else {
                    System.out.print("\033[0;31m" + "Q" + i);
                    System.out.print("\033[0m" + " ");
                }
            }
            
            System.out.println();
            System.out.println("Question : " + compteur + "/" + (quiz.getQNumber()-5));
            Question questionCourante = quiz.pickAtRandom();
        
            if(questionsPosees.contains(questionCourante)) {
                continue; // Passer à la prochaine itération de la boucle
            }

            questionCourante.display();
            System.out.println("Votre reponse : ");
            Scanner in = new Scanner(System.in);
            
            String response = in.nextLine();
            if(questionCourante.checkAnswer(response)){
                reponse.add("Correct");         
                score++;
            } else {
                reponse.add("Incorrect");
            }    
            questionsPosees.add(questionCourante);

            compteur++;
        }

        System.out.println("Score : " + score);
        for (int i = 1; i < reponse.size(); i++) {
            String element = reponse.get(i);
            if(element.contains("Correct")){
                System.out.print("\033[0;32m" + "Q" + i);
                System.out.print("\033[0m" + " ");
            } else {
                System.out.print("\033[0;31m" + "Q" + i);
                System.out.print("\033[0m" + " ");
            }
        }
        tableauScore.add(score);

        finPartie();
    }



    public static void finPartie(){
        boolean ok = false;
        System.out.print("\033[H\033[2J");
        int scoreTotal = 0;

        for (Integer partie : tableauScore) {
            scoreTotal += partie;
        }

        int scoreMoyen = scoreTotal/tableauScore.size();

        System.out.println("Votre score moyen : " + scoreMoyen);

        System.out.println("Voulez-vous rejouez ? (O/N) ");
            Scanner in = new Scanner(System.in);

        boolean premierPassage = true;
        do{  
            if(!premierPassage){
                System.out.println("Veuillez entrez oui ou non !");
            }  
            String response = in.nextLine(); 
            if(response.equalsIgnoreCase("o") || response.equalsIgnoreCase("oui")){
                round();
                ok = true;
            } else if(response.equalsIgnoreCase("n") || response.equalsIgnoreCase("non")){
                System.out.println("Merci, d'avoir joue !");
                ok = true;
            }
            premierPassage = false;
        } while(!ok);
    }
}
