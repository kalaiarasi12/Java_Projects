package homeworkprogram;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =333;
		int dig;
		int temp = 0;
		while(num!=0)
		{
		dig = num%10;
		temp = temp+dig;
		num = num/10;
		}
		System.out.println(temp);
		}
	}

