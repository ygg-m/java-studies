package loops;

public class Ex9_CrescimentoPais {
    public static void main(String[] args) {
        int populacaoPaisA = 80000;
        int populacaoPaisB = 200000;
        double crescimentPaisA = 1.03;
        double crescimentoPaisB = 1.015;
        int count = 0;

        while (populacaoPaisA < populacaoPaisB) {
            count++;
            populacaoPaisA *= crescimentPaisA;
            populacaoPaisB *= crescimentoPaisB;
        }

            System.out.println("População Final País A: " + populacaoPaisA);
            System.out.println("População Final País B: " + populacaoPaisB);
            System.out.println("Anos: " + count);
    }
}
