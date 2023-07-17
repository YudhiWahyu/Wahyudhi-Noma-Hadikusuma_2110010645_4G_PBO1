package pbo;

public class ContainerInfo extends Container {

    //--(overrding)
    public ContainerInfo(String isiBox, String merk, String berat, String warna) {
        super(isiBox, merk, berat, warna);
    }
    
    public String getKodeIsiBox (){
        return super.getisiBox().substring(0, 3);
    }
    
    @Override
    public String getWarna() {
        return super.warna.substring(0, 3);
    }
    
    //SELEKSI
    public String getKodemerk(){
        String Kodemerk = getMerk().substring(0, 2);
        
        switch (Kodemerk) {
            case "HY" :
                return "HYU";
            case "DO" :
                return "DON";
            case "HA" :
                return "HAM";
            default :
                System.out.println("Tidak ada kode merk Kontainer");
        }
        return null;
    }
    
    public String getKodeBerat (){
        String kodeBerat = getBerat().substring(0, 2);
        
        if (kodeBerat.equals("20")) {
               return "20.000 KG";
        } else {
        if (kodeBerat.equals("27")) {
               return "27.000 KG";
        } else {
        } return "30.000 KG";
            
        }
    }
 
    @Override
        public String tampilanInfo (){
        return "Isi Box          : "+getisiBox()+
                "\nMerk Container   : "+getMerk()+
                "\nBerat Container  : "+getBerat()+
                "\nBerat Container  : "+getWarna()+
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
}
}