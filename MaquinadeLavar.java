public class MaquinadeLavar extends Produto {

    private double Qlitros;
    private int voltagem;


    public void estado(){
    System.out.println("Possui " + this.getQlitros() +"L e " + this.getVoltagem() +"v");

    }


    public double getQlitros() {
        return Qlitros;
    }
    public void setQlitros(double qlitros) {
        Qlitros = qlitros;
    }
    public int getVoltagem() {
        return voltagem;
    }


    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
  


    
}
