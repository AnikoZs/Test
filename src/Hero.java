public class Hero {
    private String name;
    private int age;
    int powerLevel;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Hero() {
        this.name = "Hero";
        this.age = 0;
        this.powerLevel = 0;
        this.strength = 0;
        this.dexterity = 0;
        this.intelligence = 0;
        this.wisdom = 0;
        this.charisma = 0;

    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name:"+ name + "\n age:" + age + "\n powerLevel:" + powerLevel + "\n strength:" + strength ;
    }
}

