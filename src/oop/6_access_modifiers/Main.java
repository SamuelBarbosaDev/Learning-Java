/*
    Modificadores de acesso:

    public -> Todas as classes terão acesso.
    private -> Apenas pode ser acessado de dentro da classe
    protected -> Pode ser acessado dentro do mesmo pacote e/ou subclasse.
    default -> Caso não tenha sido definido nenhum modificador, 
    permitindo o acesso dentro do pacote e classe.
*/

public class Main {
    public static void main(String[] args){
    
    }    
}

class User{
    private String id;
    public String name;
    protected void performingAction(){
        System.out.println("Executando uma ação.");
    }
}
