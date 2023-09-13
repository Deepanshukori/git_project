interface Calci {
    int getSum(int a, int b);
}
class Subclass implements Calci {
    public int getSum(int a, int b)
    {
        return a + b;
    }
}