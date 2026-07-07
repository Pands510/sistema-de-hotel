import java.util.Scanner;

public class Util {
    private static final Scanner sc = new Scanner(System.in);

    private static void linha(){
        System.out.println("==================");
    }

    public static String lerTexto(){
        return sc.nextLine();
    }

    public static int lerInteiro(){
        int inteiro = sc.nextInt();
        sc.nextLine();
        return inteiro;
    }

    public static double lerDouble(){
        double val = sc.nextDouble();
        sc.nextLine();
        return val;
    }

}
