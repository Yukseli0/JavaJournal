import java.util.ArrayList;

public class animal {
    @SuppressWarnings("unused")
    private int yas;
    @SuppressWarnings("unused")
    private String isim;
    
    public void sesCikar(){
        System.out.println("bu hayvan ses cikariyor!");
    }
    public void hareketEt(){
        System.out.println("bu hayvan hareket ediyor!");
    }
    public animal(){

    }
    public animal(int yas, String isim){
        this.yas=yas;
        this.isim=isim;
    }
    public static void main(String[] args) {
        ArrayList<animal> hayvanlar = new ArrayList<animal>();
        hayvanlar.add(new cat(3,"pamuk"));
        hayvanlar.add(new dog(5,"karabas"));
        hayvanlar.add(new bird(1,"husnu"));
        for(animal hayvan:hayvanlar){
            hayvan.sesCikar();
            hayvan.hareketEt();
            if(hayvan instanceof cat){
                ((cat)hayvan).oyuncakOyna();
            }
            if(hayvan instanceof dog){
                ((dog)hayvan).topOyna();
            }
        }
        
    }
}
