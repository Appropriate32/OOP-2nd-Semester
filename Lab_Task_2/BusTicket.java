public class BusTicket extends Ticket {
    private String route;
    private int seatNumber;

    BusTicket(int ticketNumber, double fare,String route, int seatNumber) {
        super(ticketNumber, fare);
        this.route = route;
        this.seatNumber = seatNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Route: " + route);
        System.out.println("Seat Number: " + seatNumber);
    }

    public String toString() {
            return super.toString() + String.format(
            "\n%-15s : %s\n%-15s : %d", 
            "Route", route, 
            "Seat Number", seatNumber
        );
    }
}