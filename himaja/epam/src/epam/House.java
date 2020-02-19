package epam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class House {
	static String quality;
	static int area;
	static long cost =0;
	public House(String w,int area_in_feets) {
		quality = w;
		area = area_in_feets;
		
		// TODO Auto-generated constructor stub
	}
	public static long construction_cost(){
		 if(quality.contentEquals("standard"))
			 cost = (1200 * area);
		 else if(quality.contentEquals("above_standard"))
			 cost = (1500 * area);
		 else if(quality.contentEquals("high_standard"))
			 cost = (1800 * area);
		 else if(quality.contentEquals("high_standard_automated"))
			 cost = (2500 * area);
		 return cost;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// TODO Auto-generated method stub
		House obj = new House("standard",20);
		bw.write("Area if standard is "+ obj.construction_cost()+"\n");
		House obj1 = new House("above_standard",20);
		bw.write("Area if above standard is "+ obj1.construction_cost()+"\n");
		House obj2 = new House("high_standard",20);
		bw.write("Area if high standard is  "+ obj2.construction_cost()+"\n");
		House obj3 = new House("high_standard_automated",20);
		bw.write("Area if high standard and automated is "+ obj3.construction_cost()+"\n");
		bw.flush();

	}

}
