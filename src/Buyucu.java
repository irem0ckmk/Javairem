public class Buyucu extends Karakter{
    public Buyucu(String silah, String dusman) {
        super(silah, dusman);
    }

    public void saldir(String dusman){
        System.out.println("Büyücü "+getSilah()+" ile "+dusman +"'a saldırıyor!");
    }

    @Override
    public void saldir(){
        System.out.println("Büyücü saldırıyor!");
    }
}
