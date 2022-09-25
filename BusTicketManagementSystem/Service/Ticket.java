package BusTicketSystem.Service;

public class Ticket
{
    private int ticketNo;
    private double ticketPrice;
    private Passenger passenger;

    public Ticket(int ticketNo, double ticketPrice, Passenger passenger) {
        this.ticketNo = ticketNo;
        this.ticketPrice = ticketPrice;
        this.passenger = passenger;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNo=" + ticketNo +
                ", ticketPrice=" + ticketPrice +
                ", passenger=" + passenger +
                '}';
    }
}
