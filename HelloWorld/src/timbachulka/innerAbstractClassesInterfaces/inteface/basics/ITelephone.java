package timbachulka.innerAbstractClassesInterfaces.inteface.basics;

/**
 * Interface is just a contract, that the method and variables implemented in the interface will not change, in the
 * classes that implement it.
 * public void powerOn(), public is redundant because if you see, it is the classes that actually implement the methods.
 * So, class will mention public or private.
 * NOTE:
 * Interface has a I in front of it. Denoting an interface.
 */
public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    boolean isRinging();
}
