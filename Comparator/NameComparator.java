import java.util.*;
class NameComparator implements Comparator {
    public int compare(Object obj1,Object obj2){
        Student st1=(Student)obj1;
        Student st2=(Student)obj2;

        return st1.name.compareTo(st2.name);
    }
}