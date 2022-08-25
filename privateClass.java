class privateClass{

    private int hidden_number;

    public privateClass(){
        int min = (int)(Math.random()*100);
        int max = (int)(Math.random()*10) + 10; 
        hidden_number = ((int)(Math.random() * max)) + min;
        System.out.println("Range: " + min + "->" + (max + min));
    }

    public int getHN(){
        return hidden_number;
    }

    static privateClass zClass;

    public boolean guessHN(int n){
        if(n==hidden_number){
            System.out.println("You got it! You win!");
            return true;
        }
        else{
            System.out.println("Wrong! Try again!");
            zClass = new privateClass();
            return false;
        }
    }
}