public class Podcast extends Audio {
    String hostName;
    int episodeNumber;

    Podcast(String title, double fileSize, double duration, int episodeNumber, String hostName) {
        super(title, fileSize, duration, episodeNumber, hostName);
        this.episodeNumber = episodeNumber;
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return String.format("Title: %s, File Size: %.2f, Duration: %.2f, Episode Number: %2d, Host Name: %s", title, fileSize, duration, episodeNumber, hostName);
    }

    public void display() {
        System.out.println("Title: " + title + ", File Size: " + fileSize + ", Duration: " + duration + ", Episode Number: " + episodeNumber + ", Host Name: " + hostName);
    }
}