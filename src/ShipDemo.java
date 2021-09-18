public class ShipDemo {

public static void main(String[] args) {
    Ship [] shipArray = new Ship [12];      
    shipArray[0] = new Ship("Diva", "1999");
    shipArray[1] = new Ship("Bombshell", "2000");
    shipArray[2] = new Ship("Thunder", "2003");
    shipArray[3] = new Ship("Sailor", "1999");
    shipArray[4] = new CruiseShip("Disney", "1972", 4000);
    shipArray[5] = new CruiseShip("Princess", "1982", 3000);
    shipArray[6] = new CruiseShip("Royal", "1992", 3500);
    shipArray[7] = new CruiseShip("Carnival", "2001", 4200);
    shipArray[8] = new CargoShip("Mediterranean", "1989", 20000);
    shipArray[9] = new CargoShip("COSCO", "1999", 25000);
    shipArray[10] = new CargoShip("Unifeeder", "2019", 18000);
    shipArray[11] = new CargoShip("QUENEPA", "2021", 30000);



 
     for (int i = 0; i < shipArray.length; i++)
     {            
           System.out.println(shipArray[i].toString());
            System.out.println("-----------------------------------------");
     }
      







}

}


