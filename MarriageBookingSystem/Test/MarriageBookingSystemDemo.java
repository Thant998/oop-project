package MarriageBookingSystem.Test;

import MarriageBookingSystem.Service.MarriageBookingSystem;
import MarriageBookingSystem.Utility.Applicant;
import MarriageBookingSystem.Utility.Person;

public class MarriageBookingSystemDemo {

    public static void main(String[] args) {

        MarriageBookingSystem mbs = new MarriageBookingSystem();

        Applicant a1 = new Applicant("Ajith",21,"Male",1001,null);
        Applicant a2 = new Applicant("Surya",22,"Male",1002,null);
        Applicant a3 = new Applicant("Shmriti",20,"Female",1003,null);
        Person p = new Person("Anjali",19,"Female");

        mbs.addApplicant(a1);
        mbs.addApplicant(a2);
        mbs.addApplicant(a3);
        try {
            System.out.println("FindMatch : ");
            mbs.findMatch(a3).forEach(System.out::println);

            System.out.print("AssignApplicant : ");
            System.out.println(mbs.assignApplicant(1001,p));

            System.out.println(mbs.findApplicantSummary());

            System.out.println(mbs.dropProposal(1001));

            System.out.println(mbs.findApplicantSummary());
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
