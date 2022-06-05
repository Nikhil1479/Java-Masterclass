package LinkedList.PlayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();

        Album album = new Album("Fav" , "Nikhil");

        album.addSong("As it was", 2.5);
        album.addSong("Pasoori", 4.5);
        album.addSong("What Makes you beautiful", 3.6);
        album.addSong("Night Changes", 4.5);
        album.addSong("Drag me down", 4.6);
        album.addSong("Alone with you", 5.1);
        album.addSong("Kasoor", 3.18);
        album.addSong("Act up", 3.19);
        albums.add(album);

        album = new Album("MyAlbum", "CoolDude");
        album.addSong("Code",2.6);
        album.addSong("RunIt",2.43);
        albums.add(album);
        LinkedList<Song> playlist = new LinkedList<Song>();

        albums.get(0).addToPlaylist("As it was", playlist);
        albums.get(0).addToPlaylist("Pasoori", playlist);
        albums.get(0).addToPlaylist("What Makes you beautiful", playlist);
        albums.get(0).addToPlaylist("Night Changes", playlist);
        albums.get(0).addToPlaylist("Drag me down", playlist);
        albums.get(0).addToPlaylist("Alone with you", playlist);
        albums.get(1).addToPlaylist("Code", playlist);
        albums.get(1).addToPlaylist("RunIt", playlist);

        play(playlist);
    }

    public static void play(LinkedList<Song> playlist){
        boolean quit = false;
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean goingForward = true;
        ListIterator<Song> i = playlist.listIterator();
        printInstructions();

        while(!quit){
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    System.out.println("Come back Again");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(i.hasNext()) {
                            i.next();
                        }
                            goingForward = true;
                    }
                    if(i.hasNext()){
                        System.out.println("Now Playing: " + i.next().toString());
                    } else{
                        System.out.println("Reached end of the list");
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(i.hasPrevious()){
                            i.previous();
                        }
                        goingForward = false;
                    }
                    if(i.hasPrevious()){
                        System.out.println("Now Playing: " + i.previous().toString());
                    } else{
                        System.out.println("Start of the list");
                    }
                    break;
                case 3:
                    if(goingForward){
                        if(i.hasPrevious()){
                            i.previous();
                        }
                        goingForward = false;
                    }
                    if(i.hasPrevious()){
                        System.out.println("Now Replaying " + i.previous().toString());
                    }
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
                case 4:
                    System.out.println("=================================");
                    int count = 0;
                    while(i.hasNext()){
                        count++;
                        System.out.println(count +". "+ i.next().toString());
                    }
                    System.out.println("\nTotal " + count + " songs in your playlist");
                    System.out.println("=================================");
                    break;
                case 5:
                    printInstructions();
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("==========Menu==========");
        System.out.println("\nPress");
        System.out.println("\t0 - Quit");
        System.out.println("\t1 - Play Next");
        System.out.println("\t2 - Play Previous");
        System.out.println("\t3 - Replay Current Song");
        System.out.println("\t4 - Song List");
        System.out.println("\t5 - Print Menu");
    }
}