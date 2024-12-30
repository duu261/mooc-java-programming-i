
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        // compare location
        if (this == compared) {
            return true;
        }
        // compare type
        if (!(compared instanceof Song)) {
            return false;
        }
        // convert Object to Song for compare
        Song songCompared = (Song) compared;
        if (this.name.equals(songCompared.name) &&
                this.artist.equals(songCompared.artist) &&
                this.durationInSeconds == songCompared.durationInSeconds) {
            return true;

        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
