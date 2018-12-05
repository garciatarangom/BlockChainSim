import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.binary.Hex;

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

    public void setBitcoins(Double bitcoins) {
        this.bitcoins = bitcoins;
    } //end setBitcoins

    public byte[] getSignature() {
        return signature;
    }//end getSinature

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }//end setNonce

    public int getNonce() {
        return nonce;
    }//end getNonce

    public void setSignature(String signature) {
        try {
            this.signature = Hex.decodeHex(signature);
            System.out.println(signature);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }//end setSignature

    @Override
    public String toString() {
        String resultado = "";
        resultado = resultado + getName() + "/" + getPassword() + "/" + getBitcoins().toString() + "/" + Integer.toString(getNonce());
        return resultado;
    }

    public byte[] toByte() {
        return toString().getBytes();
    }


    public String toSHA1() {
        String resultado = DigestUtils.sha1Hex(toByte());
        while(resultado.substring(0,5) != "00000" ){
            resultado = DigestUtils.sha1Hex(toByte());
            System.out.println(resultado);
            this.nonce = this.nonce + 1;
        }
        return resultado;
    }
} //end Registro class
