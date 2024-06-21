public class Customer extends Person {
        private double boot_camp_fees;

        public Customer() { }

            public Customer(String name, int age, String email, String phone_number, String sex, String address,
                double boot_camp_fees) {
            super(name, age, email, phone_number, sex, address);
            this.boot_camp_fees = boot_camp_fees;
        }

            public double getBoot_camp_fees() {
                return boot_camp_fees;
            }

            public void setBoot_camp_fees(double boot_camp_fees) {
                this.boot_camp_fees = boot_camp_fees;
            }

            @Override
            public void print() 
            {
            super.print();
            System.out.println(" Boot Camp Fees : " + boot_camp_fees);
            }
            @Override
            public void input() 
            {
                super.input();
                System.out.println("Boot Camp Fees : ");
                boot_camp_fees = scanner.nextDouble();
            }

    

}
