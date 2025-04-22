public class Circle extends Shape{
    private int raius;

    public int getRaius() {
        return raius;
    }

    public void setRaius(int raius) {
        this.raius = raius;
    }
    @Override
    public double Area(){
        return Math.PI *  raius * raius;
    }
    @Override
    public double perimeter(){
        return  Math.PI * 2 * raius;
    }
    @Override
    public  void ciz(){
        System.out.println("Circle");
    }
}
