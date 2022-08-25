import java.util.*;
public class main {
    static privateClass pClass;
    public static void main(String args[]){
        pClass = new privateClass();
        System.out.println("Guess a number");
        System.out.println(pClass.getHN());
        boolean win = false;
        
        while (!win){
            win = makeGuess();
        }
    }
    
    public static boolean makeGuess(){
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        boolean win = pClass.guessHN(guess);
        return win;
    }
}
