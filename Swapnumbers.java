public class Swapnumbers{
       public static void main(String[] args){
               int a = 7;
               int b = 8;
               System.out.println("Before swapping:" + "a:" + a ); 
               System.out.println("Before swaping :"  + "b:" + b );
            
               a = a + b;
               b = a - b;
               a = a - b;
                 
               System.out.println("After swapping:" + "a:" + a );
               System.out.println("After swapping:" + "b:" + b);
        }
}