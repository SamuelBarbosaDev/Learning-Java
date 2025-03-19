class Main{
    public static void main(String[] args){
        Dog dog = new Dog(0.6, "white", 22);
        Bird bird = new Bird(0.2, "purple", 5);

        dog.run();
        bird.run();
    }
}

class Animal{
    double size;
    String color;
    double weight;

    Animal(
        double size,
        String color,
        double weight
    ){
        this.size = size;
        this.color = color;
        this.weight = weight;
    }

    void run(){
        System.out.println("Correndo...");
    }

    void sleep(){
        System.out.println("Dormindo...");
    }
}

class Dog extends Animal{
    Dog(
        double size,
        String color,
        double weight
    ){
        super(size, color, weight);
    }

    @Override
    void run(){
        super.run();
        System.out.println("Como um cachorro.");
    }
}

class Bird extends Animal{
    Bird(
        double size,
        String color,
        double weight
    ){
        super(size, color, weight);
    }

    @Override
    void run(){
        super.run();
        System.out.println("Como um pássaro.");
    }
}