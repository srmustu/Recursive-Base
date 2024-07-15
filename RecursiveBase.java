import java.util.Scanner;
public class RecursiveBase {
    static int base(int a , int b){
        int calculator =1;

        if (b == 0){
            return 1;
        }
        for (int i = 1; i <= b; i++){
            calculator *= a;
        }
        return a * base(a , b -1);
    }

    public static void main(String[] args) {
        Scanner entr = new Scanner(System.in);
        String m1,m2,m3;
        int base,ceiling;

        m1 = "Please enter a base : ";
        m2 = "Please enter a ceiling : ";
        m3 = "Result : ";

        System.out.print(m1);
        base = entr.nextInt();
        System.out.print(m2);
        ceiling = entr.nextInt();

        System.out.print(m3 + base(base,ceiling));
    }
}
