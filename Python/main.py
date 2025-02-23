from Petshop import Petshop

total = 0
Tokok = []

def showData():
    if total == 0:
        print("\nData masih kosong!\n")
    else:
        print("\nData sekarang:")
        for i, item in enumerate(Tokok, start=1):
            print(f"{i}. {item.getId()} - {item.getNama()} - {item.getKategori()} - {item.getHarga()}")
        print()

def main():
    global total
    stop = False
    while not stop:
        print("Selamat datang di Petshop kaiju! Silahkan pilih opsi di bawah ini:")
        print("1. Menampilkan data yang tersedia")
        print("2. Menambahkan data baru")
        print("3. Mengubah data yang sudah ada")
        print("4. Menghapus data yang diinginkan")
        print("5. Mencari data yang diinginkan berdasarkan nama produk")
        print("6. Exit")
        
        choice = int(input())
        
        if choice == 1:
            showData()
        elif choice == 2:
            print("Masukkan data dengan format 'Id nama kategori harga'")
            id, nama, kategori, harga = input().split()
            harga = int(harga)
            Tokok.append(Petshop(id, nama, kategori, harga))
            total += 1
            print("\nData berhasil masuk!\n")
        elif choice == 3:
            if total == 0:
                print("\nData masih kosong!\n")
            else:
                showData()
                index = int(input("Pilih data yang ingin diubah: ")) - 1
                if 0 <= index < total:
                    print("Masukkan data dengan format 'Id nama kategori harga'")
                    id, nama, kategori, harga = input().split()
                    harga = int(harga)
                    Tokok[index].setId(id)
                    Tokok[index].setNama(nama)
                    Tokok[index].setKategori(kategori)
                    Tokok[index].setHarga(harga)
                    print("\nData berhasil diubah!\n")
                else:
                    print("Input invalid!")
        elif choice == 4:
            if total == 0:
                print("\nData masih kosong!\n")
            else:
                showData()
                index = int(input("Pilih data yang ingin dihapus: ")) - 1
                if 0 <= index < total:
                    del Tokok[index]
                    total -= 1
                    print("\nData berhasil dihapus!\n")
                else:
                    print("Input invalid!")
        elif choice == 5:
            if total == 0:
                print("\nData masih kosong!\n")
            else:
                nama = input("Masukkan nama data yang ingin dicari: ")
                found = None
                for i, item in enumerate(Tokok):
                    if item.getNama() == nama:
                        found = i
                        break
                if found is not None:
                    item = Tokok[found]
                    print("\nData ditemukan:")
                    print(f"{found+1}. {item.getId()} - {item.getNama()} - {item.getKategori()} - {item.getHarga()}")
                else:
                    print("Data tidak ditemukan!")
        elif choice == 6:
            stop = True
            
if __name__ == "__main__":
    main()
