import java.util.*;
class emp{
  private int id ;
  private String name;
  private String dept;
  private double salary ;
    public emp(){
      id = 0 ;
      name = null;
      dept = null ;
      salary =0.0 ;
    }
      public emp(int eid , String ename , String edept , float esalary){
        id = eid ;
        name = ename; 
        dept = edept;
        salary= esalary;
      }
        public void acceptE()
        {
          Scanner s =new Scanner(System.in);
          System.out.println("enter id:");
          id = s.nextInt();
          System.out.println("enter name:");
          name = s.next();
          System.out.println("enter dept:");
          dept = s.next();
          System.out.println("enter salary:");
          salary = s.nextDouble();
        }
        public void displayE(){
          System.out.println("Emp id:"+id);
          System.out.println("Emp name:"+name);
          System.out.println("Emp dept:"+dept);
          System.out.println("Emp salary:"+salary);
        }
  public double salary()
  {
    return salary ;
  }      
}
class Manager extends emp
{
  private double bonus ;
  public void acceptM()
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter bonus");
    bonus = s.nextDouble();
  }
  public void displayM()
  {
    System.out.println("Manager bonus:"+bonus);
  }
  public static int max (Manager m[], int n)
  {
    double max = 0 ;
    int t = 0 ;
    for(int i = 0;i<n;i++)
    {
      if(max<(m[i].salary()+m[i].bonus))
      {
        max = m[i].salary()+m[i].bonus;
        t=i;
      }
    }
    System.out.println("\nMax salary:"+max);
    return t ;
  }
} 
class Employee 
{
  public static void main(String args[])
  {
    int n,i,ans ;
    Scanner s = new Scanner(System.in);
    System.out.println("\n Enter how many records .\n");
    n = s.nextInt();
    Manager m[] = new Manager[n];
    for(i=0;i<n;i++)
    {
      m[i]=new Manager();
      m[i].acceptE();
      m[i].displayE();
      m[i].acceptM();
      m[i].displayM();
    }
    ans = Manager.max(m,n);
    m[ans].displayE();
    m[ans].displayM();
  }
}


