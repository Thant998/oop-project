package BusTicketSystem.Service;

import BusTicketSystem.Exceptions.InvalidBusException;
import BusTicketSystem.Exceptions.TicketAlreadyExistException;
import BusTicketSystem.Exceptions.TicketDoesNotPresentException;
import BusTicketSystem.Utility.BusManagementInterface;
import BusTicketSystem.Utility.TicketNoGenerator;

import javax.naming.LimitExceededException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class BusTicketManagement implements BusManagementInterface
{
    private ArrayList<Bus> bus;
    private TicketNoGenerator t;

   public  BusTicketManagement()
   {
       bus = new ArrayList<>();
       t = new TicketNoGenerator();
   }

    public ArrayList<Bus> getBus() {
        return bus;
    }

    public void setBus(Bus b) {
        bus.add(b);
    }

    public TicketNoGenerator getT() {
        return t;
    }

    public void setT(TicketNoGenerator t) {
        this.t = t;
    }

    @Override
    public boolean issueTicket(int busNo, Ticket t) throws TicketAlreadyExistException, LimitExceededException
    {
        ArrayList<Bus> b = (ArrayList<Bus>) bus.stream().filter(i->i.getBusNo()==busNo).collect(toList());
        if(b.isEmpty())return false;
        if(b.get(0).getTickets().size()>=50)throw new LimitExceededException();
       long c =  b.get(0).getTickets().stream().filter(i->i.getTicketNo()==t.getTicketNo()).count();
       if(c==1)throw new TicketAlreadyExistException();
       b.get(0).getTickets().add(t);
        return true;
    }

    @Override
    public HashMap<Integer, Integer> getCountOfSeniorCitizens() {
       HashMap<Integer,Integer> h = new HashMap<>();
       for(Bus i:bus)
       {
           int c = (int) i.getTickets().stream().map(Ticket::getPassenger).filter(j->j instanceof SeniorCitizen).count();
           h.put(i.getBusNo(),c);
       }
        return h;
    }

    @Override
    public boolean cancelTicket(int busNo, int ticketNo) throws TicketDoesNotPresentException, InvalidBusException
    {
        ArrayList<Bus> b = (ArrayList<Bus>) bus.stream().filter(i->i.getBusNo()==busNo).collect(toList());
        if(b.isEmpty())throw new InvalidBusException();
       ArrayList <Ticket> ti = (ArrayList<Ticket>) b.get(0).getTickets().stream().filter(i->i.getTicketNo()==ticketNo).collect(Collectors.toList());
       if(ti.isEmpty())throw new TicketDoesNotPresentException();
       b.get(0).getTickets().remove(ti.get(0));
       return true;
    }



    @Override
    public ArrayList<Passenger> getPassengersByGender(String gender)
    {
        ArrayList<Passenger> passengers = new ArrayList<>();
        for(Bus i:bus)
        {
            ArrayList<Passenger> p = (ArrayList<Passenger>) i.getTickets().stream().map(Ticket::getPassenger).filter(j->j.getGender().equalsIgnoreCase(gender)).collect(Collectors.toList());
            for(Passenger j:p)
                passengers.add(j);
        }
        return passengers;
    }

    @Override
    public long getCountOfPassengers(String source, String destination)
    {
        long c = 0;
        for(Bus i:bus)
            c += i.getTickets().stream().map(Ticket::getPassenger).filter(j->j.getSource().equalsIgnoreCase(source)&&j.getDestination().equalsIgnoreCase(destination)).count();
        return c;
    }
}
