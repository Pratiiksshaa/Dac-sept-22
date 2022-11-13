class Q5Outer
{
    void test()
    {
        System.out.println("sucess");
    }
    static class inner{

        void test1()
        {
            Q5outer out = new Q5outer();//object of outer class created
            out.test();//calling test function from outer class
        }
    }

    public static void main(String[] args) {
        Q5outer.inner obj = new Q5outer.inner(); // inner class object created
        obj.test1(); // calling test1 of inner class 
    }

}