class Singleroom implements Serializable
{
    String name;
    String contact;
    String gender;
    ArrayList<Food> food =new ArrayList<>();


    Singleroom()
    {
        this.name="";
    }
    Singleroom(String name,String contact,String gender)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
    }
}