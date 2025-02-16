#include <iostream>
#include <string>

using namespace std;

class Petshop{
    private:
        string ID_produk;
        string nama_produk;
        string kategori;
        int harga;
    
    public:
        Petshop(){
            this->ID_produk = "";
            this->nama_produk = "";
            this->kategori = "-";
            this->harga = 0;
        }

        void setId(string id)
        {
            this->ID_produk = id;
        }

        void setNama(string nama)
        {
            this->nama_produk = nama;
        }

        void setKategori(string kategori)
        {
            this->kategori = kategori;
        }

        void setHarga(int harga)
        {
            this->harga = harga;
        }

        string getId()
        {
            return this->ID_produk;
        }

        string getNama()
        {
            return this->nama_produk;
        }

        string getKategori()
        {
            return this->kategori;
        }

        int getHarga()
        {
            return this->harga;
        }

        ~Petshop() {}
};