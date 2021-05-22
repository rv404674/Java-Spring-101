package timbachulka.innerAbstractClassesInterfaces.inteface.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable{
    private String name;
    private int strength;
    private int hitPoints;
    private String weapon;

    public Players(String name, int strength, int hitPoints) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
        this.weapon = "Sword";
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.strength);
        values.add(2, "" + this.hitPoints);
        values.add(3, "" + this.weapon);

        return values;
    }

    @Override
    public void populate(List<String> savedValues) {
        if (savedValues != null & savedValues.size() >1){
            this.name = savedValues.get(0);
            this.strength = Integer.parseInt(savedValues.get(1));
            this.hitPoints = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hitPoints=" + hitPoints +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
