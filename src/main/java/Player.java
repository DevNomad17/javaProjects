import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player implements ISaveable{

//    It has four fields. Two Strings called name and weapon. Two ints called hitPoints and strength.
//
//            -  A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name, hitPoints and strength with the newly passed in values. It initialises weapon with the default weapon "Sword".
//
//            -  And eleven methods:
//
//            -  Getters and setters for all four fields.
//
//        -  write(), same as interface. Return a List of the fields in the order they appear in toString().
//
//            -  read(), same as interface. Store the values in the List, in the order they appear in toString(). Make sure the List is not null and the size() is greater than 0 before storing the values.
//
//            -  toString(), Players overriding toString() method. It takes no arguments and returns a String in the following format:
//
//    Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public String toString() {
        return "Player{name='" + getName() + "', hitPoints=" + getHitPoints() + ", strength="+ getStrength() +", weapon='"+ getWeapon() +"'}";
    }

    @Override
    public List<String> write() {
        List<String> lst = new ArrayList<String>();

        String tmp = this.toString().substring(this.toString().lastIndexOf('{')+1,this.toString().lastIndexOf('}'));
        tmp = tmp.replaceAll(" ","");
        lst.addAll(Arrays.asList(tmp.split(",")));
//        System.out.println(lst);
        return lst;
    }

    @Override
    public void read(List<String> lst) {

    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
