public class TestShirt {
    

    static String code(){ return "Lets code!!";}

    static String sleep(){ return "Lets sleep!!";}

    static String task(){ return "Lets task!!"; }


    static void tshirtPrint(){
    boolean _free = true;
    boolean _mood = false;
        System.out.println(_free ? (_mood ? code() : sleep()) : task() );

    }
    public static void main(String[] arg){
        tshirtPrint();
    }
}
