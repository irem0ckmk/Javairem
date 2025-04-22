public class Karakter {
    private String silah;
    private String dusman;


    public Karakter(String silah,String dusman) {
        this.silah = silah;
        this.dusman = dusman;
    }

    public String getDusman() {
        return dusman;
    }

    public void setDusman(String dusman) {
        this.dusman = dusman;
    }

    public String getSilah() {
        return silah;
    }

    public void setSilah(String silah) {
        this.silah = silah;
    }

    public void saldir(){

            System.out.println("Karakter saldırıyor!");
        }


}
