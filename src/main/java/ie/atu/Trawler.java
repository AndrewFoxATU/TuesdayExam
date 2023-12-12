package ie.atu;
import java.util.Scanner;
public class Trawler {
    private String userName;
    private String ID;
    private String type;

    public Trawler(String userName, String ID, String type) {
        this.userName = userName;
        this.ID = ID;
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public String getID() {
        return ID;
    }

    public String getType() {
        return type;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name (minimum 7 characters, maximum 24 characters): ");
        this.setUserName(Scanner.nextLine());
    }
    public void getIDInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID (must be an eleven-digit number): ");
        this.setID(Scanner.nextLine());
    }

    public void getTypeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Type (Freezer, stern or Outrigger): ");
        this.setType(Scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Trawler{" +
                "userName='" + userName + '\'' +
                ", ID=" + ID +
                ", type='" + type + '\'' +
                '}';
    }
}
