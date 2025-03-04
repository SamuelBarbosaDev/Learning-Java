class Player{
    byte life;
    short speed;
    String power;

    void setSpeed(){
        speed += 10;
        System.out.println("Aumentando Velocidade para: " + speed);
    }

    void describe(){
        System.out.println("===");
        System.out.println("---Descrição do jogador---");
        System.out.println("Vidas: " + life);
        System.out.println("Velocidade: " + speed);
        System.out.println("Poder: " + power);
        System.out.println("===");
    }
}

public class Main{
    public static void main(String[] args){
        Player Apotheosis = new Player();
        Apotheosis.life = 5;
        Apotheosis.power = "Invulnerabilidade";
        Apotheosis.setSpeed();
        Apotheosis.setSpeed();
        Apotheosis.describe(); 
    }
}