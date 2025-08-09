package myfirstpackage;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 1234;
int rev=0;
int dig;

while (num !=0)
{
	dig = num%10;
	System.out.println("Digit "+dig);
	rev = rev*10+dig;
	num = num/10;
	System.out.println("temp "+rev);
}
System.out.println("Reverse "+rev);
	}

}
