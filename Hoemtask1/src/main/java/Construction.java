
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


class cost{
	cost() throws IOException{
		int total=0;
	BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter rd = new BufferedWriter(new OutputStreamWriter(System.out));
		 
	rd.write("Welcome to Epam Constructions\nPlease Select the type of material\n1.standard materials\n2.above standard materials\n3.high standard material\n4.Fully automated House");
	rd.flush();
	int m = Integer.parseInt(read.readLine());
	rd.write("enter the area of the house(In square feets)");
	rd.flush();
	int material=m;
	int area = Integer.parseInt(read.readLine());
	
	if(material==1) {
		 total=1200*area;
	}
	if(material==2) {
		 total=1500*area;
	}
	if(material==3) {
		 total=1800*area;
	}
	if(material==4) {
		 total=2500*area;
	}
	
	 rd.write("\nThe Estimated cost is "+total+" Rupees");
     rd.flush();

	}
}
public class Construction {
	public static void main(String[] args) throws IOException
    { 
cost c =new cost();

    } 

}