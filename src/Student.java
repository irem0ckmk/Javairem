public class Student {
    public int rollnum;
    public String name;
    public String course;
    public  double m1;
    public  double m2;
    public  double m3;

    public double total(){
        return m1+m2+m3;
    }
    public double average(){
        return total()/3;
    }
    public  char grade(){
        if (average()>= 60)
            return 'A';
        else
            return 'B';
    }
    public String details(){
        return "Roll No: "+rollnum+"Name: "+name+"\n"+"Course: "+course+"\n";
    }


}
