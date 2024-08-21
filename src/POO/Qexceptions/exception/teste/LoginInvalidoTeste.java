package POO.Qexceptions.exception.teste;

import POO.Qexceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTeste {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void login() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usuarioBD = "Maykon";
        String senhaBD = "mk";
        System.out.println("Digite seu usuario: ");
        String usuarioDigitado = teclado.nextLine();
        System.out.println("Digite sua senha: ");
        String senhaDigitado = teclado.nextLine();
        if (!usuarioDigitado.equals(senhaDigitado) || !senhaDigitado.equals(usuarioBD)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Login efetuado com sucesso!");
        }
    }
}
