
public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name1, String year1, int maxPass) {
        super(name1, year1);
        maxPassengers = maxPass;
    }

    public void setMaxPassengers(int mPassengers) {
        this.maxPassengers = mPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public String toString() {
        return "Cruise Ship name: " + getName()
        + "\nMax number of Passengers: " + maxPassengers;
    }

    public void display() {
        System.out.println("*******Cruise Ship Information *********" + 
        "  \nName = " + getName() + 
        "  \nYear Built = "+ getYearBuilt() +     
         " \nMax Passenger Capacity is " + maxPassengers);
    }
}
