package ie.atu;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        int min = 7;
        int max = 24;

        Trawler[] User = new Trawler[1];

         /*
        char[] userName = new char[8];
        for (int i = 0; i < userName.length; i++) {
            System.out.println(userName[i].length());
        }
        */
        User[1].getUserInput();
        User[1].getIDInput();
        User[1].getTypeInput();
        String name = User[1].getUserName();
        String ID = User[1].getID();
        String Type = User[1].getType();

        try {
            if (name.length() > min && name.length() < max) {
                if (ID.length() == 8) {
                    if (Type == "Freezer" || Type == "Stern" ||  Type == "Outrigger"){

                    }
                    else System.out.println("Invalid Trawler Type");
                }
                else System.out.println("Invalid Transponder ID number");
            }
            else System.out.println("Invalid Name provided is not valid");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Trawler Type");
            System.out.println("Invalid Transponder ID number");
            System.out.println("Invalid Name provided is not valid");
        }
        catch (Exception e) {

            throw new RuntimeException(e);
        }



    }
}