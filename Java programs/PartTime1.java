class PartTime extends Employee {
     private double hour;
     private double rate;

     PartTime() {

     }

     PartTime(double h, double rt) {
         hour = h;
         rate = rt;
     }

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
         return (hour * rate);
    }

    public String toString() {
        String s = "in PartTime toString():  name=" + getName();
        return s;
    }
}