public class Savasci extends Karakter{
    public Savasci(String silah, String dusman) {
        super(silah, dusman);
    }

    public void saldir(String dusman){
        System.out.println("Savaşçı "+getSilah()+" ile "+dusman +"'a saldırıyor!");
    }

    @Override
    public void saldir(){
        System.out.println("Savaşçı saldırıyor!");
    }
}
