public class App {
    public static void main(String[] args)  {
        EntierNaturel en = null;
        try{
            en=new EntierNaturel(0);
            //en.setVal(-1);
           en.decrementer();
            System.out.println(en.getVal());
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage()+" value of the number with exception is: "+e.getV());

        }


    }
}
