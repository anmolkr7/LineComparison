import java.util.Objects;

public class Line implements Comparable<Line> {
    Point p1;
    Point p2;

    //Constructor to initialize line with 2 points
    public Line(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }

    //Length of a Line = sqrt((x2 - x1)^2 + (y2 - y1)^2)
    public double getLength(){
        return Math.sqrt(Math.pow(p2.x-p1.x,2) + Math.pow(p2.y-p1.y,2));
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Line other=(Line)obj;
        return (this.p1.x==other.p1.x && this.p1.y==other.p1.y && this.p2.x==other.p2.x && this.p2.y==other.p2.y);
    }

    @Override
    public int compareTo(Line other){
        return Double.compare(this.getLength(), other.getLength());
    }
}