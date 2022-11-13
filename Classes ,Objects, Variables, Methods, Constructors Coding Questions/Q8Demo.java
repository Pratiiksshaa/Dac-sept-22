class count
{
    static int count =0;

    count()
    {
        count++;
    }
}

class Q8Demo extends count {
    public static void main(String[] args) {
       count c1 = new count();
        count c2 = new count();
        count c3 = new count();
      System.out.println("count "+count);



    }
}

// OUTPUT= 3