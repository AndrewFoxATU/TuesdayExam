package ie.atu;
import java.util.Scanner;
public class TrawlerApp {
    private String userName;
    private String ID;
    private String type;

    public TrawlerApp() {
        this.userName = "Andrew";
        this.ID = "12345678";
        this.type = "Stern";
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


    @Override
    public String toString() {
        return "Trawler{" +
                "userName='" + userName + '\'' +
                ", ID=" + ID +
                ", type='" + type + '\'' +
                '}';
    }
}