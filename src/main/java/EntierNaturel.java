public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if(val<0) throw new NombreNegatifException("Nombre negatif Exception",val);
        else this.val = val;
    }

    public EntierNaturel() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if(val<0) throw new NombreNegatifException("Nombre negatif Exception",val);
        this.val = val;
    }

    public void decrementer() throws NombreNegatifException {

        if(val<=0) throw new NombreNegatifException("Nombre negatif exception",--val);
        else val--;
    }
}
