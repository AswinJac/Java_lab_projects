class passarray {
    void test(int ...v)
    {
     System.out.print("Number of args: " + v.length + " Contents: ");
    for(int x : v)
    System.out.print(x + " ");
    System.out.println();
    }
    public static void main(String args[])
    {
        passarray obj=new passarray();
        obj.test(10); // 1 arg
        obj.test(1,2,3); // 3 args
        obj.test(); // no args
}
}
    