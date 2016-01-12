package com.company;

import java.lang.*;
import java.util.Scanner;

public class calculate
{
	public static void main(String[] arg)

	{
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String exit = "no";
		try
		{
			while(!exit.equals("yes"))
			{
				System.out.println("Enter first arg : ");
				String first=scan.next();
				System.out.println("Enter sec arg : ");
				String sec =scan.next();
				int fir=Integer.valueOf(first);
				int se=Integer.valueOf(sec);

				calc.add(fir,se);


				System.out.println(calc.get());

				System.out.println("Exit yes/no");
				exit=scan.next();

			}

		}
		finally {
			scan.close();
		}

	}
}
