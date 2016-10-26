import java.util.*;
import java.io.*;
import java.lang.Math;
public class StudentAverages_Out {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sf = new Scanner(new File("E:\\AP Comp Sci\\StudentAverages\\src\\StudentScores.in"));
		String []a = new String[1000];
		int maxIndx = -1;
		while(sf.hasNext()){
			maxIndx++;
			a[maxIndx] = sf.nextLine();
		}
		sf.close();
		FileWriter fw = new FileWriter("E:\\AP Comp Sci\\StudentAveragesPart2\\src\\StudentScores.out");
		PrintWriter output = new PrintWriter(fw);
		int total;
		int num;
		int average;
		String result = "";
		for (int n = 0; n <= maxIndx; n++){
			total = 0;
			num = 0;
			result = "";
			Scanner sc = new Scanner(a[n]);
			result = result + sc.next() + ", average = ";
			while (sc.hasNextInt()){
				total += sc.nextInt();
				num++;
			}
			average = (int)Math.round((double)total / num);
			result = result + average;
			output.println(result);
		}
		output.close();
		fw.close();
	}
}
