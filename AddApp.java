import java.util.Scanner;
public class AddApp {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter two numbers:");
		float a=sc.nextFloat(),b=sc.nextFloat();
		float c=a+b;
		System.out.println("Sum is "+c);
		
		
		
		
//		byte f=sc.nextByte();
//		short s=sc.nextShort();
//		int i=sc.nextInt();
//		long l=sc.nextLong();
//		float ff=sc.nextFloat();
//		double d=sc.nextDouble();
//		boolean bb=sc.nextBoolean();
//		String ss=sc.next();
//		String ss1=sc.nextLine();
//		char cc=sc.next().charAt(0);
		
        sc.close();
        
	}
}