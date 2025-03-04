class MartialArtist{
    long yearsQI = 0;
    
    double calculateDamage(String skillName, double baseDamage){
        System.out.println("==="+skillName+"===");
        double punch = baseDamage * yearsQI;
        return punch;
    }
}

class Main{
    public static void main(String[] args){
        MartialArtist guerreiro = new MartialArtist();
        guerreiro.yearsQI = 100;
        double punchDamage = guerreiro.calculateDamage("Tundra Negra", 10);
        System.out.println("Dano da habilidade: " + punchDamage);
    }
}