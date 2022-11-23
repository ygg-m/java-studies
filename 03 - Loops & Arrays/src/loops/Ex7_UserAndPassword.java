package loops;
import java.util.Scanner;

// Faça um programa que leia um nome
// de usuário e a sua senha e não aceite
// a senha igual ao nome do usuário, mostrando
// uma mensagem de erro e voltando a pedir as informações.

public class Ex7_UserAndPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String user;
        String password;

        System.out.println("User: ");
        user = scan.next();

        System.out.println("Password: ");
        password = scan.next();

        while (user.equals(password)) {
            System.out.println("Password can't be the same as User!");
            System.out.println("Please type a new password: ");
            password = scan.next();
        }

        System.out.println("-----------------------");
        System.out.println("Welcome " + user + "!");
        System.out.println("Your Password: " + password);
        System.out.println("-----------------------");



    }
}
