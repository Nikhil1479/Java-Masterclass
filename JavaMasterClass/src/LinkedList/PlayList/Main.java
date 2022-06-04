package LinkedList.PlayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();

        Album album = new Album("Fav" , "Nikhil");

        album.addSong("As it was", 2.5);
        album.addSong("Closer", 3.5);

        albums.add(album);

        album = new Album("MyAlbum", "CoolDude");
        album.addSong("Code",2.6);
        albums.add(album);
        LinkedList<Song> playlist = new LinkedList<Song>();

        album.addToPlaylist("As it was",playlist);

    }
}