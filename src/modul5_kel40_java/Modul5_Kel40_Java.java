package modul5_kel40_java;
import java.util.Scanner;
import static modul5_kel40_java.Komik.Action;
import static modul5_kel40_java.Komik.Comedy;
import static modul5_kel40_java.Komik.Fantasy;
import static modul5_kel40_java.Komik.Romance;
import static modul5_kel40_java.Inputer.Komik;
public class Modul5_Kel40_Java {

    private static Object objek;

    static void one(){
        Komik book = new Komik();
            book.popular("01. Attack on Titan (0,0)");
            book.popular("02. Assassination Classroom (0,1)");
            book.popular("03. Seven Deadly Sins (0,2)");
            book.popular("04. Overlord (1,0)");
            book.popular("05. Part Timer Demon Lord (1,1)");
            book.popular("06. Scum's Wish (1,2)");
            book.popular("07. Love & Lies (2,0)");
            book.popular("08. Prison School (2,1)");
            book.popular("09. Goblin Slayer (2,2)");
            book.popular("10. Domestic Girlfriend (3,0)");
            book.popular("11. The Black Butler (3,1)");
            book.popular("12. Beserk (3,2)");
    }
    
    public static void main(String[] args) {
        Komik KomikObject = new Komik();
        Inputer InputerObject = new Inputer();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program promo pembelian 1 paket komik jepang dengan bahasa Java dibuat oleh:");
        System.out.println("________________________________________________________________");
        System.out.println("|Shift 3, Kelompok 40                     |");
        System.out.println("|-Muhammad Sunan Alit     - 21120117130080|");
        System.out.println("|-Muhammad Hanif Atthariq - 21120117140028|");
        System.out.println("|_________________________________________|");
                
        System.out.println("Pilih kategori komik yang anda ingin pinjam:");
        System.out.println("1. Berdasarkan Popularitas");
        System.out.println("2. Berdasarkan Genre");
        System.out.print("Pilihan (1/2): ");
        int p = sc.nextInt();
        
        if ( p==1 ){
            one();            
        }
        else if ( p==2 ){
            System.out.println("Pilih Genre yang anda inginkan");
            System.out.println("1. Romance");
            System.out.println("2. Comedy");
            System.out.println("3. Action");
            System.out.println("4. Fantasy");
            System.out.print("Pilihan (1/2/3/4): ");
            
            int q = sc.nextInt();
            
            while ( 6>q ){
                while ( 5>q ){
                    while ( 4>q ){
                        while ( 3>q ){
                            while ( 2>q ){
                                Romance();
                                System.out.println("Apakah anda mau melihat genre lain?");
                                System.out.print("Genre (1/2/3/4)(5 untuk langsung membungkus komik): "); 
                                int r = sc.nextInt();
                                q = r;
                            }
                        Comedy();
                        System.out.println("Apakah anda mau melihat genre lain?");
                        System.out.print("Genre (1/2/3/4)(5 untuk langsung membungkus komik): ");
                        int r = sc.nextInt();
                        q = r;
                        }
                    Action();
                    System.out.println("Apakah anda mau melihat genre lain?");
                    System.out.print("Genre (1/2/3/4)(5 untuk langsung membungkus komik): ");
                    int r = sc.nextInt();
                    q = r;
                    }
                Fantasy();
                System.out.println("Apakah anda mau melihat genre lain?");
                System.out.print("Genre (1/2/3/4)(5 untuk langsung membungkus komik): ");
                int r = sc.nextInt();
                q = r;
                }
            break;
            }            
        }
        Komik();      
    }
    
}
