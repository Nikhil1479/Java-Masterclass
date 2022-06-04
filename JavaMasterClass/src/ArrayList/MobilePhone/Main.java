package ArrayList.MobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("+91 8273011131");

    public static void main(String[] args) {

        boolean quit = false;
        int choice;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = true;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t0 - Print Instructions");
        System.out.println("\t1 - Print List of Contacts");
        System.out.println("\t2 - Add new Contact");
        System.out.println("\t3 - Update Contact");
        System.out.println("\t4 - Remove Contact");
        System.out.println("\t5 - Query Contact");
    }

    public static void printContacts() {
        System.out.println("Contact List");
        mobilePhone.printContacts();
    }

    public static void addContact() {
        System.out.println("Enter Contact Name");
        String name = sc.nextLine();

        System.out.println("Enter Phone Number");
        String phone = sc.nextLine();

        Contact newContact = Contact.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New Contact Added " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add " + name + " already on file");
        }
    }

    public static void updateContact() {
        System.out.println("Enter existing contact");
        String name = sc.nextLine();

        Contact ExistingContact = mobilePhone.queryContact(name);
        if (ExistingContact == null) {
            System.out.println("Contact Not Found");
            return;
        }

        System.out.println("\nEnter new Contact name");
        String newContactName = sc.nextLine();

        System.out.println("Enter Phone Number");
        String newContactPhone = sc.nextLine();

        Contact newContact = Contact.createContact(newContactName, newContactPhone);

        if (mobilePhone.updateContact(ExistingContact, newContact)) {
            System.out.println(newContact.getName() + " successfully updated");
        } else {
            System.out.println("Error updating Record");
        }
    }

    public static void removeContact() {
        System.out.println("Enter Name of Contact you want to remove: ");
        String name = sc.nextLine();

        Contact existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact not found!!");
            return;
        }

        else {
            System.out.println(existingContact.getName() + " removed from contacts");
            mobilePhone.removeContact(existingContact);
        }
    }

    public static void queryContact() {
        System.out.println("Enter Existing Contact Name: ");
        String name = sc.nextLine();

        Contact existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact not found!!");
            return;
        }

        else {
            System.out.println(
                    "Name: " + existingContact.getName() + "\nPhone Number: " + existingContact.getPhoneNumber());

        }

    }
}