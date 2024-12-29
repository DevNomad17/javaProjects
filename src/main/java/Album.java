import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    private Song findSong(String title) {
        for (Song s : songs) {
            if (s.getTitle().equalsIgnoreCase(title))
                return s;
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title)  == null) {
            Song s = new Song(title, duration);
            songs.add(s);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        try {
            playlist.addLast(songs.get(trackNumber-1));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean addToPlayList(String trackName, LinkedList<Song> playlist) {
        if (findSong(trackName) == null)
            return false;
        playlist.addLast(findSong(trackName));
        return true;
    }
}
