public class App {
    public static void main(String[] args) throws Exception {
      
           
        Tablet t1= new Tablet(true);
        
        t1.setNome("Galaxy tab");
        t1.setMarca("Samsung");
        t1.setqEstoque(20);
        t1.setValor(2.000);
        t1.setChip(false);
       t1.desconto();
        t1.chipp();
        t1.Venda();
      

        MaquinadeLavar m1 = new MaquinadeLavar();

        m1.setNome("Lavadora");
        m1.setMarca("Eletrolux");
        m1.setqEstoque(25);
        m1.setValor(2.500);
        m1.setQlitros(11);
        m1.setVoltagem(110);
        m1.desconto();
        m1.estado();
        m1.Venda();


        Ventilador v1 = new Ventilador();

        v1.setNome("Ventilador");
        v1.setMarca("Mondial");
        v1.setqEstoque(30);
        v1.setValor(150.00);
        v1.setVoltagem(110);
        v1.desconto();
        v1.estado();
        v1.Venda();



    }
}
