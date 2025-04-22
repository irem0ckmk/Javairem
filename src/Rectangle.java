public class Rectangle extends  Shape{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public  double Area(){
        return length * breadth;
    }
    @Override
    public double perimeter(){
        return 2 * (length+breadth);
    }
    @Override
    public void ciz() {
        System.out.println("Rectangle çizildi.");
    }

}
