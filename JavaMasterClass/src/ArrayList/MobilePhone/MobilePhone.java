package ArrayList.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            myContacts.remove(contact);
            return true;
        }
        else{
            System.out.println("Contact doesn't Exist");
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact.getName()) >= 0){
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
        else{
            System.out.println(oldContact.getName() + " Not Found!!");
            return false;
        }
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return myContacts.get(position);
        }
        return null;
    }
    private int findContact(Contact contact){
        int Position = myContacts.indexOf(contact);
        return Position;
    }

    private int findContact(String contactName){
        for(int i = 0 ; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
}