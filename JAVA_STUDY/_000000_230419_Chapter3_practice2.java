public class _000000_230419_Chapter3_practice2 {
    private int nVoltage = 0;

    public void turnOn(int nInputVoltage){
        nVoltage = nInputVoltage;
    }
    public void turnOff(){nVoltage=0;}
    public int getVoltage(){return nVoltage;}

    public _000000_230419_Chapter3_practice2(int n){
        this.nVoltage = n;
    }

    public _000000_230419_Chapter3_practice2(){
        
    }
}
