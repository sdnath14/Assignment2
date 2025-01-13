class Elligibleforvote {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void check() {
        if (age > 18) {
            System.out.println("Yes you are elligible for voting");
        } else {
            System.out.println("Yes you are not elligible for voting");

        }
    }
}

class q8 {
    public static void main(String[] args) {
        Elligibleforvote e = new Elligibleforvote();
        e.setAge(30);
        e.check();
    }
}