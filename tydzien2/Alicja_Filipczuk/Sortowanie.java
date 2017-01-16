public class Sortowanie{
    public static void main(String[] args){
        int[] T=new int[args.length];
        
        int pom;
        for(int i=0;i<args.length;i++)
            T[i]=Integer.parseInt(args[i]);
        
        int s=args.length/2;
        System.out.println(s);
        
           for(int j=0;j<args.length;j++)      
                for(int i=1;i<args.length-1;i++)   
                    if(T[i-1]>T[i]) {pom=T[i-1]; T[i-1]=T[i]; T[i]=pom;}
         
       
         for(int x: T)
           System.out.println(x);    
    }
}
