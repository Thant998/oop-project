public class Person {
    private String userName;
    private String SSN;
    private String getId(){
        return SSN + "-" + userName;
    }
    public String getUserName(){
        return userName;
    }
    public boolean isSamePerson(Person p){
        if(p.getId().equals(this.getId())){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        Person yuan = new Person();
        yuan.userName = "yuan";
        yuan.SSN = "123456789";
        System.out.println (yuan.userName);
        System.out.println (yuan.isSamePerson(yuan));
    }
}