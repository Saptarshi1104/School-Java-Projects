class cons6
{
    float a, b, c, d, r1, r2;
    cons6(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
        d = 0;
    }
    void calculate()
    {
        d = (b*b) - (4*a*c);
        if(d<0)
            System.out.println("Roots not possible");
        else
        {
            r1 = (float) (-b + Math.sqrt(d))/(2*a);
            r2 = (float) (-b - Math.sqrt(d))/(2*a);
            System.out.println("Roots are: " + r1 + "\t" + r2);
        }
    }
}