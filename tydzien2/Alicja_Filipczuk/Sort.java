public class Sort{
    
      public static void main (String [] args){
        if(args.length>0 && args.length<=512)
            {
              int T[]=new int[args.length];
              
               for(int i=0;i<args.length;i++) 
                    T[i]=Integer.parseInt(args[i]);
              
             
              mSort(T);
              
              for(int x :T) System.out.print(x+" ");
                
              
            }
        else System.out.println("Błąd ilości danych !!!!");
    } 
    //--------------------------------------------------------
    public static void mSort(int [] tab){
        if(tab.length>1){
        int n=tab.length/2;
        int [] lewa=new int[n];
        for(int i=0;i<n;i++) lewa[i]=tab[i];
        
        int m= tab.length-n;
        int [] prawa=new int[m];
        for(int i=0;i<m;i++) prawa[i]=tab[n+i];
        
       /* for(int y: lewa) System.out.print(y+",");
        System.out.println(" ---- ");
        for(int z: prawa) System.out.print(z+",");*/
       
       mSort(lewa); mSort(prawa);
       
       mmSort(tab,lewa,prawa);
        }
    }
    
    //----------
    public static void mmSort(int [] W, int[] L, int[] P)
    {
        int il=0,ip=0;
        
        for(int i=0;i<W.length;i++){
            if((ip>=P.length) || (il<L.length && L[il]<=P[ip] ))
                    {W[i]=L[il]; il++;}
            else    {W[i]=P[ip]; ip++;}
            
        }
    }

    }
    
    
    
    
    
    
