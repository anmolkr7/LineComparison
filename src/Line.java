import java.util.Objects;

public class Line implements Comparable<Line> {
    private Point p1;
    private Point p2;

    //Constructor to initialize line with 2 points
    public Line(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }

    //Length of a Line = sqrt((x2 - x1)^2 + (y2 - y1)^2)
    public double getLength(){
        return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2) + Math.pow(p2.getY()-p1.getY(),2)
        );
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Line other = (Line) obj;
        return (this.p1.getX()==other.p1.getX() &&
                this.p1.getY()==other.p1.getY() &&
                this.p2.getX()==other.p2.getX() &&
                this.p2.getY()==other.p2.getY());
    }

    @Override
    public int compareTo(Line other){
        return Double.compare(this.getLength(), other.getLength());
    }
}