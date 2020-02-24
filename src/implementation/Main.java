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
    public String displayMenu(Scanner sc){
        String response = "" ;
        System.out.println("Welcome to Divya's Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all the contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit program");
        response = sc.nextLine();
        return response;
    }


}
