public class Printer <G>{
    G objToPrint;
    public Printer(G objToPrint){
        this.objToPrint = objToPrint;
    }
    public void print(){
        System.out.println("Printed: "+ objToPrint);
    }
}
