class fibonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    
    //fibonacciiiii
    public static void main(String args[])
    {
        int n = 12;
        System.out.println(fib(n));
    }
}