class fibonacci {
    // random change made by Kishan
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n + 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        int n = 5;
	System.out.println("goofy lookin fibo");
        System.out.println(fib(n));
        System.out.println(fib(n));
        System.out.println(fib(n));
        System.out.println(fib(n));
        System.out.println(fib(n));
        System.out.println(fib(n));
        System.out.println(fib(n));
        System.out.println(fib(n));
        System.out.println(fib(n));
        System.out.println(fib(n));
        System.out.println("naman here");
    }
}

// this is my repo now :)
