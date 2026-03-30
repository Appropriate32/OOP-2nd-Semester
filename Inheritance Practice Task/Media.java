public class Media {
    private int testAttribute;
    String title;
    double fileSize;
    double duration;

    Media(String title, double fileSize, double duration) {
        this.title = title;
        this.fileSize = fileSize;
        this.duration = duration;
    }

    public void pause() {

    }

    public void setTestAttribute(int testAttribute) {
        this.testAttribute = testAttribute;
    }

    public void display() {
        System.out.println("Title: " + title + ", File Size: " + fileSize + ", Duration: " + duration);
    }

    public void stop() {

    }

    public void test() {

    }

    public void play() {

    }

    public int getTestAttribute() {
        return testAttribute;
    }

    @Override
    public String toString() {
        return String.format("Title: %s, File Size: %.2f, Duration: %.2f", title, fileSize, duration);
    }
}