package Monster;

public class Monster {
    private int health = 100;
    private int attackSpeed = 10;
    private int attackDamage = 10;

    public void meleeAttack(Monster x){
        x.health -= 10;
    }

    public void rangedAttack(Monster x){
        x.health -= 15;
    }
    public int getHealth(){
        return health;
    }
    public int getattackSpeed(){
        return attackSpeed;
    }
    public int getattackDamage(){
        return attackDamage;
    }
}
