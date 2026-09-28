import java.util.Scanner;

public class olamundo{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número :");
        int num = leitor.nextInt();
        if (num % 2 == 0){
        System.out.println("O número " + num + " é par");
        }
        else{
            System.out.println("O número " + num + " é impar");
        }


    }
}