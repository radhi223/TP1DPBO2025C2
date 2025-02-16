#include "Petshop.cpp"
int total = 0;

void showData(Petshop Tokok[])
{
    if (total == 0) cout << "\nData masih kosong!\n" << endl;
    else {
        cout << "\nData sekarang :\n";
        for (int i = 0; i < total; i++)
        {
            cout << i+1 << "." <<Tokok[i].getId() << " - " << Tokok[i].getNama() << " - " << Tokok[i].getKategori() << " - " << Tokok[i].getHarga() << endl;
        }
        cout << endl;
    }
    
}


int main(){
    Petshop Tokok[100];
    string id, nama, kategori;
    int harga, stop = 0, choice = 0;
    while (stop == 0)
    {
        cout << "Selamat datang di Petshop kaiju! Silahkan pilih opsi di bawah ini :\n";
        cout << "1.Menampilkan data yang tersedia\n";
        cout << "2.Menambahkan data baru\n";
        cout << "3.Mengubah data yang sudah ada\n";
        cout << "4.Menghapus data yang diinginkan\n";
        cout << "5.Mencari data yang diinginkan berdasarkan nama produk\n";
        cout << "6.exit" << endl;
        cin >> choice;
        if (choice == 1)
        {
            showData(Tokok);
        }
        else if (choice == 2)
        {
            cout << "Masukkan data dengan format 'Id[SPASI]nama[SPASI]kategori[SPASI]harga'" << endl;
            cin >> id >> nama >> kategori >> harga;
            Tokok[total].setId(id);
            Tokok[total].setNama(nama);
            Tokok[total].setKategori(kategori);
            Tokok[total].setHarga(harga);
            total++;
            cout << "\nData berhasil masuk!\n" << endl;
        }
        else if (choice == 3)
        {
            if (total == 0)
            {
                cout << "\nData masih kosong!\n" << endl;
            }
            else 
            {
                cout << "Pilih data yang anda ingin ubah :\n";
                showData(Tokok);
                cin >> choice;
                int state = 0;
                while (state == 0)
                {
                    if (choice <= total)
                    {
                        cout << "Masukkan data dengan format 'Id[SPASI]nama[SPASI]kategori[SPASI]harga'" << endl;
                        cin >> id >> nama >> kategori >> harga;
                        Tokok[choice - 1].setId(id);
                        Tokok[choice - 1].setNama(nama);
                        Tokok[choice - 1].setKategori(kategori);
                        Tokok[choice - 1].setHarga(harga);
                        cout << "\nData berhasil diubah!\n" << endl;
                        state = 1;
                    }
                    else
                    {
                        cout << "Input invalid!" << endl;
                    }                    
                }
                
                
            }
        }
        else if (choice == 4)
        {
            if (total == 0)
            {
                cout << "\nData masih kosong!\n" << endl;
            }
            else 
            {
                cout << "Pilih data yang anda ingin hapus :\n";
                showData(Tokok);
                cin >> choice;
                int state = 0;
                while (state == 0)
                {
                    if (choice <= total)
                    {
                        Tokok[choice - 1].setId("");
                        Tokok[choice - 1].setNama("");
                        Tokok[choice - 1].setKategori("");
                        Tokok[choice - 1].setHarga(0);
                        while (choice < total)
                        {
                            Tokok[choice - 1] = Tokok[choice];
                            choice++;
                        }
                        total--;
                        cout << "\nData berhasil dihapus!\n" << endl;
                        state = 1;
                    }
                    else
                    {
                        cout << "Input invalid!" << endl;
                    }                    
                }
                
                
            }
        }
        else if (choice == 5)
        {
            if (total == 0)
            {
                cout << "\nData masih kosong!\n" << endl;
            }
            else
            {
                cout << "Masukkan nama data yang ingin anda cari :\n";
                cin >> nama;
                int found = 0;
                for (int i = 0; i < total; i++)
                {
                    if (Tokok[i].getNama() == nama)
                    {
                        found = i;
                    }
                    
                }
                if (found != 0)
                {
                    cout << "\nData ditemukan :\n";
                    cout << found+1 << "." <<Tokok[found].getId() << " - " << Tokok[found].getNama() << " - " << Tokok[found].getKategori() << " - " << Tokok[found].getHarga() << endl;
                }
                else
                {
                    cout << "Data tidak ditemukan!" << endl;
                }
                
            }
            
        }
        else if (choice == 6)
        {
            stop = 1;
        }
        
    }
    
}