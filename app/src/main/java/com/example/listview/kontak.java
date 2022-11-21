package com.example.listview;

public class kontak {
    private String nama;
    private String noHp;

    public kontak(String nama,String noHp){
        this.nama=nama;
        this.noHp=noHp;
    }
    public String getNama() {
        return this.nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNoHp() {
        return this.noHp;
    }
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    public int banding(String var1){
        if(getNama().contains(var1)){
            return 1;
        }
        else return  0;
    }

}
