public class LabDemo{
    public static void main(String[] args) {
        Date d1 = new Date(28, 9, 2005);
        Date d2 = new Date(d1);

        if (d1.equals(d2)) {
            System.out.println("d1 and d2 are equal");
        }
    }
}