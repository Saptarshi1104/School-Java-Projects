class program13
{
    public static void main()
    {
        int i, j, x=0;
        for(i=100; i<=999; i++)
        {
            x=0;
            for(j=1; j<=i; j++)
            {
                if(i%j == 0)
                x++;
            }
            if(x==2)
            System.out.println(i);
        }
    }
}