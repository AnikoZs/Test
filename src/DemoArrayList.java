import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList{
    public static void main(String[] args) {
//It is using the Hero class
        Hero hero1 = new Hero("Hero 1", 100);
        Hero hero2 = new Hero("Hero 2", 200);
        Hero hero3 = new Hero("Hero 3", 300);

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);


        // heroes.add(new Hero("Hero 1", 100));
        //heroes.add(new Hero("Hero 2", 200));
        //heroes.add(new Hero("Hero 3", 300));

        for (Hero hero : heroes) {
            System.out.println(hero);
        }

        System.out.println(heroes.size());

        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i).toString());
            System.out.println(" ");
        }

        //Remove with Scanner
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name of the hero: ");
       String name = sc.nextLine();

//Remove with Scanner
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).getName().equals(name)) {
                System.out.println("This hero will be removed:" + heroes.get(i).toString());
                System.out.println(" ");
                heroes.remove(i);
            }
        }

        // Modify a parameter in the list
        heroes.get(0).powerLevel= 2000;


    }
}
