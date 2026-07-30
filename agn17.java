class agn17
{
    public static void main()
    {
        int i, c, n, s=0;
        for(i=100; i<=999; i++)
        {
            c = i;
            s = 0;
            while(c>0)
            {
                n = c%10;
                s = s*10 + n;
                c = c/10;
            }
            if(i == s)
            System.out.println(i);
        }
    }
}