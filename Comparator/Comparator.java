public class Comparator {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(13,"Tommy",23));
        list.add(new Student(2,"Chris",21));
        list.add(new Student(15,"John",27));
        list.add(new Student(41,"Sophia",24));
        System.out.println("Sorting Name");
        Collections.sort(list,new NameComparator());
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting age");
        Collections.sort(list,new AgeComparator());
        Iterator itr1=list.iterator();
        while(itr1.hasNext()) {
            Student st = (Student) itr1.next();
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }
    }
}
