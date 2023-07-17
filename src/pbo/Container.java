package pbo;

public class Container {
private String isiBox;
protected String merk;
protected String berat;
protected String warna;

    //--CONSTRUCTOR
    public Container(String isiBox, String merk, String berat, String warna) {
        this.isiBox = isiBox;
        this.merk = merk;
        this.berat = berat;
        this.warna = warna;
    }

    //--ACCESSOR
    public void setisiBox(String isiBox) {
        this.isiBox = isiBox;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }

    //--MUTATOR
    public String getisiBox() {
        return isiBox;
    }

    public String getMerk() {
        return merk;
    }

    public String getBerat() {
        return berat;
    }
    
    public String getWarna() {
        return warna;
    }

    //_POLYMORPHSME (overload)    
        public String tampilanInfo (){
        return "Isi Box          : "+getisiBox()+
                "\nMerk Container  : "+getMerk()+
                "\nBerat Container : "+getBerat();    
        }
}
