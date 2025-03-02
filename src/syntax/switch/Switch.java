public class Switch {
    public static void main(String[] args){
        String paymentMethod = "bitcoin";

        switch(paymentMethod){
            case "dinheiro":
                System.out.println("Pagamento em dinheiro");
                break;
            case "débito":
                System.out.println("Pagamento no débito");
                break;
            case "crédito":
                System.out.println("Pagamento no crédito");
                break;
            case "bitcoin":
                System.out.println("Pagamento em bitcoin");
                break;
            default:
                System.out.println("Nenhum método de pagamento selecionando.");
        }
    }    
}
