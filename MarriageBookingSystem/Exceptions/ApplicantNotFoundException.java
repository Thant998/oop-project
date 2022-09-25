package MarriageBookingSystem.Exceptions;

public class ApplicantNotFoundException extends Exception{

    String msg;
    public ApplicantNotFoundException(String message) {
        super(message);
        msg = message;
    }

    @Override
    public String toString() {
        return "ApplicantNotFoundException{" +
                "message='" + msg + '\'' +
                '}';
    }
}
