public class bird extends animal{
    public bird(){
        super();
    }
    public bird(int yas,String isim){
        super(yas, isim);
    }
    @Override
    public void sesCikar(){
        System.out.println("Cik cik!");
    }
    public void uc(){
        System.out.println("kuş uçuyor!");
    }
}
