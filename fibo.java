class not_fibonacci {
    // This is coming from my branch (rupampatir)

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        int n = 9;
        int aleph = 500;
        System.out.println(fib(n));
		System.out.println("Hi..")
    }
}
