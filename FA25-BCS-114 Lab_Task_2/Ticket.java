public class Ticket {
    private int ticketNumber;
    private double fare;
    private boolean isBooked = false;

    Ticket(int ticketNumber, double fare) {
        this.ticketNumber = ticketNumber;
        this.fare = fare;
    }

    public void book() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket number " + ticketNumber + " successfully booked!");
        }
    }

    public void cancel() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Ticket Cancelled! 10% of the original fare will be charged as cancellation cost!");
            fare -= (0.1 * fare); // Subtracts 10% of the fare
        }
    }

    public void display() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Fare: " + fare);
    }

    @Override
    public String toString() {
        return String.format(
            "%-15s : %d\n%-15s : %.2f", 
            "Ticket Number", ticketNumber, 
            "Fare", fare
        );
    }
}
