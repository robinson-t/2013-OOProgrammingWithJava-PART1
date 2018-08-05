
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } 
        return false;
    }
    
    public int priceDifference(Apartment otherApartment) {
        
        
        if (this.getPrice() > otherApartment.getPrice()) {
            return this.getPrice() - otherApartment.getPrice();
        } else if (otherApartment.getPrice() > this.getPrice()) {
            return otherApartment.getPrice() - this.getPrice();
        } else {
            return 0;
        }
    }
    
    public int getPrice() {
        return this.pricePerSquareMeter * this.squareMeters;
    }
    
    public boolean moreExpensiveThan(Apartment comparison) {
        if (this.getPrice() > comparison.getPrice()) {
            return true;
        }
        return false;
    }
    
}
