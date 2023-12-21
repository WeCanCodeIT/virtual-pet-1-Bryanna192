import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VirtualPet pet = new VirtualPet("cat", "Mika", 50, 50, 100);
        boolean game = true;
        while(game){
            System.out.println("Hello, welcome to your virtual pet. Here you can feed, hydrate, or play with your pet. Type 1 to feed. Type 2 to hydrate. Type 3 to play. Type 4 to quit the game.");
            int num = Integer.parseInt(scan.nextLine());
            switch (num) {
                case 1: pet.feed();
                    System.out.println("Hunger Level: " + pet.getHunger() + " out of 50");
                    break;
                case 2: pet.drink();
                    System.out.println("Thirst Level: " + pet.getThirst() + " out of 50");
                    
                    break;
                case 3: pet.play();
                    System.out.println("Boredom Level: " + pet.getBoredom() + " out of 100");
                    
                    break;
                case 4: game = false;
                    System.out.println("See you later!");
                    break;
                default: System.out.println("Invalid action");
                    break;
            }
            pet.tick();
        }
    }
}
