package person;
import java.util.ArrayList;
import java.util.Arrays;
public class Person {
    private String fName;
    private String lName;
    private ArrayList<String> arr = new ArrayList<>();
    private String email;

    public Person(String fName, String lName, ArrayList<String> arr, String email){
        this.fName = fName;
        this.lName = lName;
        this.arr = arr;
        this.email = email;
    }

    public void setFName(String fName){
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setArr(ArrayList<String> arr) {
        this.arr = arr;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public ArrayList<String> getArr() {
        return arr;
    }

    public String getEmail() {
        return email;
    }
}
