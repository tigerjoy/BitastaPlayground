import java.util.Scanner;
class StudentArray
{
  static Scanner sc=new Scanner(System.in);
  void input(int roll[],String name[],double mark1[],
            double mark2[],double mark3[],double mark4[],
            double mark5[],double mark6[])
  {
    for(int i=0;i<=roll.length-1;i++)
    {
      System.out.print("Enter roll of student "+(i+1)+": ");
      roll[i]=sc.nextInt();
      sc.nextLine();
      System.out.print("Enter name of student "+(i+1)+": ");
      name[i]=sc.nextLine();
      System.out.print("Enter subject 1 marks of student "+(i+1)+": ");
      mark1[i]=sc.nextDouble();
      System.out.print("Enter subject 2 marks of student "+(i+1)+": ");
      mark2[i]=sc.nextDouble();
      System.out.print("Enter subject 3 marks of student "+(i+1)+": ");
      mark3[i]=sc.nextDouble();
      System.out.print("Enter subject 4 marks of student "+(i+1)+": ");
      mark4[i]=sc.nextDouble();
      System.out.print("Enter subject 5 marks of student "+(i+1)+": ");
      mark5[i]=sc.nextDouble();
      System.out.print("Enter subject 6 marks of student "+(i+1)+": ");
      mark6[i]=sc.nextDouble();
    }
  }
  double[] calcPercentage(double mark1[],
            double mark2[],double mark3[],double mark4[],
            double mark5[],double mark6[])
  {
    double percentage[]=new double[mark1.length];
    for(int i=0;i<=mark1.length-1;i++)
    {
      percentage[i]=(mark1[i]+mark2[i]+mark3[i]+mark4[i]+mark5[i]+mark6[i])/6;
    }
    return percentage;
  }
  char[] calcGrade(double percentage[])
  {
    char grade[]=new char[percentage.length];
    for(int i=0;i<=percentage.length-1;i++)
    {
      if(percentage[i]<=100 && percentage[i]>=80)
      {
        grade[i]='A';
      }
      else if(percentage[i]<=79 && percentage[i]>=60)
      {
        grade[i]='B';
      }
      else if(percentage[i]<=59 && percentage[i]>=40)
      {
        grade[i]='C';
      }
      else
      {
        grade[i]='D';
      }
    }
    return grade;
  }
  void display(int roll[],String name[],double percentage[],char grade[])
  {
    System.out.println("Roll no.\t\t Name\t\t Percentage\t\t Grade");
    for(int i=0;i<=roll.length-1;i++)
    {
      System.out.println(roll[i]+"\t\t"+name[i]+"\t\t"+percentage[i]+"\t\t"+
                         grade[i]);
    }
  }
  public static void main(String args[])
  {
    StudentArray obj=new StudentArray();
    int roll[]=new int[3];
    String name[]=new String[3];
    double mark1[]=new double[3];
    double mark2[]=new double[3];
    double mark3[]=new double[3];
    double mark4[]=new double[3];
    double mark5[]=new double[3];
    double mark6[]=new double[3];
    obj.input(roll,name,mark1,mark2,mark3,mark4,mark5,mark6);
    double percentage[]=
      obj.calcPercentage(mark1,mark2,mark3,mark4,mark5,mark6) ;
    char grade[]=obj.calcGrade(percentage);
    obj.display(roll,name,percentage,grade);
  }// End of main()
}//End of class