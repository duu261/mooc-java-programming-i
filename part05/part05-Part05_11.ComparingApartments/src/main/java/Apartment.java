
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int getSquaresPrice() {
        return this.squares * this.princePerSquare;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.getSquaresPrice() - compared.getSquaresPrice());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.getSquaresPrice() > compared.getSquaresPrice();

    }

}
