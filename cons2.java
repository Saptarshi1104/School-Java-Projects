class cons2
{
    int num, rev, f;
    cons2(int n)
    {
        num = n;
        rev = 0;
        f = 0;
    }
    int prime()
    {
        f = 0;
        for(int i=1; i<=num; i++)
        {
            if(num % i == 0)
                f++;
        }
        if(f == 2)
            return 1;
        else 
            return 0;
    }
    int reverse()
    {
        int x, y, new_no = 0;
        x = num;
        while(x>0)
        {
            y = x % 10;
            new_no = (new_no * 10) + y;
            x = x/10;
        }
        return new_no;
    }
    void display()
    {
        if(prime() == 1 && reverse() == num)
            System.out.println("Prime Palindrome");
        else
            System.out.println("Not a Prime Palindrome");
        System.out.println(num);
    }
}