public class PartTimeStaff extends Person {
    private int hour_rate;
    private double rate;
    
    public PartTimeStaff() { }

     public PartTimeStaff(String name, int age, String email, String phone_number, String sex, String address,
            int hour_rate, double rate) {
        super(name, age, email, phone_number, sex, address);
        this.hour_rate = hour_rate;
        this.rate = rate;
    }

    public int getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(int hour_rate) {
        this.hour_rate = hour_rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    @Override
    public void print() 
    {
        super.print();
        System.out.println(" Hours : " + hour_rate);
        System.out.println(" Rate : " + rate);
    }
    @Override
    public void input() 
    {
    super.input();
    System.out.println("Enter Hours : ");
    hour_rate = scanner.nextInt();
    System.out.println("Enter Rate : ");
    rate = scanner.nextDouble();

    }


    
}
