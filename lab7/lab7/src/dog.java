public class dog extends animal{
    public dog(){
        super();
    }
    public dog(int yas,String isim){
        super(yas, isim);
    }
    @Override
    public void sesCikar(){
        System.out.println("Hav hav!");
    }
    public void topOyna(){
        System.out.println("köpek top oynuyor!");
    }

    

}
