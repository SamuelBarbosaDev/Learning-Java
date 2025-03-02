public class Arrays {
    public static void main(String[] args){
        String[] names = {"Zé da moeda", "Urubu do bitcoin", "Calango Azul"};
        int[] ages = {21, 27, 19, 18};
        String[][] peoples = {
            {"Zé da moeda", "joga a moeda"},
            {"Urubu do bitcoin", "vende bitcoin"},
            {"Calango azul", "exército privado"},
        };

        // Names
        System.out.println("Array names: " + names[0]);
        // Peoples
        System.out.println("Array peoples: " + peoples[0][1]);
    }
}
