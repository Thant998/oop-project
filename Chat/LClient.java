import java.io.*;
import java.net.*;
class LClient
{
	public static void main(String[] args)throws Exception 
	{
		Socket rc = new Socket("Ipv4 Address",2020);
		BufferedReader bs = new BufferedReader(new InputStreamReader(rc.getInputStream()));
		PrintStream ps = new PrintStream(rc.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String m;
		do
		{
			 System.out.println(bs.readLine());
			 System.out.print("You : ");
			 m = br.readLine();
			 ps.println("Vignesh : "+m);
		}while(!m.equalsIgnoreCase("bye"));
		
	}
}