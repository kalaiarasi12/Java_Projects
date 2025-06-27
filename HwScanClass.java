package homeworkprogram;
import java.util.Scanner;
public class HwScanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner hw = new Scanner(System.in);
System.out.println("Enter the Name");
String name = hw.nextLine();
System.out.println(name);

System.out.println("Enter the age ");
int age = hw.nextInt();
System.out.println(age);

System.out.println("Enter the percentage acuired in 10th ");
double per = hw.nextDouble();
System.out.println(per);
	}

}
