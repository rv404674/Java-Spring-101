package timbachulka.innerAbstractClassesInterfaces.inteface.basics;

public class MobilePhone implements ITelephone{
    private int phoneNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobile Phone is now on");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber);
        }else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(this.isRinging){
            System.out.println("Now answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

