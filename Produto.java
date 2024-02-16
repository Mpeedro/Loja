public  abstract class Produto {

    protected String nome;
    protected String marca;
    protected int qEstoque;
    protected Double Valor;
    private double valora;
   
    

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", marca=" + marca + ", qEstoque=" + qEstoque + ", Valor=" + Valor + '}';
    }



    public void desconto(){
        System.out.println(getNome() + ", " +  getMarca() );
        System.out.println("À prazo é: " + this.Valor);
        this.setValor(valora = Valor - (Valor*5)/100);
        System.out.println("O Valor à vista é: " + valora );
       
    }





    public void Venda(){
    this.qEstoque= qEstoque-1;
    System.out.println("A quantidade de estoque pós venda: " + getqEstoque());
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getqEstoque() {
        return qEstoque;
    }

    public void setqEstoque(int qEstoque) {
        this.qEstoque = qEstoque;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }
    
    
    public void setvalora( double valora){
        this.valora=valora;
      }
    
    public double getvalora(){
        return valora;
    }
    
    
    
    
         
    

    
}
