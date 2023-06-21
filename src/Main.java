// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        1
        double d = 10;
        double P = 3.14;

        System.out.println("Begin4");
        System.out.println("d="+d+", P="+P);
        System.out.println("L=" + d*P);
//      2
        double a = 10;


        System.out.println("Begin5");
        System.out.println("a="+a);
        System.out.println("V=" +Math.pow(a, 3));

//        3
        int A=5;
        int B=0;
        System.out.println("Boolean4");
        System.out.println("A="+A+", B="+B);
        System.out.println("A>2 и B<=3 => " + (A>2&&B<3));

        //        4

        System.out.println("Boolean5");
        System.out.println("A="+A+", B="+B);
        System.out.println("A>=0 и B<-2 => " + (A>=0||B<-2));
        //        5
        int Num=-2;

        if(Num < 0){
          Num = Num + 1;
        }
        System.out.println("If1");
        System.out.println("Num="+Num);
        //        6
        int Num2=11;

        if(Num2 >= 0){
          Num2 = Num2 + 1;
        }else{
            Num2 = Num2 -2;
        }
        System.out.println("If2");
        System.out.println("Num="+Num2);
        //        7
        int Num3=0;

        if(Num3 > 0){
          Num3 = Num3 + 1;
        }else if(Num3 < 0){
            Num3 = Num3 -2;
        }else{
            Num3 = 10;
        }
        System.out.println("If3");
        System.out.println("Num="+Num3);
        //        8
        int K = 777;
        int N = 3;
        System.out.println("For1");
        for (int i = 1; i <= N; i++) {
        System.out.println("K="+K);
        }
        //        9
        int C = -1;
        int D = 3;
        int Kol = 0;
//        C<D
        System.out.println("For2");
        for (int j = C; j <= D; j++) {
            Kol++;
            System.out.println(j);
            if(j == D){
                System.out.println("N="+Kol);
            }
        }

    }
}