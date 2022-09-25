import java.io.*;
import java.net.*;
class RServer
{
	public static void main(String[] args)throws Exception
	{
		ServerSocket rs =  new ServerSocket(2020);
		
		
		Socket rc = rs.accept();
		BufferedReader bs = new BufferedReader(new InputStreamReader(rc.getInputStream())); 
		PrintStream    ps = new PrintStream(rc.getOutputStream()) ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		String m;
		do
        {
		     System.out.print("You : ");
			 m = br.readLine();
			 ps.println("Dhoni : "+m);
			 System.out.println(bs.readLine());
		}while(!m.equalsIgnoreCase("bye"));
	}
}