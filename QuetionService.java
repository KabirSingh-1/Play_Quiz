import java.util.Scanner;

public class QuetionService {

    public QuetionService(){
        quetions[0] = new Quetion(1, "Which of the following statements is true about inheritance in Java?", "A) A class can inherit from multiple classes.\n"," B) A class can inherit only one class but can implement multiple interfaces.", "C) A class can inherit multiple interfaces but not any class.\n", "D) A class cannot inherit from another class.", "B");
        quetions[1] = new Quetion(2, "Which of the following concepts allows a subclass to provide a specific implementation of a method that is already defined in its superclass?", "A) Encapsulation\n", "B) Abstraction", "C) Inheritance\n", "D) Polymorphism", "D");
        quetions[2] = new Quetion(3, "Encapsulation in Java is achieved by:", "A) Using the `public` keyword to restrict access to variables and methods.", "B) Using the `private` keyword to restrict access to variables and methods", "C) Using the `protected` keyword to restrict access to variables and methods", "D) Using the static keyword to restrict access to variables and methods.", "B");
        quetions[3] = new Quetion(4, "Which of the following is true about abstract classes in Java?", "A) An abstract class cannot have non-abstract methods.", "B) An abstract class can be instantiated.", "C) An abstract class can have constructors.", "D) An abstract class cannot have fields.", "C");
        quetions[4] = new Quetion(5, "Which of the following is a correct statement about interfaces in Java?", "A) An interface can extend multiple interfaces.", "B) An interface can have instance fields.", "C) An interface can implement another interface.", "D) An interface can have constructors.", "A");
        
    }

    Quetion[] quetions = new Quetion[5];
    String selection[] = new String[5];



    public void playQuiz(){
         int i = 0;
        for(Quetion q : quetions){

            System.out.print("Quetion: "+q.getId()+" :");
            System.out.println(q.getQuetion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
           selection[i] =  sc.nextLine();
           i++;
        }
        
    
    

      for(String s : selection){
        System.out.println(s);
      }
    }

    public void printscore(){
        int score = 0;

        for(int i = 0; i<quetions.length;i++){
            Quetion que = quetions[i];
            String actualanswer = que.getAnswer();
            String useranswer = selection[i];

            if(actualanswer.equals(useranswer)){
                score++;
            }
        }

        System.out.println("your score : "+ score);
    }

    
}

