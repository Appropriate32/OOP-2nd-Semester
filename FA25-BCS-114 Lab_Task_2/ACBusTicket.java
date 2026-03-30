public class ACBusTicket extends BusTicket {
    private int acLevel;
    private String snackIncluded;

    ACBusTicket(int ticketNumber, double fare,String route, int seatNumber, int acLevel, String snackIncluded) {
        super(ticketNumber, fare, route, seatNumber);
        this.acLevel = acLevel;
        this.snackIncluded = snackIncluded;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("AC Level: " + acLevel);
        System.out.println("Snack Included: " + snackIncluded);
    }

    public String toString() {
    
    return super.toString() + String.format(
        "\n%-15s : %d\n%-15s : %s", 
        "AC Level", acLevel, 
        "Snacks", snackIncluded
    );
}
}