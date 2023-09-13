import java.util.Scanner;

interface Calci {
    int getSum(int a, int b);
}

class Subclass implements Calci {
    public int getSum(int a, int b) {
        return a + b;
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = sc.nextInt();
        System.out.println("Ennter The Second Number");
        int b = sc.nextInt();
        Subclass s1 = new Subclass();
        int sum = s1.getSum(a, b);
        System.out.println(a + "+" + b + "=" + sum);
        sc.close();
    }
}