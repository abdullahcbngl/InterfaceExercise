public class Halkbank implements Banka{
    private String bankName;
    private String terminaId;
    private String password;

    public Halkbank(String bankName, String terminaId, String password){
        this.bankName = bankName;
        this.terminaId = terminaId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress){
        System.out.println("Kullanıcı ip : " + ipAddress);
        System.out.println("Makine ip : " + this.hostIpAddress);
        System.out.println(this.bankName + " Bağlanıldı !");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc){
        System.out.println("Bankadan cevap bekleniyor ! ");
        System.out.println("İşlem başarılı oldu !");
    return true;}

    public String getBankName(){
        return bankName;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getTerminaId(){
        return terminaId;
    }

    public void setTerminaId(String terminaId){
        this.terminaId = terminaId;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}



