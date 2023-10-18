class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nSocial Security Number: %s", firstName, lastName, socialSecurityNumber);
    }
}

class PieceWorker extends Employee {

    private double wagePerPiece;
    private int piecesProduced;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wagePerPiece, int piecesProduced) {
        super(firstName, lastName, socialSecurityNumber);
        this.wagePerPiece = wagePerPiece;
        this.piecesProduced = piecesProduced;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nPiece Worker:%nWage per piece: $%.2f%nPieces produced: %d", wagePerPiece, piecesProduced);
    }
}


// or 


class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + ", SSN: " + socialSecurityNumber;
    }
}

class PieceWorker extends Employee {
    private double wagePerPiece;
    private int quantity;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wagePerPiece, int quantity) {
        super(firstName, lastName, socialSecurityNumber);
        this.wagePerPiece = wagePerPiece;
        this.quantity = quantity;
    }

    public String toString() {
        return super.toString() + ", Wage per Piece: $" + wagePerPiece + ", Quantity: " + quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        PieceWorker worker = new PieceWorker("John", "Doe", "123-45-6789", 10.5, 100);

        System.out.println(worker.toString());
    }
}

