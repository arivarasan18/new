package Task1;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("1");
        a = sc.nextInt();
        System.out.println("105");
        b = sc.nextInt();
        System.out.println("100");
        c = sc.nextInt();
        if(a < b && a < c)
        {
            System.out.println("The smallest number is:"+a);
        }
        else if(b < c)
        {
            System.out.println("The smallest number is:"+b);
        }
        else
        {
            System.out.println(" The smallest number is:"+c);
        }
	}

}
