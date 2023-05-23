import java.util.*;
public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> arli = new ArrayList<String>();
        arli.add("1");
        arli.add("2");
        arli.add("3");
        arli.add("4");
        arli.add("5");
        //arli.remove(1);
        //arli.set(3, 10);
        arli.set(3, "10");
        System.out.println(arli);
    }
}