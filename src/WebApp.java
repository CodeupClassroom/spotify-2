public class WebApp extends MusicApp implements MusicPlayer {
    public WebApp(String version) {
        super(version);
    }

    @Override
    public String play(Song song) {
        return "Streaming: " + song.getName() + " by " + song.displayArtistAsText();
    }
}