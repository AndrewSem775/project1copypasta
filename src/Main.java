import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> myTasks = new ArrayList<>();
        System.out.println("what task you wonna add?");
        String adding = input.nextLine();


        myTasks.add("walk the dog");
        myTasks.add("walk the cat");
        myTasks.add("walk the fish");
        System.out.println(myTasks);



        while(!(adding.equals("quit"))){
            myTasks.add(adding);
            System.out.println(myTasks);
            System.out.println("what task you wonna add?");
            adding = input.nextLine();

        }

        System.out.println(myTasks);



        ArrayList<String> myNewSpecialTask = addTask(myTasks);
        System.out.println(myNewSpecialTask);


    }

    static ArrayList<String> addTask(ArrayList a){
        a.add("this is the newly added special task");
        return a;
    }
}