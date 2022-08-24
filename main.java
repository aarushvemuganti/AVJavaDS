import java.math.*;
import java.util.*;
public class main {
    static privateClass pClass;
    public static void main(String args[]){
        pClass = new privateClass();
        System.out.println(pClass.getHN());

        while (true){
            makeGuess();
        }
    }
    
    public static boolean makeGuess(){
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        return pClass.guessHN(guess);
    }
}
