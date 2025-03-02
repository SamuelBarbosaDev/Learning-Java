public class Types {
    public static void main(String[] args){
        // Tipos Primitivos
        // Números entre -128 e 127
        byte age = 69;

        // Números entre -32.768 e 32.767
        short numberOfVacancies = 29000;

        // Números entre -2.147.483.648 to 2.147.483.647
        int money = 1900600300;

        // Números entre -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807
        long stars = 700000000;

        // Número com até 7 casas decimais
        float revolverPrice = 299.99f;

        // Números com até 15 casas decimais
        double PI = 3.14159265358979323846;

        // Armazena valores verdadeiro ou falso
        boolean destroyTheState = true;

        // Armazena 1 carácter
        char garden = 'M';

        // Classes Wrapper
        /*
            Em Java, as classes wrapper são usadas para encapsular 
            tipos de dados primitivos em objetos. Isso permite que 
            os tipos primitivos sejam usados como objetos quando necessário, 
            como em coleções que só aceitam objetos.
        */
        String name = "Zé da moeda";
        Integer power = 99999999;
        double PIClassesWrapper = 3.14159265358979323846; 
    }
}
