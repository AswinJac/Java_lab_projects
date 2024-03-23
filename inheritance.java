import java.util.Scanner;
class Employee {
    String name,address;
    int age,ph;
    double salary;
    void printsalary()
    {
        System.out.println("Salary="+salary);
    }
    void data()
    {
        System.out.println("Name="+name);
        System.out.println("Address="+address);
        System.out.println("Age"+age);
        System.out.println("PhoneNumber="+ph);
    }
    }
    class Officer extends Employee
    {
        String spec;
        void special()
        {
            System.out.println("Specialisation="+spec);
        }
    }
    class Manager extends Employee
    {
        String depart;
        void dep()
        {
            System.out.println("Department="+depart);
        }
    }
class inheritance
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Officer Details");
        System.out.println("Enter Name");
        Officer of=new Officer();
        of.name=sc.nextLine();
        System.out.println("Enter Address");
        of.address=sc.nextLine();
        System.out.println("Enter Age");
        of.age=sc.nextInt();
        System.out.println("Enter Phone Number");
        of.ph=sc.nextInt();
        System.out.println("Enter Salary");
        of.salary=sc.nextDouble();
        System.out.println("Enter Specialisation");
        of.spec=sc.nextLine();
        System.out.println("Enter Manager Details");
        System.out.println("Enter Name");
        Manager m=new Manager();
        m.name=sc.nextLine();
        System.out.println("Enter Address");
        m.address=sc.nextLine();
        System.out.println("Enter Age");
        m.age=sc.nextInt();
        System.out.println("Enter Phone Number");
        m.ph=sc.nextInt();
        System.out.println("Enter Salary");
        m.salary=sc.nextDouble();
        System.out.println("Enter Department");
        m.depart=sc.nextLine();
        System.out.println("___OFFICER___");
        of.data();
        of.printsalary();
        of.special();
        System.out.println("___MANAGER___");
        m.data();
        m.printsalary();
        m.dep();
        sc.close();
    }
}    
