//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
        Employee e1 = new Manager("Ayşe", 10000, 2000);
        Employee e2 = new Intern("Mehmet", 3000, "Boğaziçi");
        Employee e3 = new Developer("Ali",150000,"Java,C,Python");
        Intern i = new Intern("Zeynep", 3000, "Boğaziçi");
        i.promote(1000); // ✅ çalışır


        System.out.println(e1); // ➝ Manager Ayşe earns 12000 (base: 10000, bonus: 2000)
        System.out.println(e2);
        System.out.println(e3);// ➝ Intern Mehmet earns 3000, studies at Boğaziçi
        System.out.println(i);

 */

        Rectangle s1 = new Rectangle();
        s1.length = 4;
        s1.breadth = 5;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
        Cylinder c1 = new Cylinder();
        c1.height = 12.0;
        c1.radius = 5.2;
        System.out.println("Area= "+c1.lidArea());
        System.out.println("Volume= "+c1.volume());
        System.out.println("Surface= "+c1.totalSurfaceArea());

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}