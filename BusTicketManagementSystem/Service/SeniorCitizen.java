package BusTicketSystem.Service;

public class SeniorCitizen extends Passenger{
    private int age;

    public SeniorCitizen(String passengerName, String gender, String source, String destination, int age) {
        super(passengerName, gender, source, destination);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SeniorCitizen{" +
                "age=" + age +
                '}';
    }
}
