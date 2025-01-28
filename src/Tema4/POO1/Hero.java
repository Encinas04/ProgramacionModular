package Tema4.POO1;

public class Hero {
    String name="";
    int level=0;
    int health=0;
    int maxHealth=0;
    int experience=0;
    int attack=0;
    int defense=0;

    public Hero(String name,int level,int health, int maxHealth,int experience,int attack,int defense){
        this.name=name;
        this.level=level;
        this.health=health;
        this.maxHealth=maxHealth;
        this.experience=experience;
        this.attack=attack;
        this.defense=defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void drinkPotion(){
        this.health+=10;
    }
    public void rest(){
        this.health+=50;
    }
    public String toString(){
        return "Hero{name='" + name + "', level=" + level + ", health=" + health + "/" + maxHealth +
                ", experience=" + experience + ", attack=" + attack + ", defense=" + defense + "}";
    }

    public void attack(Hero target){
        int damage = Math.max(this.attack - target.defense, 10);
        target.health = Math.max(target.health - damage, 0);
        this.experience+=10;

        if (this.experience>=50){
            levelUp();
            this.experience-=50;
        }
    }
    public void levelUp() {
        level++;
        maxHealth += 5;
        attack += 1;
        defense += 1;
    }


}
