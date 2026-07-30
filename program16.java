class program16
{ // starting of class
    public static void main(int a)
    { // starting of main
        int l,f,m,e,s;
        l = a % 10;
        f = a / 100;
        e = a % 100;
        m = e / 10;
        s = l+f+m;
        System.out.println(l+f+m);
        System.out.println("Sum is:" + s);
    }
}