package myfirstpackage;

public class AssignOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =7;
// System.out.println("Assign and add "+(a+=2));
// System.out.println("Assign and Sub "+(a-=5));
// System.out.println("Assign and Multiply "+(a*=2));
// System.out.println(a);
int b = ++a;
int c = a++;
System.out.println("PreIncremental "+b);
System.out.println("Post incremental "+a);
	}

}
