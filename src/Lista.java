import java.util.LinkedList;

public class Lista {

    private LinkedList<Registro> list;

    public Lista() {
        list = new LinkedList<>(); //creacion de lista ligada
    } //end Lista constructor

    public void addRegistro(String name, String password, Double bitcoins) {
        addRegistro(new Registro(name, password, bitcoins)); //agregar un nuevo objeto registro
    } //end addRegistro

    public void addRegistro(Registro registro) {
        list.add(registro); //agregar el registro creado a la lista
    } //end addRegistro

    public String toString() {
        String result = "";
        for (Registro element : list) { //Para cada elemento de tipo registro en list
            result = result + "#######################\n"; //Imprime in divisor de registros
            /*result = result + "Nombre:" + element.getName() + "\n"; //Imprime el nombre de cliente
            result = result + "Password:" + element.getPassword() + "\n"; //Imprime el nombre de cliente
            result = result + "Bicoins:" + element.getBitcoins() + "\n"; //Imprime el numero de bitcoins*/
            result = result + element.toString();
        } //end for
        return result; //regresa todos los nombres de cada registro
    } //end toString
}
