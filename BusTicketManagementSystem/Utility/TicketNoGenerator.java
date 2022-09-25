package BusTicketSystem.Utility;

public class TicketNoGenerator
{
    static int i;
    public int generateTicketNo(int busNo)
    {
       i++;
       return i;
    }
}
