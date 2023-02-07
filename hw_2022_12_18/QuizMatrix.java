// Scored - 5 points
import java.util.Scanner;
class QuizMatrix
{
     int N;
     String mat[][];
     String key[];
     int scores[];
     static Scanner sc=new Scanner(System.in);
     QuizMatrix(int N)
     {
         this.N=N;
         mat=new String[N][5];
         key=new String[5];
         scores=new int[5];
     }
     boolean inputAnswers()
     {
         for(int i=0;i<=N-1;i++)
         {
             System.out.print("Participant "+(i+1)+" ");
             for(int j=0;j<=4;j++)
             {
                 mat[i][j]=sc.next().toUpperCase();
                 if("ABCD".indexOf(mat[i][j])==-1)
                 {
                     return false;
                 }
             }
         }
         return true;
     }
     void inputKey()
     {
         System.out.print("Key: ");
         for(int i=0;i<=4;i++)
         {
             key[i]=sc.next();
         }
     }
     void checkAnswers()
     {
         int index=0;
         for(int i=0;i<=N-1;i++)
         {
             int count=0;
             for(int j=0;j<=4;j++)
             {
                 if(mat[i][j].equals(key[j]))
                 {
                     count++;
                 }
             }
             scores[index]=count;
             index++;
         }
     }
     void displayHighestScorers(int arr[])
     {
         int largestScore=arr[0];
         for(int i=1;i<=arr.length-1;i++)
         {
             if(arr[i]>largestScore)
             {
                 largestScore=arr[i];
             }  
         }  
         if(largestScore>0)
         {
             int count=0;
             for(int i=0;i<=arr.length-1;i++)
             {
                 if(arr[i]==largestScore)
                 {
                     count++;
                     if(count==1)
                     {
                         System.out.println("Highest Score: Participant "+(i+1));
                     }
                     else
                     {
                         System.out.println("               Participant "+(i+1));
                     }
                 } 
             }
         }
         else
         {
             System.out.println("NO PARTICIPANT ANSWERED CORRECTLY");
         }
     } 
     void display()
     {
         System.out.println("Scores: ");
         for(int i=0;i<=scores.length-1;i++)
         {
             System.out.println("Participant "+(i+1)+"= "+scores[i]);
         }
         displayHighestScorers(scores);
     }
     public static void main(String args[])
     {
         System.out.print("N = ");
         int n=sc.nextInt();
         if(n>3 && n<11)
         {
             QuizMatrix obj=new QuizMatrix(n);
             if(obj.inputAnswers())
             {
                 obj.inputKey();
                 obj.checkAnswers();
                 obj.display();
             }
             else
             {
                 System.out.println("ONE OF THE ENTERED ANSWERS IS NOT BETWEEN A and D.");
             }
         }
         else
         {
             System.out.println("INPUT SIZE OUT OF RANGE.");
         }
     }//End of main
}//End of class