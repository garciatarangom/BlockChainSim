public class Registro {
    private String name;
    private String password;
    private Double bitcoins;

    public Registro(String name, String password, Double bitcoins) {
        this.name = name;
        this.password = password;
        this.bitcoins = bitcoins;
    } // end Registro constructor

    public String getName() {
        return name;
    } //end getName

    public void setName(String name) {
        this.name = name;
    } //end setName

    public String getPassword() {
        return password;
    } //end getPassword

    public void setPassword(String password) {
        this.password = password;
    } //end setPassword

    public Double getBitcoins() {
        return bitcoins;
    } //end getBitcoins

    public void setBictoins(Double bitcoins) {
        this.bitcoins = bitcoins;
    } //end setBitcoins

} //end Registro class
