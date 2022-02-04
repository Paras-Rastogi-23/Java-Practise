package com.company;

import java.util.LinkedList;

public class Album {
    private String Artist;
    private String Name;
    private LinkedList<Song> songs;

    public Album(String artist, String name) {
        Artist = artist;
        Name = name;
        this.songs = new LinkedList<Song>();
    }

    public boolean addSong(String title,double duration){
        Song checkedSong = findSong(title);
        if(checkedSong == null){
          this.songs.add(new Song(title,duration));
        }
        return false;
    }

    public Song findSong(String title){
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
     return null;
    }

    public boolean addToPlayList(int trackNumber , LinkedList<Song> playlist){
        int index = trackNumber-1;
        if((index>=0) && index<playlist.size()){
            playlist.add(songs.get(index));
        }
        return false;
    }

    public boolean addToPlayList(String title , LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
        }
        return false;
    }
}
