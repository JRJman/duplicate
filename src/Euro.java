public class Euro {

    private int hoeveelheid;

    public Euro(){}

    public Euro(int aantal) {
        this.hoeveelheid = aantal;
    }

    public int multiply(int number){
        return number * this.hoeveelheid;
    }

    public int multiplyAmountWith(int multiply,int number) {
        return number * multiply;
    }
}
