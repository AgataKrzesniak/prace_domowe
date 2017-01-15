public class Cezar{
    public static void main(String [] args){
     
    if(args.length==2){    
    String s = args[0].toUpperCase( );
    char ch = s.charAt(0);
 
    String jawny=args[1];
       
    for(int i=0;i<jawny.length();i++)
         System.out.print((char)(jawny.charAt(i)+(ch-64)));
    
    } else  System.out.print("Błąd ilości danych");
    }
}
