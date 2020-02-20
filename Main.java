

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
        boolean c=true;

        while (c){
            String command=scanner.nextLine();
            switch (command){
                case "exit": case "n":
                        c=false;
                    System.out.println("Bye");
                    break;
                case "start": case "y":
                    beginTheGame();
                    System.out.println("game over, level . Restart? (y/n):");
                    break;


            }
        }

    }

    public static void beginTheGame() {
        System.out.println("Welcome to game. Enter the name of city, please: ");
        Constructors con = new Constructors();
        String input;
        do{
            input = scanner.nextLine();
            if (input.equals("I am done")==true ){
                break;
            }

            con.setInput(input);
            if (con.getResult().equals("I am done")==true) break;
            con.usercitiesinfo();
        }while(true);



    }
}
