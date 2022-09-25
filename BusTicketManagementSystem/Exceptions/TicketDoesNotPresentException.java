package BusTicketSystem.Exceptions;

public class TicketDoesNotPresentException extends Exception {
    public TicketDoesNotPresentException() {
    }

    public TicketDoesNotPresentException(String message) {
        super(message);
    }
}
