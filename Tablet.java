public class Tablet extends Produto {

    private Boolean Chip;

    public Tablet(Boolean Chip) {
        this.Chip = Chip;
    }
    public void chipp(){
        if(this.getChip().equals(true)){
            System.out.println("Possui chip");
        } else{
            System.out.println("Não possui chip");
        }

    }

    public Boolean getChip() {
        return Chip;
    }

    public void setChip(Boolean Chip) {
        this.Chip = Chip;
    }
    
    
    
}
