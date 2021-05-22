package timbachulka.innerAbstractClassesInterfaces.inteface.basics;

public class Main {
    public static void main(String[] args){
        ITelephone rahulTelephone;
        // or this is also valid
        rahulTelephone = new DeskPhone(12234565);
        rahulTelephone.powerOn();
        rahulTelephone.dial(12234565);
        rahulTelephone.answer();

//        MobilePhone mobilePhone = new MobilePhone(701841736);
//        mobilePhone.powerOn();
//        mobilePhone.dial(70789);
//        mobilePhone.answer();
        rahulTelephone = new MobilePhone(7018);
        rahulTelephone.powerOn();


    }


}
