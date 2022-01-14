package Monster;

public class Main {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        Monster m2 = new Monster();

        System.out.println(m1.getHealth());
        System.out.println(m2.getHealth());

        m1.meleeAttack(m2);
        System.out.println(m1.getHealth());
        System.out.println(m2.getHealth());

        MonsterA m3 = new MonsterA();
        MonsterB m4 = new MonsterB();
    }
}
