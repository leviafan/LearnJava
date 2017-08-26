import java.util.LinkedList;

public class Processor {
    public Processor(){};
    private static int UselessCounter = 0;
    public static void DoH(){
        // H prints hello world
        System.out.println("Hello, world!");
    }
    public static void DoQ(String source){
        //Q prints quine - original code of executed program. Gets all sourcecode as single string with \n between lines
        System.out.println(source);
    }
    public static void Do9(){
        //9 prints text of the song "99 bottles of beer on the wall".
        for (int beer=99;beer>0;beer--){
            System.out.println(beer + " bottles of beer on the wall");
            System.out.println(beer + " bottles of beer!");
            System.out.println("Take one down, pass it around");
            if (beer == 1) {
                System.out.println("None bottles of beer on the wall!");
            } else {
                System.out.println((beer-1) + " bottles of beer on the wall!\n");
            }
        }
    }
    public static void DoPlus(){
        UselessCounter = UselessCounter+1;
    }
    public static int DebugUselessCounter(){
        return UselessCounter;
    }
}


