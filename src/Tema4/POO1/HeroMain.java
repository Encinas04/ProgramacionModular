package Tema4.POO1;
public class HeroMain {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Arthur", 1, 100, 100, 0, 15, 10);
        Hero hero2 = new Hero("Lancelot", 1, 80, 100, 0, 12, 8);

        System.out.println(hero1);
        System.out.println(hero2);

        // Hero1 ataca a Hero2

        System.out.println("\nDespués de un ataque:");
        System.out.println(hero1);
        System.out.println(hero2);

        // Hero2 bebe poción
        hero2.drinkPotion();
        System.out.println("\nDespués de beber poción:");
        System.out.println(hero2);

        // Hero1 descansa
        hero1.rest();
        System.out.println("\nDespués de descansar:");
        System.out.println(hero1);

        // Hero1 ataca nuevamente
        System.out.println("\nDespués de un segundo ataque:");
        System.out.println(hero1);
        System.out.println(hero2);
    }
}
