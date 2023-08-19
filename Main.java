import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int vvod = 0;
        do{
        System.out.println("1.MONDAY");
        System.out.println("2.TUESDAY");
        System.out.println("3.WEDNESDAY");
        System.out.println("4.THURSDAY");
        System.out.println("5.FRIDAY");
        System.out.println("6.SATURDAY");
        System.out.println("7.SUNDAY");
        Scanner scanner=new Scanner(System.in);
        int vvodd=scanner.nextInt();

            switch (vvodd) {
                case 1:
                    Kyrgyzystan monday = Kyrgyzystan.MONDAY;
                    System.out.println(monday + ": " + monday.eee());
                    System.out.println();
                    break;
                case 2:
                    Kyrgyzystan tuesday = Kyrgyzystan.TUESDAY;
                    System.out.println(tuesday + ": " + tuesday.eee());
                    System.out.println();
                    break;
                case 3:
                    Kyrgyzystan wednesday = Kyrgyzystan.WEDNESDAY;
                    System.out.println(wednesday + ": " + wednesday.eee());
                    System.out.println();
                    break;
                case 4:
                    Kyrgyzystan thursday = Kyrgyzystan.THURSDAY;
                    System.out.println(thursday + ": " + thursday.eee());
                    System.out.println();
                    break;
                case 5:
                    Kyrgyzystan friday = Kyrgyzystan.FRIDAY;
                    System.out.println(friday + ": " + friday.eee());
                    System.out.println();
                    break;
                case 6:
                    Kyrgyzystan saturday = Kyrgyzystan.SATURDAY;
                    System.out.println(saturday + ": " + saturday.eee());
                    System.out.println();
                    break;
                case 7:
                    Kyrgyzystan sunday = Kyrgyzystan.SUNDAY;
                    System.out.println(sunday + ": " + sunday.eee());
                    System.out.println();
                    break;
            }



        } while (vvod!=8);


    }
}