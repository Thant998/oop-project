package BusTicketSystem.Utility;

import BusTicketSystem.Exceptions.InvalidBusException;
import BusTicketSystem.Exceptions.TicketAlreadyExistException;
import BusTicketSystem.Exceptions.TicketDoesNotPresentException;
import BusTicketSystem.Service.Passenger;
import BusTicketSystem.Service.Ticket;

import javax.naming.LimitExceededException;
import java.util.ArrayList;
import java.util.HashMap;

public interface BusManagementInterface
{
    public boolean issueTicket(int busNo, Ticket t)throws TicketAlreadyExistException, LimitExceededException;
    public HashMap<Integer,Integer> getCountOfSeniorCitizens();
    public boolean cancelTicket(int busNo,int ticketNo)throws TicketDoesNotPresentException, InvalidBusException;
    public ArrayList<Passenger> getPassengersByGender(String gender);
    public long getCountOfPassengers(String source,String destination);
}
