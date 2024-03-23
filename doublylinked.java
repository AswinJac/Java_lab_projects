import java.util.Scanner;

class node{
    int data;
    node left;
    node right;
}
class doublylinked
{
    static node head;
    static void insert(Scanner sc)
    {
        int num;
        System.out.println("Enter an element to insert");
        num=sc.nextInt();
        node newnode=new node();
        newnode.data=num;
        if(head==null)
        {
            head=newnode;
        }
        else{
            node ptr=head;
            while(ptr.right!=null)
            {
                ptr=ptr.right;
            }
            ptr.right=newnode;
            newnode.left=ptr;
             }
             }
    static void display()
    {
        if(head==null)
        System.out.println("Empty");
        else{
            node ptr=head;
            while(ptr!=null)
            {
                System.out.print(ptr.data+"-><-");
                ptr=ptr.right;
            }
        }
    }
    static void delete(Scanner sc)
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {
            int num;
        System.out.println("Enter an element to delete");
        num=sc.nextInt();
            node ptr=head;
            while(ptr.data!=num&&ptr.right!=null)
            {
                ptr=ptr.right;
            }
            if(ptr.right==null)
            {
                System.out.println("Not in the list");
            }
            if(ptr.data==num)
            {
                if(ptr==head)
                head=head.right;
                if(ptr.right!=null)
                ptr.right.left=ptr.left;
                if(ptr.left!=null)
                ptr.left.right=ptr.right;
            }}}
    public static void main(String[] args) {
        int ch;
        Scanner sc=new Scanner(System.in);
        while(true)
        {System.out.println("MENU DRIVEN\n1:InsertElement\n2:DeleteElement\n3:DisplayElement\n4:Exit");
            System.out.println("Enter a choice");
            ch=sc.nextInt();
            if(ch==1)
            {
                insert(sc);
                display();
            }
            else if(ch==2)
            {
                delete(sc);
                display();
            }
            else if(ch==3)
            display();
            else
            System.exit(0);
        }
    }
}   