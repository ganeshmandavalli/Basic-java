package BankProject;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
public class Sendsms {
  
	public static void sendSMS(float amt ,int acc_no)
	{
		try
		{
			String apiKey="apiKey="+"mxoreG6qov4-fnc3hZjC3Rl1690S23H55scbBfZkQ8";
			
			String message="&message="+URLEncoder.encode("Rs."+amt+" has been debit from your a/c no XXXX"+acc_no,"UTF-8");
			
			String numbers="&numbers="+"7275168891";
			String apiURL="https://api.textlocal.in/send/?" + apiKey + message + numbers;
			URL url=new URL(apiURL);
			URLConnection con=url.openConnection();
			con.setDoOutput(true);
			
			BufferedReader reader=new BufferedReader(new 
					InputStreamReader(con.getInputStream()));
			String line= "";
			StringBuilder sb=new StringBuilder();
			while((line = reader.readLine())!=null)
			{
				sb.append(line).append("\n");
			}
			System.out.println(sb.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
