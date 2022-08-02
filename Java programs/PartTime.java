class PartTime extends Employee {
     private double hour;
     private double rate;
     public void setHour(double hr) {
         hour = hr;
     }
     public double getHour() {
         return hour;
     }
    public void setRate(double rt) {
         rate = rt;
    }
    public double getRate() {
         return rate;
    }
    public double pay() {
         System.out.println("PartTime::Pay()");
         return (hour * rate) + super.pay();
    }
}