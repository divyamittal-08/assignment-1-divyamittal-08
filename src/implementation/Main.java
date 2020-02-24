package implementation;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    ArrayList<Person>  contactList = new ArrayList<>();
    public Main(){
        this.contactList = new ArrayList<>();
    }
    private int top = 0;
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        Main obj = new Main();
        String option;
        boolean z = false;
        do {
            option = obj.displayMenu(sc);
            switch (option){
                case "1":
                    obj.addANewContact(sc);
                    z= true;
                    break;
                case "2":
                    obj.viewContacts();
                    z = true;
                    break;
                case "3":
                    obj.searchContact(sc);
                    z = true;
                    break;
                case "4":
                    obj.deleteContact(sc);
                    z = true;
                    break;
                case "5":
                    z = false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    z = true;
            }
        }while(z == true);
    }


}
