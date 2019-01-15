package com.raghvendra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums =  new ArrayList<Album>();
    public static void main(String[] args) {
	// write your code here
        Album album = new Album("RadhaBhakti","Gulshan Kumar");
        album.addSong("kabhi Ram Kabhi Shyam",5.45);
        album.addSong("Sita chali lanka",4.23);
        album.addSong("Ram chale vanwaas",3.56);
        album.addSong("Hanuman Chalisaa",5.03);
        album.addSong("Ganesh Aarti",5.23);
        albums.add(album);

        album = new Album("Romantic Songs", "Kumar Sanu");
        album.addSong("Maine pyar kiya hai tumhi se", 2.45);
        album.addSong("Ye dil", 3.23);
        album.addSong("Luv Story", 4.23);
        album.addSong("Tu cheez badi hai mast mast", 4.56);
        albums.add(album);

        LinkedList<Song> myPlaylist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("kabhi Ram Kabhi Shyam",myPlaylist);
        albums.get(0).addToPlaylist("Ganesh Aarti",myPlaylist);
        albums.get(0).addToPlaylist("Ganesh Aarti",myPlaylist);
        albums.get(0).addToPlaylist(3,myPlaylist);
        albums.get(0).addToPlaylist(3,myPlaylist);
        albums.get(0).addToPlaylist(6,myPlaylist); //Track number is not there in the album
        albums.get(1).addToPlaylist("Maine pyar kiya hai tumhi se",myPlaylist);
        albums.get(1).addToPlaylist("Ye dil",myPlaylist);
        albums.get(1).addToPlaylist(2,myPlaylist);
//        albums.get(1).addToPlaylist(5,myPlaylist);
//        albums.get(1).addToPlaylist(6,myPlaylist);
        play(myPlaylist);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward =  true;
        ListIterator lit = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("Playlist is empty");
            return;
        } else {
            System.out.println("Now Playing "+ lit.next().toString());
        }
        printMenu();
        while(!quit){
            System.out.println("Enter the action from the Menu");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Existing from the Playlist");
                    quit = true;
                    break;

                case 1:
                    if(!forward) {
                        if(lit.hasNext()){
                            lit.next();
                        }
                        forward = true;
                    }
                    if(lit.hasNext()) {
                        System.out.println("Now Playing "+ lit.next().toString());
                    } else {
                        System.out.println("Reached at the end of the list");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(lit.hasPrevious()){
                            lit.previous();
                        }
                        forward = false;
                    }
                    if(lit.hasPrevious()){
                        System.out.println("Now Playing "+ lit.previous().toString());
                    } else {
                        System.out.println("Reached at the beginning of the list");
                        forward = true;
                    }
                    break;

                case 3:
                    if(forward) {
                        if(lit.hasPrevious()){
                            System.out.println("Now replaying: "+ lit.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are the start fo the playlist");
                            forward = true;
                        }
                    } else {
                        if(lit.hasNext()){
                            System.out.println("Now replaying " + lit.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the list");
                            forward = false;
                        }
                    }
                    break;

                case 4:
                    if(playList.size() > 0){
                        lit.remove();
                        if(lit.hasNext()){
                            System.out.println("Now playing "+ lit.next());
                        } else if(lit.hasPrevious()){
                            System.out.println("Now playing "+ lit.previous());
                        }
                    }
                    break;

                case 5:
                    printList(playList);
                    break;

                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Enter the action from the Menu: \n Press: ");
        System.out.println( "\n 0 - Exit from the Menu\n"+
                            "\n 1 - Play next song\n"+
                            "\n 2 - Play previous song \n"+
                            "\n 3 - replay the song\n"+
                            "\n 4 - Remove the song from the playlist\n"+
                            "\n 5 - Print the songs in the playlist\n"+
                            "\n 6 - Print the Menu");
    }

    private static void printList(LinkedList<Song> playList){
        for(Song song : playList){
            System.out.println(song.toString());
        }
    }
}
