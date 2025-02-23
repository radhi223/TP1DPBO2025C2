class Petshop {
    Petshop(){
    }
    
    private String ID_produk;
    private String nama_produk;
    private String kategori;
    private int harga;

    Petshop(String id, String nama, String Kategori, int harga){
        this.ID_produk = id;
        this.nama_produk = nama;
        this.kategori = Kategori;
        this.harga = harga;
    }

    void setId(String id){
        this.ID_produk = id;
    }

    void setNama(String nama){
        this.nama_produk = nama;
    }

    void setKategori(String kategori){
        this.kategori = kategori;
    }

    void setHarga(int harga){
        this.harga = harga;
    }

    String getId(){
        return this.ID_produk;
    }

    String getNama(){
        return this.nama_produk;
    }

    String getKategori(){
        return this.kategori;
    }

    int getHarga(){
        return this.harga;
    }
}