import java.io.*;


public class Student {
    private final String FILE_NAME="studentdata.txt";
    public String studentNo;
    public String studentName;
    private boolean acceptStudentInformation(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the student no:");
            studentNo=br.readLine();
            if (studentNo.isEmpty()){
                System.out.println("please enter student no");
                return false;
            }
            System.out.println("enter the student name : ");
            studentName=br.readLine();
            if (studentName.isEmpty()){
                System.out.println("please enter student name:");
                return false;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return true;
    }
    public boolean saveStudentInformation(){
        if (!acceptStudentInformation()){
            return false;
        }
        try{
            PrintWriter pw=new PrintWriter(new FileWriter(new File(FILE_NAME),true));
            pw.println(studentNo+","+studentName);
            pw.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return true;
    }
    public boolean printStudentInformation(){
        try{
            BufferedReader br=new BufferedReader(new FileReader(FILE_NAME));
            System.out.println(String.format("%-15s %-40s", "student NO", "student Name"));
            String dataLine=br.readLine();
            while (dataLine!=null){
                String[] data=dataLine.split(",");
                System.out.println(String.format("%-15s %-40s",data[0],data[1]));
                dataLine=br.readLine();
            }
            br.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return true;
    }
}