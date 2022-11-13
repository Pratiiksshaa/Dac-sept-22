class Q4Outer
{
    void test()
    {
        System.out.println("print");
    }
    static class inner{

        void test1()
        {
            Q4Outer out = new Q4Outer();//object of outer class created
            out.test();//calling test function from outer class
        }
    }

    public static void main(String[] args) {
        Q4Outer.inner obj = new Q4Outer.inner(); // inner class object created
        obj.test1(); // calling test1 of inner class 
    }

}

// OUTPUT= print