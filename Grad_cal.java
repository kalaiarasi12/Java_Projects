package homeworkprogram;

public class Grad_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mat = 90;
int eng =80;
int sci = 90;
int avg = (mat+eng+sci)/3;
System.out.println("Average "+avg);
if (mat< 35 || eng <35 || sci <35)
{
	System.out.println("Failed due to low score in at least one subject");
	}
else if (avg<=100 && avg>=90)
{
	System.out.println("Grade : A+ ");
	System.out.println("Excellent performance");
}
else if (avg<=89 && avg>=75)
{
	System.out.println("Grade : A ");
	System.out.println("Excellent performance");
}
else if(avg<=45) {
	System.out.println("Please work harder next time");
}
else {
	System.out.println("KEEP IMPROVING");
}
	}
}

