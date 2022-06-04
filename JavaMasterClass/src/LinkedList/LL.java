package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LL {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();
        cities.add("Delhi");
        addInOrder(cities, "Dehradun");
        addInOrder(cities, "Mumbai");
        addInOrder(cities, "Banglore");
        visit(cities);

        LinkedList<String> myCities = cities;

        ListIterator<String> i = myCities.listIterator();
        int count=0;
        while(i.hasNext()){
            i.next();
            count++;
        }
        System.out.println("Elements in LL: " + count);
        System.out.println("Middle Element of LL: "+ count/2);
    }
        public static boolean addInOrder (LinkedList < String > linkedList, String newName){
            ListIterator<String> stringListIterator = linkedList.listIterator();
            while (stringListIterator.hasNext()) {
                int compared = stringListIterator.next().compareTo(newName);
                if (compared == 0) {
                    System.out.println("Name already added");
                    return false;
                    //do not add name.
                } else if (compared > 0) {
                    stringListIterator.previous();
                    stringListIterator.add(newName);
                    return true;
                } else if (compared < 0) {
                    //move to next city
                }
            }
            stringListIterator.add(newName);
            return true;
        }
        public static void printList (LinkedList < String > linkedList) {
            Iterator<String> i = linkedList.iterator();

            while (i.hasNext()) {
                System.out.println("names: " + i.next());
            }
        }


    public static void visit(LinkedList cities){
            Scanner sc = new Scanner(System.in);
            boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("Empty List");
        }else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){
                case 0:
                    System.out.println("Vacation Over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Visiting: " + listIterator.next());
                    } else {
                        System.out.println("Reached end of list");
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting: " + listIterator.previous());
                    } else{
                        System.out.println("Start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("Invalid option!!");
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("Options: \nPress");
        System.out.println("\t0 - Quit");
        System.out.println("\t1- Go to next City");
        System.out.println("\t2 - Go to Previous City");
        System.out.println("\t3 - Print Menu Options");
    }
}