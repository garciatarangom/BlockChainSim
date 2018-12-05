import java.util.LinkedList;

public class Lista {

    private LinkedList<Registro> list;

    Lista() {
        list = new LinkedList<>(); //creacion de lista ligada
        Registro genesisblock = new Registro("The Times 03/Jan/2009 Chancellor on brink of second bailout for banks", "lalala", 2.0);
        genesisblock.setSignature("000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f");
        genesisblock.setNonce(2083236893);
    } //end Lista constructor

    public void addRegistro(String name, String password, Double bitcoins) {
        addRegistro(new Registro(name, password, bitcoins)); //agregar un nuevo objeto registro
    } //end addRegistro

    void addRegistro(Registro registro) {
        list.add(registro); //agregar el registro creado a la lista
    } //end addRegistro

    public String toString() {
        String result = "";
        for (Registro element : list) { //Para cada elemento de tipo registro en list
            result = result + element.toString();
        } //end for
        return result; //regresa todos los nombres de cada registro
    } //end toString
}
