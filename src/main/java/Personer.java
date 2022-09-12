public class Personer {


    private double højde;
    private int alder;
    public Personer(double højde, int alder){
        this.højde = højde;
        this.alder = alder;

    }

    public Personer() {

    }
    public double double_getHøjde() {
        return højde;
    }
    public void setHøjde(double højde){
        this.højde = højde;

    }

    public double getHøjde() {
        return højde;
    }
    public void harFødselsdag(){
    alder++;
    }

    public int getAlder() {
        return alder;
    }
}
