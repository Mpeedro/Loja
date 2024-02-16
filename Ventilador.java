public class Ventilador extends Produto {

    private int voltagem;










   public void estado(){
    System.out.println("Ele possui: " + this.getVoltagem()+"v");

    }
    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }




    
}
