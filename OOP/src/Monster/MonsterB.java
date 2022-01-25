package Monster;

public class MonsterB extends Monster {
    //This is a monster with defensive abilities
    public MonsterB(){
        super();
    }
    public void superAbility(){
        //Raises the monsters own health
        this.setHealth(this.getHealth() + 50);
    }
}
