package timbachulka.innerAbstractClassesInterfaces.inteface.InterfaceChallenge;

import java.util.List;

/**
 * NOTE: I am using list here. The reason is so that in future, you can use arraylist, linkedinlist etc.
 */

public interface ISaveable {
    // allows object to be save to some sort of medium
     List<String> save();

     // populate object's field from arraylist
    void populate(List<String> savedValues);
}
