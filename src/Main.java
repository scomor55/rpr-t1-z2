
import java.util.Scanner;

public class Main {

    static int sumaCifara(int broj){
        int suma = 0;
        while(broj > 0){
            suma += broj%10;
            broj /= 10;
        }
        return suma;
    }


    public static void main(String[] args) {

        int broj;

        Scanner in = new Scanner(System.in);
        broj = in.nextInt();

        for(int i = 1; i < broj ; i++){
            int br = sumaCifara(i);
            if(i % br == 0)System.out.println(i);
        }

    }
}