package loops;
import java.util.Scanner;

// Faça um programa que leia e valide as seguintes informações:
// Nome: maior que 3 caracteres;
// Idade: entre 0 e 150;
// Salário: maior que zero;
// Sexo: 'f' ou 'm';
// Estado Civil: 's', 'c', 'v', 'd';

public class Ex8_ValidateInfos {

    public static void checkName(String name) {
        Scanner scan = new Scanner(System.in);

        while (name.length() < 3) {
            System.out.println("Name should have more than 3 characters. ");
            name = scan.next();
        }
    }

    public static void checkAge(int age) {
        Scanner scan = new Scanner(System.in);

        while (age < 0 || age > 150) {
            System.out.println("Age should be between 0 and 150. ");
            age = scan.nextInt();
        }
    }

    public static void checkSalary(int salary) {
        Scanner scan = new Scanner(System.in);

        while (salary <= 0) {
            System.out.println("Salary should be more than 0. ");
            salary = scan.nextInt();
        }
    }

    public static void checkSex(String sex) {
        Scanner scan = new Scanner(System.in);

        switch(sex) {
            case "f":
              break;
            case "F":
              break;
            case "m":
            break;
            case "M":
              break;
            default:
                System.out.println("Sex should be F or M. ");
                sex = scan.next();
          }
    }

    public static void checkCivilStatus(String civilStatus) {
        Scanner scan = new Scanner(System.in);

        switch(civilStatus) {
            case "S":
                break;
            case "C":
                break;
            case "V":
                break;
            case "D":
                break;
            case "s":
                break;
            case "c":
                break;
            case "v":
                break;
            case "d":
                break;
            default:
                System.out.println("Civil Status should be S, C, V or D.");
                civilStatus = scan.next();
          }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        int salary;
        String sex;
        String civilStatus;

        

        // asks for the name
        System.out.println("Name: ");
        name = scan.next();
        checkName(name);

        // asks for the age
        System.out.println("Age: ");
        age = scan.nextInt();
        checkAge(age);

        // asks for the salary
        System.out.println("Salary: ");
        salary = scan.nextInt();
        checkSalary(salary);
        

        // asks for the sex
        System.out.println("Sex: ");
        sex = scan.next();
        checkSex(sex);
        

        // asks for the Civil Status
        System.out.println("Civil Status: ");
        civilStatus = scan.next();
        checkCivilStatus(civilStatus);


        // print out everything
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Sex: " + sex);
        System.out.println("Civil Status: " + civilStatus);


    }

    
}