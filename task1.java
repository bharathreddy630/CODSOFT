import java.util.*;

class task1{
    static String guessNumber(int gen,int guess){
        if(gen==guess){
            return "Correct";
        }
        else if(gen>guess){
            return "too low";
        }
        return "too high";
    }
    static int NumberGame(Scanner sc,int limit,int count){
        boolean playAgain = true;
        while(playAgain){
            int attempts = limit;
            while(attempts-->0){
                Random rand = new Random();
                int genNum = rand.nextInt(1,101);
                System.out.print("Enter your guess: ");
                int guessNum = sc.nextInt();
                String res = guessNumber(genNum,guessNum);
                System.out.println(res);
                if(res.equals("Correct")) {
                    count++;
                    break;
                }
            }
            if(limit==0)
                System.out.println("Out of attempts!!!");
            System.out.println("Enter 1.Play Again, 2.Exit");
            int choice = sc.nextInt();
            if(choice!=1){
                playAgain = false;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limit = 10;
        int count=0;
        int res= NumberGame(sc,limit,count);
        System.out.println("You score is "+res);
    }
}