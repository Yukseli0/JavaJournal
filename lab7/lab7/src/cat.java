public class cat extends animal{
    public cat(){
        super();
    }
    public cat(int yas,String isim){
        super(yas, isim);
    }
    @Override
    public void sesCikar(){
        System.out.println("Miyav!");
    }
    public void oyuncakOyna(){
        System.out.println("kedi oyuncak oynuyor!");
    }
}
