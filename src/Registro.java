import org.apache.commons.codec.digest.DigestUtils;

public class Registro {
    private String name;
    private String password;
    private Double bitcoins;
    private byte[] signature;
    private int nonce;

    public Registro(String name, String password, Double bitcoins) {
        this.name = name;
        this.password = password;
        this.bitcoins = bitcoins;
        this.nonce = 0;

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

    public byte[] getSignature(){
        return signature;
    }//end getSinature

    public void setSignature(byte[]signature){
        this.signature = signature;
    }//end setSignature

    @Override
    public String toString() {
        String resultado = "";
        resultado = resultado + getName() + "/" + getPassword() + "/" + getBitcoins().toString() + "/";
        return resultado;
    }
    public byte[] toByte(){
        return toString().getBytes();
    }


    public String toSHA1(){
        return DigestUtils.sha1Hex(toByte());
    }
} //end Registro class
