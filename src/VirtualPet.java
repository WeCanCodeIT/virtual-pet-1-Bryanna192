public class VirtualPet{
    private String species;
    private String name; 
    private int hunger;
    private int thirst;
    private int boredom;
    public VirtualPet(String species, String name, int hunger, int thirst, int boredom) {
        this.species = species;
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public int getBoredom() {
        return boredom;
    }
    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public void setThirst(int thirst) {
        this.thirst = thirst;
    } 

    //Feed
    public void feed(){
        hunger-= 10;
    }
    public void drink(){
        thirst-= 10;
    }
    public void play(){
        boredom-= 15;
    }
    public void tick(){
        hunger+= 3;
        thirst+= 2;
        boredom+= 5;
    }
        }

    
