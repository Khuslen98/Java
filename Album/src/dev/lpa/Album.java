import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
    private Song findSong(String songTitle) {
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1; // Adjust for zero-based indexing
        // Check if the track number is valid
        if (index >= 0 && index < songs.size()) {
            Song selectedSong = songs.get(index);
            // Check if the song is not already in the playlist
            if (!playlist.contains(selectedSong)) {
                playlist.add(selectedSong);
                return true; // Song added to the playlist successfully
            } else {
                System.out.println("Song is already in the playlist.");
                return false; // Song is already in the playlist
            }
        } else {
            System.out.println("Invalid track number.");
            return false; // Invalid track number
        }
    }

    // Method to add a song to a playlist by title
    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                // Check if the song is not already in the playlist
                if (!playlist.contains(song)) {
                    playlist.add(song);
                    return true; // Song added to the playlist successfully
                } else {
                    System.out.println("Song is already in the playlist.");
                    return false; // Song is already in the playlist
                }
            }
        }
        System.out.println("Song with title '" + songTitle + "' not found in the album.");
        return false; // Song with the given title not found
    }
}