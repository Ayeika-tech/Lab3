public class Ship implements Displayable {
    private String name;
    private String yearBuilt;

    public Ship(String name1, String year1) {
        this.name = name1;
        this.yearBuilt = year1;
    }

    public void setName(String name1){
        this.name = name1;
    }
    public void setYearBuilt(String year1){
        this.yearBuilt = year1;
    }
    public String getName(){
        return name;
    }
    public String getYearBuilt(){
        return yearBuilt;
    }


    public String toString() {
        String str = "Ship name: "+ name
                   + "\nYear it was built: "+ yearBuilt;
        return str;
    }

    @Override
    public void display() {
        System.out.println("\t\t---Ship Information--------- " + "      \nShip's Name = " + getName()
                + "      \nShip's Year Built = " + getYearBuilt());
    }
}