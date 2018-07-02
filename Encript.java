import java.util.ArrayList;

public class Encript {
    private static void decript(String word){
        String mainArray[]=word.split("");
        String alpt[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        ArrayList<String> alphabhat=new ArrayList<>();
        for (String string : alpt) {
            alphabhat.add(string);
        }
        
        String decri="";
        
        for (String string : mainArray) {
            int index=alphabhat.indexOf(string);
            int newIndex = 25-index;
            decri+=alphabhat.get(newIndex);
        }
        
        System.out.println(decri);
    }
    public static void main(String[] args) {
        String encripted="";
        for (String arg : args) {
            encripted+=arg;
        }
        decript(encripted);
        /*decript("YIFHHVOH");
        decript("ZNHGVIWZN");
        decript("UIZMPUFIG");
        decript("SVZGSILD");
        decript("AFIRXS");*/
    }
}