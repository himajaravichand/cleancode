package epam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Simple_And_Compound {
	static double amount;
	static double time;
	static double rate;
	public static double simple(){
		double Total_Amount = 0;
		Total_Amount = (amount * time * rate)/100;
		return Total_Amount;
	}
	public static double compound(){
		double Total_Amount = 0;
		Total_Amount = amount *(Math.pow(1+(rate/100),time));
		return (Total_Amount);
	}
	

	public Simple_And_Compound(double x,double y,double z) {
		amount = x;
		time = y;
		rate = z;
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Simple_And_Compound obj =new Simple_And_Compound(1200,2,5.4);
		bw.write("Compound Interest : " + (double) obj.compound()+"\n");
		bw.write("Simple Intrest : " + (double)obj.simple()+"\n");
		bw.flush();

	}

}
