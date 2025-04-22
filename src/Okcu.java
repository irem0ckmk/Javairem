public class Okcu extends Karakter{
    public Okcu(String silah, String dusman) {
        super(silah, dusman);
    }

    public void saldir(String dusman){
        System.out.println("Okçu "+getSilah()+" ile "+dusman +"'a saldırıyor!");
    }


    @Override
    public void saldir() {
        System.out.println("Okçu saldırıyor!");
    }
}
