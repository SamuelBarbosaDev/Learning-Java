public class Main{
    public static void main(String[] args){
        Game game = new Game("Agiota Express", 69.69);
        game.describe();
    }
}

class Game{
    String name;
    double price;

    // Constructor
    Game(String name, double price){
        this.name = name;
        this.price = price;
    }

    void describe(){
        System.out.println("Nome: " + this.name + "\nPreço: " + price);
    }
}
