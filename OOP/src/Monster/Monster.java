package Monster;

public class Monster {
    private int health;
    private int attackSpeed;
    private int attackDamage;

    //Constructer 1, 3 args
    public Monster(int health,int attackSpeed, int attackDamage){
        this.health = health;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
    }
    //Constructure 2, no args
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
    public int  getattackSpeed(){
        return attackSpeed;
    }
    public int  getattackDamage(){
        return attackDamage;
    }
}
