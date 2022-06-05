package LinkedList.PlayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String albumName, String artistName){
        this.name = albumName;
        this.artist = artistName;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        Song checkedSong = findSong(title);
        if(checkedSong == null){
            songs.add(new Song(title, duration));
            return true;
        }else{
            return false;
        }
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber-1;
        if(index >= 0 && index <= songs.size()){
            Song checkedSong = songs.get(index);
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The album does not have a track " + trackNumber);
        return false;

    }
    private Song findSong(String title){
        for(int i=0; i < songs.size();i++){
            Song checkedSong = songs.get(i);
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
}