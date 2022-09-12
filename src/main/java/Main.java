public class Main {

    public static void main (String[] args){
        Personer p1 = new Personer(1.72, 14);
        Personer p2 = new Personer (1.44, 17);
        System.out.println(p1.getHøjde());
        System.out.println(("Ny højde" + " " + p2.getHøjde()));
        p1.harFødselsdag();
        System.out.println(p1.getAlder());

    }
}
