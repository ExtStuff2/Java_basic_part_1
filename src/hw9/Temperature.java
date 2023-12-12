package hw9;

public class Temperature {
    private double degrees;
    private char degreesFlag;

    public Temperature() {
        this.degrees = 0;
        this.degreesFlag = 'C';
    }

    public Temperature(double degrees) {
        this.degrees = degrees;
        this.degreesFlag = 'C';
    }

    public Temperature(char degreesFlag) {
        this.degrees = 0;
        this.degreesFlag = degreesFlag;
    }

    public Temperature(double degrees, char degreesFlag) {
        this.degrees = degrees;
        this.degreesFlag = degreesFlag;
    }

    public void setDegreesFlag(char degreesFlag) {
        this.degreesFlag = degreesFlag;
    }

    public void setDegreesAndFlag(double degrees, char degreesFlag) {
        this.degrees = degrees;
        this.degreesFlag = degreesFlag;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public double getDegrees() {
        return degrees;
    }

    public char getDegreesFlag() {
        return degreesFlag;
    }

    public double getDegreesC() {
        if (getDegreesFlag() == 'F') {
            return ((degrees - 32) / 1.8000);
        }
        return degrees;
    }

    public double getDegreesF() {
        if (getDegreesFlag() == 'C') {
            return ((degrees * 1.8000) + 32.00);
        }
        return degrees;
    }
}
