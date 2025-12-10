public class Line {
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
}