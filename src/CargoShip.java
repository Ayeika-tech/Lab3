public class CargoShip  extends Ship {
    private int tonsCapacity;

    public CargoShip(String nameShip, String yearBuilt, int tonsCap){
        super(nameShip, yearBuilt);
        this.tonsCapacity = tonsCap;
    }
    public void setTonsCapacity(int tonsCap){
        this.tonsCapacity = tonsCap;
    }
    public int getTonscapacity(){
        return tonsCapacity;
    }
    @Override
    public String toString(){
        String str = "Cargo Ship name: "+ super.getName()+
                    "\n Max cargo Tonnage: "+ tonsCapacity;
         return str;
    }
    @Override
    public void display() {
       System.out.println("********Cargo Ship Information****** " +
               "      \nShip's Name = " + getName() +
               "      \nShip's Year Built = " +getYearBuilt()+
               "      \nShip's Max Tonnage Capacity is " + tonsCapacity);

    }
}
