import java.util.Scanner;
class TeamNames
{
    static Scanner sc=new Scanner(System.in);
    String teamNames[];
    int N;
    TeamNames(int N)
    {
        this.N=N;
        teamNames=new String[N];
    }
    void input()
    {
        for(int i=0;i<=N-1;i++)
        {
            System.out.print("Team "+(i+1)+": ");
            teamNames[i]=sc.nextLine();
        }
    }
    String largestName()
    {
        String largest=teamNames[0];
        for(int i=1;i<=N-1;i++)
        {
            String teamName=teamNames[i];
            if(teamName.length()>largest.length())
            {
                largest=teamNames[i];
            }
        }
        return largest;
    }
    void addSpaces()
    {
        String largest=largestName();
        //System.out.println(largest);
        for(int i=0;i<=N-1;i++)
        {
            String teamName=teamNames[i];
            int spaces=largest.length()-teamName.length();
            //System.out.println(spaces);
            for(int j=1;j<=spaces;j++)
            {
                teamName+=' ';
                teamNames[i]=teamName;
            }
        }
    }
    void displayVertically()
    {
        addSpaces();
        String largest=largestName();
        for(int i=0;i<=largest.length()-1;i++)
        {
            for(String teamName:teamNames)
            {
                System.out.print(teamName.charAt(i)+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        System.out.print("N = ");
        int n=sc.nextInt();
        sc.nextLine();
        if(2<n && n<9)
        {
            TeamNames obj=new TeamNames(n);
            obj.input();
            obj.displayVertically();
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }//End of main()
}//End of class