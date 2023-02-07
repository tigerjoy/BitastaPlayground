import java.util.Scanner;
class ArrayOperations
{
  int arr[];
  int capacity;
  int size;
  ArrayOperations()
  {
    capacity=100;
    size=0;
    arr=new int[capacity];
  }
  ArrayOperations(int capacity)
  {
    this.capacity=capacity;
    size=0;
    arr=new int[capacity];
  }
  void insertAtPos(int pos, int item)
  {
    // Check if pos is valid
    if(pos>=0 && pos<=size)
    {
      // Check if array is full
      if (size==capacity)
      {
         System.out.println("Array is full");
      }
      else
      {
        //check if shifting is required
        if(pos>=0 && pos<=size-1)
        {
          for(int j=size-1;j>=pos;j--)
          {
            arr[j+1]=arr[j];
          }
        }
        // Insert item at pos
        arr[pos]=item;
        System.out.println(item + " inserted in the array");
        size++;
      }
    }
    else
    {
      System.out.println("Invalid value of pos");
    }
  }
  int deleteAtPos(int pos)
  {
    int item=-999;
    if(pos>=0 && pos<=size-1)
    {
      // Check if array is empty
      if (size==0) 
      {
        System.out.println("Array is empty");
      }
      else
      {
        // Store the element to be deleted
        item=arr[pos];
        // Check if shifting is necessary
        if(pos>=0 && pos<=size-1)
        {
          for(int j=pos+1;j<=size-1;j++)
          {
            arr[j-1]=arr[j];
          }
        }
        size--;
      }
    }
    else
    {
      System.out.println("Invalid value of pos");
    }
    return item;
  }
  void display()
  {
    if(size==0)
    {
      System.out.println("Array is empty");
    }
    else
    {
      for(int i=0;i<=size-1;i++)
      {
        System.out.print(arr[i]+", ");
      }
      System.out.println();
    }
  }
  void displayMenu()
  {
    System.out.println("--------MENU--------");
    System.out.println("Press 1 to insert an item in the array");        
    System.out.println("Press 2 to delete an item from the array");        
    System.out.println("Press 3 to display content of the array");        
    System.out.println("Press 4 to quit");
    System.out.print("Enter your choice(1-4): ");    
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the capacity of the array:");
    int capacity = sc.nextInt();
    ArrayOperations obj = new ArrayOperations(capacity);
    int choice;
    do
    {
      obj.displayMenu();
      choice = sc.nextInt();
      switch(choice)
      {
        case 1: {
          System.out.print("Enter an element to insert: ");
          int item = sc.nextInt();
          System.out.print("Enter the position: ");
          int pos = sc.nextInt();
          // Call the appropriate function
          obj.insertAtPos(pos, item);
          break;
        }
        case 2: {
          System.out.print("Enter the position of the element to be deleted: ");
          int pos = sc.nextInt();
          // Call the appropriate function
          int item = obj.deleteAtPos(pos);
          // Check if deletion was unsuccessful
          if(item == -999)
          {
            System.out.println("Could not delete from the array");
          }
          else
          {
            System.out.println(item + " deleted from the array");
          }
          break;
        }
        case 3: {
          System.out.println("The elements of the array are");
          // Call the appropriate method
          obj.display();
          break;
        }
        case 4: {
          System.out.println("Quiting...");
          break;
        }
        default: {
          System.out.println("Invalid choice");
        }
      }
    } while(choice != 4);
  }
}