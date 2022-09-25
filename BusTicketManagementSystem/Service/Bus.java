package BusTicketSystem.Service;

import java.util.ArrayList;

public class Bus
{
    private int busNo;
    private String startStation;
    private String destinationStation;
    private ArrayList<Ticket> tickets;

    public Bus(int busNo, String startStation, String destinationStation) {
        this.busNo = busNo;
        this.startStation = startStation;
        this.destinationStation = destinationStation;
        tickets = new ArrayList<>();
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNo=" + busNo +
                ", startStation='" + startStation + '\'' +
                ", destinationStation='" + destinationStation + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
