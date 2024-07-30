import java.io.Console;
class Stugrade
{  
String sname;
int sub1,sub2,sub3; 
double average;  
char grade; 
Stugrade(String name, int s1,int s2, int s3)
  {
    sname = name;     
    sub1=s1;   
    sub2=s2;  
    sub3=s3; 
    } 
    void dispDetails()
      { 
      System.out.println("Students Details.............."); 
      System.out.println("Name: "+sname); 
      System.out.println("Subject1: "+sub1); 
      System.out.println("Subject2: "+sub2); 
      System.out.println("Subject3: "+sub3); 
      System.out.println("Average: "+average); 
      System.out.println("Grade: "+grade); 
        } 
      void calcAverage() 
        { 
        average=(sub1+sub2+sub3)/3.0; 
        } 
      void calcGrade() 
        { 
        if(average >=70)      
        grade='A';    
        else if (average >=60) 
        grade='B';   
        else grade='C'; 
        } 
      public static void main(String args[]) {  
      Console console = System.console(); 
      System.out.print("Enter Student name: "); 
      String name = console.readLine(); 
            System.out.print("Enter Marks in Subject1: ");  
                  int s1 = Integer.parseInt(console.readLine());   
                      System.out.print("Enter Marks in Subject2: ");  
                          int s2 = Integer.parseInt(console.readLine());   
                              System.out.print("Enter Marks in Subject3: ");   
                                  int s3 = Integer.parseInt(console.readLine());  
                                          if (s1<35||s2<35||s3<35) 
            System.out.println("Student is failed "); 
          else 
              {    
      Stugrade std = new Stugrade(name,s1,s2,s3); 
            std.calcAverage();      
              std.calcGrade(); 
      std.dispDetails(); 
            } 
    } 
} 

