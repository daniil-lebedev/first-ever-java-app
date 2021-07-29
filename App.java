import java.util.*;


public class App{
    
    
    
    //method to ask the user what they want to do
    static void whatYouWantToDo(){
        //input streamer
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What would you like to do? To get your name type 1 and for addition calculator type 2");
        
        //Getting user's choice
        int userChoice = sc.nextInt();

        if (userChoice == 1){
            numberSum();
        } 
        else if(userChoice == 2){
            robotTellsName();
        }else{
            System.out.println("This is not buddy!");
            whatYouWantToDo();
        }
    }

    //method to return the sum of two numbers
    static void numberSum(){
        //input streamer
        Scanner sc = new Scanner(System.in);

        //ask for the first number
        System.out.println("Type the first number");
        
        //first number
        int number1 = sc.nextInt();

        //ask for the second number
        System.out.println("Type the second number");

        //second number
        int number2 = sc.nextInt();

        System.out.println(number1+number2);
    }

    static void robotTellsName(){
        //input streamer
        Scanner sc = new Scanner(System.in);
        
        System.out.println("what is your name?");

        //take the user name to then return it
        String userName = sc.nextLine(); 

        //log the nanme of the user to the user
        System.out.println("Your name is " + userName);

    }
    public static void main(String[] args) {
        whatYouWantToDo();
    }
}