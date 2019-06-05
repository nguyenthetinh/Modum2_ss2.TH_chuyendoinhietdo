import java.util.Scanner;
public class chuyendo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double c,f;
        int so;
        do {
            System.out.println("Menu");
            System.out.println("1. do C sang do F ");
            System.out.println("2. do F sang do C ");
            System.out.println("0. Exit");
            System.out.println("Enter yuor so: ");
            so=scanner.nextInt();
            switch (so){
                case 1:
                    System.out.println("Nhap do C :");
                    c=scanner.nextDouble();
                    System.out.println("do F = "+ CsangF(c));
                    break;
                case 2:
                    System.out.println("Nhap do F :");
                    f=scanner.nextDouble();
                    System.out.println("do F = "+ FsangC(f));
                    break;
                case 0:
                    System.exit(0);
                    default:
                        System.out.println("ban nhap sai so:");
            }
        }while (so != 0 );

    }
    public static double CsangF(double C){
        double F=(9.0/5)*C+32;
        return F;
    }
    public static double FsangC(double F){
        double C=(5.0/9)*(F-32);
        return C;
    }
}
