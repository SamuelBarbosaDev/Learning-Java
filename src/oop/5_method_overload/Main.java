public class Main {
    public static void main(String[] args){
        Authentication authentication = new Authentication();
        authentication.login("email@email.com", "123");
        authentication.login("+55 (00)9999-9999");
    }
}

class Authentication{
    void login(String email, String password){
        System.out.println("Autenticação por e-mail e senha.");
    }
    void login(String phone){
        System.out.println("Autenticação por telefone.");
    }
}