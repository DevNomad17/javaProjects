public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int xB, int yB) {
        return Math.sqrt((xB-x) * (xB - x) + (yB-y) * (yB-y));
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(Point c) {
        return distance(c.getX(),c.getY());
    }
}
