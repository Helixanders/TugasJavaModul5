package modul5_kel40_java;

public class Komik {
    static void Fantasy(){
        System.out.println("1. Goblin Slayer (2,2)");
        System.out.println("2. Seven Deadly Sins (0,2)");
        System.out.println("3. Overlord (1,0)");
    }
    static void Action(){
        System.out.println("1. Attack on Titan (0,0)");
        System.out.println("2. The Black Butler (3,1)");
        System.out.println("3. Beserk (3,2)");
    }
    static void Comedy(){
        System.out.println("1. Prison School (2,1)");
        System.out.println("2. Part Timer Demon Lord (1,1)");
        System.out.println("3. Assassination Classroom (0,1)");
    }
    static void Romance(){
        System.out.println("1. Scum's Wish (1,2)");
        System.out.println("2. Domestic Girlfriends (3,0)");
        System.out.println("3. Love & Lies (2,0)");
    }
    
    public void popular(String komik){
        System.out.println(komik);
    }    

}
