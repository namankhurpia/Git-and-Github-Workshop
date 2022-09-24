class fibonacci {
    // random change made by Kishan
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        int n = 9;
<<<<<<< HEAD
        bleh
=======
        blah
>>>>>>> 8609093c93c6a92afd81f89f8491a55066fffe2d
        System.out.println(fib(n));
    }
}
