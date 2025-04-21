public class Cylinder {
    public double radius;
    public double height;

    public double totalSurfaceArea(){
        return Math.PI * 2 * radius * radius + Math.PI * 2 * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
    public double lidArea(){
        return Math.PI * 2 * radius * height;
    }
}
