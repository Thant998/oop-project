package MarriageBookingSystem.Service;

import MarriageBookingSystem.Exceptions.ApplicantNotFoundException;
import MarriageBookingSystem.Utility.Applicant;
import MarriageBookingSystem.Utility.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MarriageBookingSystem {
    List<Applicant> applicants = new ArrayList<>();
    public boolean addApplicant(Applicant a)
    {
        if(applicants.stream().filter(i->i.getApplicantId() == a.getApplicantId()).limit(1).count() != 0)return false;
        applicants.add(a);
        return true;
    }

    public boolean dropProposal(int applicantId)
    {
        List<Applicant> list = applicants.stream()
                               .filter(i->i.getApplicantId() == applicantId)
                               .limit(1).collect(Collectors.toList());
        if(list.isEmpty())return false;

        list.get(0).setPartner(null);
        return true;
    }

   public List<Applicant> findMatch(Applicant a)throws ApplicantNotFoundException{
        List<Applicant> list = applicants.stream().filter(i -> !i.getSex().equalsIgnoreCase(a.getSex()))
                               .filter(j -> j.getAge() >= a.getAge()).collect(Collectors.toList());
        if(list.isEmpty())throw new ApplicantNotFoundException("No applicant match\\found");

        return list;
    }

    public boolean assignApplicant(int applicantId, Person a){
        List<Applicant> list = applicants.stream()
                .filter(i->i.getApplicantId() == applicantId)
                .limit(1).collect(Collectors.toList());

        if(list.isEmpty())return false;

        list.get(0).setPartner(a);
        return true;
    }

    public Map<String,Integer> findApplicantSummary(){

        return applicants.stream().filter(i -> i.getPartner() == null)
                .collect(Collectors.toMap(k-> k.getName(),k-> k.getApplicantId()));
    }
}
