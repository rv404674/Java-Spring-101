package timbachulka.innerAbstractClassesInterfaces.inteface.basics;

public class DeskPhone implements ITelephone{
    private int phoneNumber;
    private boolean isRinging;

    public DeskPhone(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        // deskphone is alwasys on
        System.out.println("Deskphone's power is always one");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing" + phoneNumber);
    }

    @Override
    public void answer() {
        if(this.isRinging){
            System.out.println("Now answering");
            isRinging = false;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
