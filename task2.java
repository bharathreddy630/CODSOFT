import java.util.*;
class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        System.out.println("Enter marks obtained in each subject:");
        int sub = n;
        int total = 0;
        while(n-->0){
            int marks = sc.nextInt();
            total+=marks;
        }
        System.out.println("Total marks :"+total);
        int p = total/sub;
        System.out.println("Average Percentage: "+p);
        System.out.println("Grade: "+(
            p>=90 ? "A" :
            p>=85 ? "B+" :
            p>=80 ? "B" :
            p>=75 ? "C+" :
            p>=70 ? "C" :
            p>=65 ? "D+" :
            p>=60 ? "D" :
            p>=0 ? "F" :
            "Invalid"
        ) );
        
    }
}