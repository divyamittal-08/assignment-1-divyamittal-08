package implementation;
import java.util.*;
import java.lang.*;
import java.io.*;
import person.Person;

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
    public void addANewContact(Scanner sc){
        String fName;
        String lName;
        ArrayList<String> arr = new ArrayList<>();
        String email = "";

        System.out.println("You have chosen to add a new contact ");
        System.out.println("Please enter the name of the person ");
        System.out.println("First Name : ");
        fName = sc.nextLine();
        System.out.println("Last Name : ");
        lName = sc.nextLine();
        System.out.println("Contact Number : ");
        String no = sc.nextLine();
        arr.add(no);
        String ch;
        boolean x = false;
        do{
            ch = "";
            System.out.println("Would you like to add another contact number? (y/n) : ");
            ch = sc.nextLine();
            switch(ch){
                case "y":
                    System.out.println("Contact Number : ");
                    no = sc.nextLine();
                    arr.add(no);
                    x = true;
                    break;
                case "n":
                    x = false;
                    break;

                default:
                    System.out.println("Wrong choice");
                    x = true;
            }
        }while(x == true);
        String choice = "";
        boolean y = false;
        do{
            System.out.println("Would you like to add email address? (y/n) : ");
            choice = sc.nextLine();
            switch (choice){
                case "y":
                    System.out.println("Email Address : ");
                    email = sc.nextLine();
                    y = false;
                    break;
                case "n":
                    email = "None";
                    y = false;
                    break;
                default:
                    System.out.println("Wrong choice");
                    y = true;
                    break;
            }
        }while(y == true);
        System.out.println("Contact added successfully");
        Person p = new Person(fName,lName,arr,email);
        contactList.add(p);
        top++;
    }
    public void viewContacts(){
        System.out.println("--------Here are all your contacts-------");
        if(contactList.size() == 1){
            for(int i=0; i<contactList.size(); i++){
                System.out.println(contactList.get(i));
            }
        }
        else {
            Collections.sort(contactList, new ArraySorterName());
            for (int i = 0; i < contactList.size(); i++){
                System.out.println(contactList.get(i));
            }
        }
    }


}
