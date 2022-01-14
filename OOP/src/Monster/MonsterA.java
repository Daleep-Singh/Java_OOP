package Monster;

public class MonsterA extends Monster {

    //sub class still needs a constructor to inherit from the superclass
    public MonsterA(){
        super();

    }
    public void superAbility(Monster m){
        m.setHealth(m.getHealth() - 50);
    }

}