package Monster;

public class Monster {
    /*
    This class creates a generic monster.
    Attributes: Health, attackSpeed, attackDamage.
    Methods: MeleeAttack, rangedAttack, getHealth, setHealth, getAttackSpeed, getAttackDamage


     */
    private int health;
    private int attackSpeed;
    private int attackDamage;

    //Constructor 1, 3 args
    public Monster(int health,int attackSpeed, int attackDamage){
        this.health = health;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
    }

    //Constructor 2, no args (attributes automatically defined to default)
    public Monster(){
        this.health = 100;
        this.attackSpeed = 10;
        this.attackDamage = 15;
    }

    public void meleeAttack(Monster x){
        x.health -= 10;
    }

    public void rangedAttack(Monster x){
        x.health -= 15;
    }
    public int  getHealth(){
        return health;
    }

    public int  getAttackSpeed(){
        return attackSpeed;
    }
    public int  getAttackDamage(){
        return attackDamage;
    }
    public void setHealth(int x){health = x;}
    public void setAttackSpeed(int x){
        attackSpeed = x;
    }
    public void setAttackDamage(int x){
        attackDamage = x;
    }
}
