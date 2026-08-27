package domain;

public class Cliente extends Person {

    private String direccionEntrega;

    //Constructor vacío

    public Cliente(){

    }

    //Constructor con argumentos

    public Cliente(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    //Getter and Setter

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    //Methods

    public void create(){
        super.create();
    }

    public void selectAll(){
        super.selectAll();
    }

    public void selectById(int id){
        super.selectById(id);
    }

}
