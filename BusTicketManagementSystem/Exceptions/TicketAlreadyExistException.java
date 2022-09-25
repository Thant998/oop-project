package BusTicketSystem.Exceptions;

public class TicketAlreadyExistException extends Exception
{
    public TicketAlreadyExistException() {
    }

    public TicketAlreadyExistException(String message) {
        super(message);
    }
}
