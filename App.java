import java.util.*;

public class App{

    static void myApp(){
        //input streamer
        Scanner sc = new Scanner(System.in);
        
        System.out.println("what is your name?");

        //take the user name to then return it
        String userName = sc.nextLine(); 

        //log the nanme of the user to the user
        System.out.println("Your name is " + userName);

    }
    public static void main(String[] args) {
        myApp();
    }
}