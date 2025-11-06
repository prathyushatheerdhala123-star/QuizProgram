import java.util.*;
public class QuestionsService{
    Scanner sc = new Scanner(System.in);
    Questions[] questions = new Questions[5];
    int selection[] = new int[5];
    public QuestionsService(){
        questions[0] = new Questions(1, "Which company developed Java?", 1,"Sun Microsystems",2, "Microsoft",3, "Google",4, "IBM", 1);
        questions[1] = new Questions(2, "Which keyword is used to define a subclass in Java?", 1,"super",2, "extends",3, "inherits",4, "subclass", 2);
        questions[2] = new Questions(3, "Which of these is not a Java primitive data type?", 1,"int", 2,"boolean", 3,"float", 4,"String", 4);
        questions[3] = new Questions(4, "Which method is used to start a thread in Java?", 1,"start()",2, "run()",3, "execute()",4, "begin()", 1);
        questions[4] = new Questions(5, "Which of the following loops is guaranteed to execute at least once?",1, "for loop",2, "while loop",3, "do-while loop", 4,"foreach loop", 3);

    }
    public void playQuiz(){
        int i =0;
        for(Questions q: questions){
            System.out.println("Question No. : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1_id()+": "+q.getOpt1());
            System.out.println(q.getOpt2_id()+": "+q.getOpt2());
            System.out.println(q.getOpt3_id()+": "+q.getOpt3());
            System.out.println(q.getOpt4_id()+": "+q.getOpt4());
            System.out.print("Enter you option number: ");
            selection[i]=sc.nextInt();
            i++;
        } 
    }
    public void printScore(){
        int score=0;
        for(int i =0;i<questions.length;i++){
            Questions que = questions[i];
            int correctAnswer = que.getAnswer();
            int userAnswer = selection[i];
            if(userAnswer==correctAnswer){
                score++;
                System.out.println("Q"+(i+1)+": Correct Answer!");
            }
            else{
                System.out.println("Q"+(i+1)+": Wrong Answer!");
            }
        }
        System.out.print("Your score is: "+score+"!");
    }
}
