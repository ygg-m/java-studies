package loops;
import java.util.Scanner;

public class Ex10_CrescimentoPaisComInput {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int populacaoPaisA;
        int populacaoPaisB;
        double crescimentoPaisA;
        double crescimentoPaisB;
        int count = 0;

        while(true) {
            System.out.println("Inclua a população do País A");
            populacaoPaisA = scan.nextInt();
            if (populacaoPaisA <= 0) {
                System.out.println("População do País A precisa ser maior que 0.");
                populacaoPaisA = scan.nextInt();
            }
                
                
            System.out.println("Inclua a taxa de crescimento anual do País A");
            crescimentoPaisA = scan.nextInt();
            if (crescimentoPaisA <= 0) {
                System.out.println("Crescimento do País A precisa ser maior que 0.");
                crescimentoPaisA = scan.nextInt();
            }

            crescimentoPaisA = (crescimentoPaisA / 100) + 1;

            System.out.println("Inclua a população do País B");
            populacaoPaisB = scan.nextInt();
            if (populacaoPaisB <= 0) {
                System.out.println("População do País B precisa ser maior que 0.");
                crescimentoPaisA = scan.nextInt();
            }

            System.out.println("Inclua a taxa de crescimento anual do País B");
            crescimentoPaisB = scan.nextInt();
            if (crescimentoPaisB <= 0 && crescimentoPaisA <= crescimentoPaisB) {
                System.out.println("Crescimento do País B precisa ser maior que 0 e menor que o crescimento do país A.");
                crescimentoPaisA = scan.nextInt();
            }

            crescimentoPaisB = (crescimentoPaisB / 100) + 1;
        

            while (populacaoPaisA < populacaoPaisB) {
                count++;
                populacaoPaisA *= crescimentoPaisA;
                populacaoPaisB *= crescimentoPaisB;
            }

            System.out.println("População Final País A: " + populacaoPaisA);
            System.out.println("População Final País B: " + populacaoPaisB);
            System.out.println("Anos: " + count);
        }


    }
}
