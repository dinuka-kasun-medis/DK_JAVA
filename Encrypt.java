import java.util.ArrayList;

public class Encrypt {
    private static void decript(String word){
        String mainArray[]=word.split("");
        String alpt[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        String decri="";

        for (String string : mainArray) {
            for (int i=0;i<alpt.length ;i++ ) {
                if (string.equals(alpt[i])) {
                    int newIndex=25-i;
                    decri+=alpt[newIndex];
                }
            }
        }
        
       
        System.out.println(decri);
    }
    public static void main(String[] args) {
        String encripted="";
        for (String arg : args) {
            encripted+=arg;
        }
        /*decript(encripted);
        decript("YIFHHVOH");
        decript("ZNHGVIWZN");
        decript("UIZMPUFIG");
        decript("SVZGSILD");
        decript("AFIRXS");*/
    }
}