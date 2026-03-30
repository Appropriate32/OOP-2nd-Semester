public class Video extends Media {
    int frameRate;
    int resolution;

    Video(String title, double fileSize, double duration, int frameRate, int resolution) {
        super(title, fileSize, duration);
        this.frameRate = frameRate;
        this.resolution = resolution;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title + ", File Size: " + fileSize + ", Duration: " + duration + ", Framerate: " + frameRate + ", Resolution: " + resolution);
    }
}