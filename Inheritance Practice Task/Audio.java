public class Audio extends Media {
    int bitrate;
    String artist;

    Audio(String title, double fileSize, double duration, int bitrate, String artist) {
        super(title, fileSize, duration);
        this.bitrate = bitrate;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return String.format("Title: %s, File Size: %.2f, Duration: %.2f, Bitrate: %2d, Artist: %s", title, fileSize, duration, bitrate, artist);
    }

    public void test(int bitrate) {

    }

    public void display() {
        System.out.println("Title: " + title + ", File Size: " + fileSize + ", Duration: " + duration + ", Bitrate: " + bitrate + ", Artist: " + artist);
    }
}