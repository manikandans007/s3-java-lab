import java.io.*;
import java.util.*;


 class Node
{
 int data;
 Node next;
 Node prev;
 Node()
 { 
  next = null;
  prev = null;
 }
 Node(int dat)
 { 
  data=dat;
  next=null;
  prev=null;
  }
 
}

class Dll
{
  
  Node head=null;
  Node tail=null;
  
 void AddNodeEnd(int d)
 {
  Node n = new Node(d);
  if(head == null)
  {
   head = n;
   tail = n;
   head.prev=null;
   tail.next=null;
   
  }
  else 
  {
   tail.next=n;
   n.prev=tail;
   tail = n;
   tail.next=null;
   
   }  
 }
 
 void AddNodeFir(int d)
 {
  Node n = new Node(d);
  if(head == null)
  {
   head = n;
   tail = n;
   head.prev=null;
   tail.next=null;
   
  }
  else
  { 
   head.prev = n;
   n.next = head;
   head = n;
   head.prev = null;
  
  }
 }
 
 void AddNodeAp(int pos, int d)
 {
 Node n = new Node(d);
  if(head == null)
  {
   head = n;
   tail = n;
   head.prev=null;
   tail.next=null;
   
  }
  
  else
  {
   Node cu = head;
   Node temp; 
   while(cu.data != pos)
   cu = cu.next;
   
   temp = cu.next;
   cu.next = n;
   n.prev = cu;
   cu = n;
   cu.next = temp;
   temp.prev = cu;
   } 
  }
 
 
 void DelNodeEnd()
 { 
  
 if(tail == null)
 System.out.println("Empty list");
 
 else
 {
 tail=tail.prev;
 tail.next=null;
 }
 
 }
 
 void DelNodePos(int pos)
 {
  
  if(head ==null&& tail==null)
  System.out.println("Empty List");
  
  else
  {
   Node cu = head;
   Node temp; 
   while(cu.next!=null)
   {
   cu = cu.next;
   
   if(cu.data==pos)
   {
   temp = cu.next;
   cu=cu.prev;
   cu.next=temp;
   }
   else if(cu.next==null && cu.data!=pos)
   System.out.println("Node not found");
  }
 }
}
 
 void Display()
 {
  Node curr = head;
  if(head==null)
  {
  System.out.println("List is empty");
  return;
  }
  while(curr !=null)
  {
   System.out.print(curr.data + "\n");
   curr=curr.next;
  }
 }
  
  public static void main(String arg[])
  {
   char o;
   int d,p;
   Dll list = new Dll();
   
   Scanner s = new Scanner(System.in);
   
   System.out.println("Options");
   System.out.println("1.Enter at end") ;  
   System.out.println("2.Enter at begining") ;  
   System.out.println("3.Enter at any postion") ;  
   System.out.println("4.Delete Node") ;
   System.out.println("5.Display") ;
   System.out.println("6.Exit") ;
   
   
  
   do
   {
   System.out.println("Enter choice") ;  
   o = s.next().charAt(0);

    if(o=='1'||o=='2'||o=='3')
    {
     System.out.println("Enter node to add");
     d = s.nextInt();
     if(o=='1')
     list.AddNodeEnd(d);
     else if(o=='2')
     list.AddNodeFir(d);
     else
     {
      System.out.println("Enter node after which node to be added");
      p = s.nextInt();
      list.AddNodeAp(p,d);
     }
    }
    else if(o=='4')
    {
    System.out.println("Enter node to be deleted;");
    p = s.nextInt();
    list.DelNodePos(p);
    }
    else if(o=='5')
    list.Display();
    else
    {
    System.out.println("Thank You");
    System.exit(0);
    }
  }while(o!='6');
 }
}





