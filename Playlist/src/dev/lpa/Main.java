package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
    public static class Album {
        private String name;
        private String artist;
        private ArrayList<Song> songs;

        public Album(String name, String artist) {
            this.name = name;
            this.artist = artist;
            this.songs = new ArrayList<>();
        }
    }
    public static String findSong(String name){
        if (songs.contains(name)){
            return name;
        }
        return null;
    }
}
