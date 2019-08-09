import java.util.Arrays;

public class Desktop extends MusicApp implements MusicPlayer  {

    public Desktop(String version) {
        super(version);
    }

    @Override
    public String play(Song song) {
        return "Playing: " + song.getName() + " by " + song.displayArtistAsText();
    }
}