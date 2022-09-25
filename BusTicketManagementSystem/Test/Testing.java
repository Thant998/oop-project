package BusTicketSystem.Test;

import BusTicketSystem.Exceptions.TicketAlreadyExistException;
import BusTicketSystem.Service.*;

import javax.naming.LimitExceededException;

public class Testing {
    public static void main(String[] args) throws TicketAlreadyExistException, LimitExceededException {
        BusTicketManagement b = new BusTicketManagement();
        Bus b1 = new Bus(123,"Tanjore","Chennai");
        Bus b2 = new Bus(132,"Tanjore","Kovai");
        b.setBus(b1);
        b.setBus(b2);
        Passenger p1 = new Passenger("Rohinth","Male","Tanjore","Kovai");
        Passenger p2 = new SeniorCitizen("Simren","Female","Tanjore","Chennai",50);
        Passenger p3 = new Passenger("Sachin","Male","Tanjore","Kovai");
        Ticket t1 = new Ticket(b.getT().generateTicketNo(132),150,p1);
        Ticket t2 = new Ticket(b.getT().generateTicketNo(123),500,p2);
        Ticket t3 = new Ticket(b.getT().generateTicketNo(132),150,p3);
        b.issueTicket(132,t1);
        b.issueTicket(123,t2);
        b.issueTicket(132,t3);
        System.out.println(b.getPassengersByGender("Female"));
        System.out.println(b.getCountOfSeniorCitizens());
        System.out.println(b.getCountOfPassengers("Tanjore","Kovai"));
    }
}
