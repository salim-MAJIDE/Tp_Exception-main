public class NombreNegatifException extends Exception{
   private int v;
    public NombreNegatifException() {
        super();
    }

    public int getV() {
        return v;
    }

    public NombreNegatifException(String message, int v) {
        super(message);
        this.v=v;
    }

    public NombreNegatifException(String message, Throwable cause) {
        super(message, cause);

    }
}
