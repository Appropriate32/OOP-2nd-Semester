public class test {
    public static void main(String[] args) {
        
        
        Ticket basicTicket = new Ticket(101, 500.0);
        BusTicket standardBus = new BusTicket(202, 1500.0, "Lahore to Multan", 14);
        ACBusTicket luxuryBus = new ACBusTicket(303, 3500.0, "Lahore to Islamabad", 5, 2, "Yes (Juice & Sandwich)");

       
        System.out.println("=== 1. TESTING PARENT CLASS (Ticket) ===");
        // Requirement: Show parent class methods work correctly.
        basicTicket.display(); 
        basicTicket.book();
        basicTicket.cancel();
        
       
        System.out.println("\n=== 2. TESTING CHILD CLASS (BusTicket) ===");
        // Requirement: Show overridden methods produce different behavior. 
        standardBus.display(); 
        
        System.out.println("\n--- Testing Inherited Methods ---");
        // Requirement: Show inherited methods are accessible in child classes. 
        standardBus.book(); 
        standardBus.cancel();

        
        System.out.println("\n=== 3. TESTING GRANDCHILD CLASS (ACBusTicket) ===");
        
        luxuryBus.display();
        
        System.out.println("\n--- Testing Inherited Methods from Grandparent ---");
        luxuryBus.book();

        System.out.println("\n--- Testing toString() Override Chain ---");
        
        System.out.println(luxuryBus); 
    }
}