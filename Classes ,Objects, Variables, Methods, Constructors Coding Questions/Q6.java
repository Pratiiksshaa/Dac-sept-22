class Bank {
    String name;
    int acc_no;
    int balance;
    int total;

    Bank(String name, int acc_no, int balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    class Interest {
        void interest(int rate, int time) {
            total = balance * rate * time;
        }

        void display() {
            System.out.println("the name is : " + name);
            System.out.println("the account number is : " + acc_no);
            System.out.println("the balance is : " + balance);
            System.out.println("the interest is : " + total);
        }
    }
}

class Q6 {
    public static void main(String[] args) {
        Bank obj = new Bank("ABC", 100, 5000);
        Bank.Interest o = obj.new Interest();
        o.interest(8,5);
        o.display();


    }
}

/* OUTPUT=
the name is : ABC
the account number is : 100
the balance is : 5000
the interest is : 200000the name is : ABC
the account number is : 100
the balance is : 5000
the interest is : 200000
*/