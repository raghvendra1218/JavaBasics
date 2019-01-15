package com.raghvendra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title,duration));
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title){
        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;

        if(index >=0 && (index <= playList.size())){
            Song song = this.songs.get(index);
            boolean isSongPresent = findSongInPlaylist(song, playList);
            if(isSongPresent){
                System.out.println("Song with track number "+ trackNumber+ " is already present in the playlist");
                return false;
            } else {
                playList.add(this.songs.get(index));
                return true;
            }
        } else {
            System.out.println("Track number " + trackNumber + " is not in the album");
            return false;
        }
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList){
        Song songToBeAdded = findSong(title);
        boolean isSongPresent = findSongInPlaylist(songToBeAdded, playList);
        if(songToBeAdded == null){
            System.out.println("Song with title "+ title+ " is not present in the album");
            return false;
        } else if(isSongPresent) {
            System.out.println("Song with title "+ title+" is already present in the album");
            return false;
        } else {
            playList.add(songToBeAdded);
            return true;
        }
    }

    private boolean findSongInPlaylist(Song song, LinkedList<Song> createdPlayList){
        if(createdPlayList.contains(song)){
            return true;
        } else {
            return false;
        }
    }
}
