package PayrollModification;

public class PieceWorker extends Employee{
    private int pieces;
    private double wage;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int pieces, double wage) {
        super(firstName, lastName, socialSecurityNumber);

        if(pieces < 0){
            throw new IllegalArgumentException("Pieces should be > 0.0");
        }
        if(wage < 0.0){
            throw new IllegalArgumentException("Wages should be > 0.0");
        }
        this.pieces = pieces;
        this.wage = wage;
    }

    public int getPieces() {

        return pieces;
    }

    public void setPieces(int pieces) {
        if(pieces < 0){
            throw new IllegalArgumentException("Pieces should be > 0.0");
        }
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0){
            throw new IllegalArgumentException("Wages should be > 0.0");
        }
        this.wage = wage;
    }

    @Override
    public double earnings(){
        return getPieces() * getWage();
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,d%n%s: $%,.2f","Piece workers", super.toString(),
                                                    "Number of pieces", getPieces(),
                                                    "Worker wage", getWage());
    }
}
