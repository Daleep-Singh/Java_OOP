package Monster;

public class MonsterA extends Monster {
    /*
    This is a monster with offensive abilities.
    Abilities (Methods): strong Attack: lowers health of opponent by 50pts
                         slow: slows attack speed of opponent by 25 points
                         lightingBolt : electrifies an oppponent (can only use every 3 moves).
     */

    private int lightningBoltCoolDown = 0;
    public MonsterA(){
        super();

    }
    public void strongAttack(Monster m){
        //lowers health of opponent by 50pts
        m.setHealth(m.getHealth() - 50);
        lightningBoltUpdate();

    }
    public void slow(Monster m){
        //slows attack speed of opponent by 25 points
        m.setAttackSpeed(m.getAttackSpeed() - 25);
        lightningBoltUpdate();
    }
    public void lightningBolt(Monster m) {
        //electrifies an oppponent (can only use every 3 moves).
        if (lightningBoltUpdate() == 3){
            m.setHealth(m.getHealth() - 45);
        }
    }
    private int lightningBoltUpdate() {
        //Handles correctly updating lightningBoltCooldown
        if (lightningBoltCoolDown < 3){
            lightningBoltCoolDown++;
        }
        else if (lightningBoltCoolDown == 3){
            lightningBoltCoolDown = 0; //reset it
        }
        return lightningBoltCoolDown;
    }
}