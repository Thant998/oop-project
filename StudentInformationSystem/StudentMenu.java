import java.io.*;

public class StudentMenu {
    public static void main(String args[]){
        try{
            BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
            Student s=new Student();
            String select="";
            do{
                showMenu();
                select=br.readLine();
                switch (select){
                    case "1":
                        if (s.saveStudentInformation())
                            System.out.println("Save successful...");
                        else
                            System.out.println("Error occured while saving student information..");
                        break;
                    case "2":
                        if (s.printStudentInformation())
                            System.out.println("printing successful..");
                        else
                            System.out.println("Error occured while printint studetn information..");
                        break;
                    case "3":
                        return;
                }
            } while (!select.equals("3"));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    private static void showMenu(){
        System.out.println("1: Add student");
        System.out.println("2: Print all student");
        System.out.println("3: Exit");
        System.out.println("Select Number (1 or 2 or 3):");
    }
}