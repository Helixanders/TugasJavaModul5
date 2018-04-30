package modul5_kel40_java;
import java.util.Scanner;

public class Inputer {

    static void Komik(){
        Scanner sc = new Scanner(System.in);
        String aa, bb , cc, dd, ee, ff, gg, hh, ii;
        int x, y, z;
        
        String[][] data_manga = new String[][]{
            {"Attack on Titan","Assassination Classroom","Seven Deadly Sins"},
            {"Overlord","Part Timer Demon Lord","Scum's Wish"},
            {"Love & Lies","Prison School","Goblin Slayer"},
            {"Domestic Girlfriend","The Black Butler","Beserk"}
        };
        
        System.out.println("Promo 1 paket komik hanya dapat memilih 9 komik");
        System.out.println("Tulis 9 kode komik yang anda ingin beli:");
        System.out.println("(kode di depan judul)");
        
        System.out.println("Komik 1:");
            System.out.print("-> Kode 1: ");
            int a1 = sc.nextInt();
            System.out.print("-> Kode 2: ");    
            int b1 = sc.nextInt();
            aa = data_manga[a1][b1];
        System.out.println("Komik 2:");
            System.out.print("-> Kode 1: ");
            int a2 = sc.nextInt();
            System.out.print("-> Kode 2: "); 
            int b2 = sc.nextInt();
            bb = data_manga[a2][b2];
        System.out.println("Komik 3:");
            System.out.print("-> Kode 1: ");
            int a3 = sc.nextInt();
            System.out.print("-> Kode 2: "); 
            int b3 = sc.nextInt();
            cc = data_manga[a3][b3];
        System.out.println("Komik 4:");
            System.out.print("-> Kode 1: ");
            int a4 = sc.nextInt();
            System.out.print("-> Kode 2: "); 
            int b4 = sc.nextInt();
            dd = data_manga[a4][b4];
        System.out.println("Komik 5:");
            System.out.print("-> Kode 1: ");
            int a5 = sc.nextInt();
            System.out.print("-> Kode 2: "); 
            int b5 = sc.nextInt();
            ee = data_manga[a5][b5];
        System.out.println("Komik 6:");
            System.out.print("-> Kode 1: ");
            int a6 = sc.nextInt();
            System.out.print("-> Kode 2: "); 
            int b6 = sc.nextInt();
            ff = data_manga[a6][b6];
        System.out.println("Komik 7:");
            System.out.print("-> Kode 1: ");
            int a7 = sc.nextInt();
            System.out.print("-> Kode 2: "); 
            int b7 = sc.nextInt();
            gg = data_manga[a7][b7];
        System.out.println("Komik 8:");
            System.out.print("-> Kode 1: ");
            int a8 = sc.nextInt();
            System.out.print("-> Kode 2: "); 
            int b8 = sc.nextInt();
            hh = data_manga[a8][b8];
        System.out.println("Komik 9:");
            System.out.print("-> Kode 1: ");
            int a9 = sc.nextInt();
            System.out.print("-> Kode 2: "); 
            int b9 = sc.nextInt();
            ii = data_manga[a9][b9];
        
        System.out.println("Maka, komik yang akan anda beli adalah:");
        String [][] paket = {
            { aa+",", bb+",", cc },
            { dd+",", ee+",", ff },
            { gg+",", hh+",", ii }
        };
        
        for ( x=0; x<=2; x++){
            for ( y=0; y<=2; y++){
                System.out.print(paket[x][y]+" ");
            }
        System.out.println(" ");    
        }
    }
}
