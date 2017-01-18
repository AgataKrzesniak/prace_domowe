import java.util.Arrays;
public class petla{
    public static void main(String[] args){
        if(args.length !=0 || args.length <=512){
        int[] array = new int[args.length];
        for(int i = 0; i < args.length; i++){
            array[i]=Integer.parseInt(args[i]);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));}
        else
        System.out.println("Podaj liczbe od 0 do 512");
}
}