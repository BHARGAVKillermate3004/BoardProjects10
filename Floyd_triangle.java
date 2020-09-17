import java.util.Scanner;
 class Floyd_triangle
{
    int n;
    Floyd_triangle()//constructor
    {
        n=0;
    }
    void input()//for inputof number of rows using Scanner class
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in the Floyd triangle:");
        n=sc.nextInt();//inserting user typed value of number of rows
    }
    void generate_pattern()//for generating the floyd triangle
    {
        int a=1;//for printing the numbers
        for(int i=1;i<=n;i++)//for number of rows
        {
            for(int j=1;j<=i;j++)//for number of values being printed in a row
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Floyd_triangle obj=new Floyd_triangle();
        obj.input();
        obj.generate_pattern();
    }
}//1.	Write a program in Java to print Floyd’s right angled triangle using the natural numbers.
      1
      2 3
      4 5 6
      7 8 9 10

    
