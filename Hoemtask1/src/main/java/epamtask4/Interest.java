package epamtask4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



class calculate{
	calculate() throws IOException{
		
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
	bw.write("enter the value of principle amount");
	bw.flush();
	int p = Integer.parseInt(reader.readLine());
		 
	bw.write("enter the value of time period(in years)");
	bw.flush();
	int t = Integer.parseInt(reader.readLine());
		 
	bw.write("enter the rate of interest(in %)");
	bw.flush();
    double r = Integer.parseInt(reader.readLine());
		 
	bw.write("Choose \n1.Simple Interest\n2.Compound Interest");
	bw.flush();
	int type = Integer.parseInt(reader.readLine());
		 
		 
	 if(type==1) {
		 double sI= (p * t * r)/100;
		 bw.write("\nThe Intrest amount is "+sI+" Rupees");
	     bw.flush();
	 }
	 else if(type==2){
			 bw.write("\nenter the no of times interest is compunded per year");
			 bw.flush();
			 int n = Integer.parseInt(reader.readLine());
			 r=r/100;
			 double totalamountCi = p * Math.pow(1 + (r / n), n * t); 
			 
			 double cI=totalamountCi-p;
			 bw.write("\nThe interest amount is "+cI+" Rupees");
		     bw.flush();
			 
	 }
	 else {
			 bw.write("*****INVALID SELECTION*****");
			 bw.flush(); 
     }

	}
}

public class Interest {

	 public static void main(String[] args) throws IOException
	    { 
	       calculate c=new calculate();
	    } 
	
	
}