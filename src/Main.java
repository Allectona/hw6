public class Main {
    public static void main(String[] args) {

        /* 1 задание */

        for (int i = 1; i<=10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        /* 2 задание */

        for (int a = 10; a>=1; a--) {
            System.out.println("Итерация цикла " + a);
        }

        /* 3 задание */

        for (int b = 0; b<17; b=b+2) {
            System.out.println("Итерация цикла " + b);
        }

        /* 4 задание */

        for (int c = 10; c>=-10; c--) {
            System.out.println("Итерация цикла " + c);
        }

        /* 5 задание */

        for (int d = 1904; d<=2096; d=d+4) {
            System.out.println(d + " год является високосным");
        }

        /* 6 задание */

        for (int e = 7; e<=98; e=e+7) {
            System.out.println("Итерация цикла " + e);
        }

        /* 7 задание */

        for (int f = 1; f<=512; f=f*2) {
            System.out.println("Итерация цикла " + f);
        }

        /* 8 задание */

        int  salary = 29000;
        int total = 0;
        for (int j = 0; j<12; j++) {
            total=total+salary;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + total + " рублей");
        }

        /* 9 задание */

        int Salary = 29000;
        int Total=0;
        int salaryWithPenny = Salary*100;
        int totalWithPenny=0;

        for (int g = 0; g<12; g++) {
            totalWithPenny = totalWithPenny+totalWithPenny/100;
            totalWithPenny = totalWithPenny+salaryWithPenny;
            Total=totalWithPenny/100;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + Total + " рублей");
        }

        /* 9 задание */
        int n = 2;
        for (int m = 1; m<=10; m++) {
            System.out.println(n + "*" + m + "=" + n * m + "\t");
            }
    }
}
