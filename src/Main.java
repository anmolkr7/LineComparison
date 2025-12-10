import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program on Master Branch");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x1, y1:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();

        System.out.println("Enter x2, y2:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        //Creating Point objects
        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);

        //Creating Line object
        Line line=new Line(p1,p2);

        //Calculating and displaying length
        double length=line.getLength();
        System.out.println("Length of the Line is: "+length);
    }
}