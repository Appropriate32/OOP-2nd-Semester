public class LabDemo{
    public static void main(String[] args) {
        Date labDate = new Date(15, 5, 2026);

        Lab lab1 = new Lab(101, "COMSATS", "CS", "Section C", "Lab C8", 50, 0, labDate);
        Lab lab2 = new Lab(102, "UMT"); // Uses default values for other parameters
        Lab lab3 = new Lab(); // Uses default constructor
        
        // Created using copy constructor
        Lab clonedLab = new Lab(lab1);

        // Perform booking and cancelling operations
        System.out.println("-- Testing Lab 1 Operations ---");
        lab1.bookComputers(20);
        System.out.println("Available Now: " + lab1.availableComputers());
        lab1.cancelBooking(5);

        // Compare two objects using equals()
        System.out.println("\n--- Comparing Labs ---");
        if (lab1.equals(clonedLab)) {
            System.out.println("Result: lab1 and clonedLab are equal");
        } else {
            System.out.println("Result: lab1 and clonedLab are NOT equal");
        }

        if (lab1.equals(lab2)) {
            System.out.println("Result: lab1 and lab2 are equal");
        } else {
            System.out.println("Result: lab1 and lab2 are NOT equal.");
        }

        // Printing object details
        System.out.println("\n--- Lab Details ---");
        System.out.println(lab1);
        System.out.println(lab2);
        System.out.println(lab3);

        // Show total count
        System.out.println("\n--- System Status ---");
        System.out.println("Total labs created: " + Lab.getInstanceCount());
    }
}