package truong.e1000.doublylinkedlistmanagement.model;

public class Complex {
    private int real;
    private int virtual;
    
    public Complex (int real, int virtual) {
        this.setReal(real);
        this.setVirtual(virtual);
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getVirtual() {
        return virtual;
    }

    public void setVirtual(int virtual) {
        this.virtual = virtual;
    }
    
    public String toString () {
        String stringVirtual = "";
        if (this.virtual > 0) {
            stringVirtual = "+" + Math.abs(virtual) + "i";
        } else if (this.virtual < 0) {
            stringVirtual = "-" + Math.abs(virtual) + "i";
        }
        
        return this.real + stringVirtual;
    }
}
