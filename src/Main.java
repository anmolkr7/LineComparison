import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program on Master Branch");

        Scanner sc=new Scanner(System.in);

        //Input for Line1
        System.out.println("Enter x1, y1 for Line 1:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();

        System.out.println("Enter x2, y2 for Line 1:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        //Creating Point and Line Objects for Line 1
        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);
        Line line1=new Line(p1,p2);

        //Input for Line 2
        System.out.println("Enter x1, y1 for Line 2:");
        int a1=sc.nextInt();
        int b1=sc.nextInt();

        System.out.println("Enter x2, y2 for Line 2:");
        int a2=sc.nextInt();
        int b2=sc.nextInt();

        //Creating Point and Line Objects for Line 2
        Point q1=new Point(a1,b1);
        Point q2=new Point(a2,b2);
        Line line2=new Line(q1,q2);


        //Calculating and displaying length of both lines
        double length1=line1.getLength();
        System.out.println("Length of the Line 1 is: "+length1);

        double length2=line2.getLength();
        System.out.println("Length of the Line 1 is: "+length2);

        // Using equals() to check equality of two lines
        if(line1.equals(line2)){
            System.out.println("Both lines are EQUAL.");
        } else {
            System.out.println("Both lines are NOT EQUAL.");
        }
    }
}