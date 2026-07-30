class cons5
{
    float p, r;
    cons5(int a, int b)
    {
        p = a;
        r = b;
    }
    void print()
    {
        float q = p;
        for(int i=2001; i<=2007; i++)
        {
            q = q * (1 + (r/100.0f));
            System.out.println("Population in: " + i + " is: " + q);
        }
    }
}