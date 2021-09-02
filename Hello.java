import java.io.*;
import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int sum = 0;
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.print("The Sum: "+sum);
	}
}
