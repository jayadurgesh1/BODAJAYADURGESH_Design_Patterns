package com.epam_task;
import java.util.Scanner;
class App
{
	Scanner s=new Scanner(System.in);
	Object[] ar=new Object[100000000];
	int[] a=new int[1];
	int index=0;
	App()
	{
		ar[0]=11;ar[1]=332;ar[2]=223;ar[3]=33;ar[4]=34;ar[5]=634;ar[6]=4375;ar[7]=74;ar[8]=24;ar[9]=657;
	}
	void add(Object m)
	{
		ar[index++]=m;
	}
	void remove(Object m)
	{
		for(int i=0;i<=index;i++)
		{
			if (ar[i]==m)
			{
				int j=i;
				while(j<index)
				{
					ar[j]=a[j+1];
					j++;
				}
				index--;
			}
			else
			{
				System.out.println("object not found");
			}
		}
	}
	void fetch(int m)
	{
		if (m<index)
		{
			System.out.println(ar[m]);
		}
		else
		{
			int l=a[99];
		}
	}
	void display()
	{
		if (index>10)
		{
			for(int i=0;i<index;i++)
			{
				System.out.print(ar[i]);
			}
		}
		else
		{
			for(int i=0;i<10;i++)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
	public static void main(String args[])
	{
		App k=new App();
		Scanner s=new Scanner(System.in);
		int p=0;
		while (p==0)
		{
			System.out.println("1.add\n2.remove\n3.fetch\n4.display\nselect option");
			int j=s.nextInt();
			switch(j)
			{
				case 1:
						System.out.println("enter element");
						k.add(s.next());
						break;
				case 2:
						System.out.println("enter element");
						k.remove(s.next());
						break;
				case 3:
						System.out.println("enter index");
						k.fetch(s.nextInt());
						break;
				case 4:
						k.display();
						break;
				default:
						p++;
						break;
			}
		}
	}
}
