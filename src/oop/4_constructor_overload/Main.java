public class Main {
    public static void main(String[] args){
        Authentication login = new Authentication("email@email.com", "123");
        Authentication loginPhone = new Authentication("+55 (00)9999-9999");
    }
}

class Authentication{
    Authentication(String email, String password){
        System.out.println("Autenticado com Email & Senha.");
    }

    Authentication(String phone){
        System.out.println("Autenticado com Telefone.");
    }
}
