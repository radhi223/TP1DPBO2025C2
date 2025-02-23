import java.util.Objects;
import java.util.Scanner;

class main {
    static int total = 0;
    
        public static void showData(Petshop Tokok[])
        {
            if(total == 0) System.out.println("\nData masih kosong!\n\n");
            else
            {
                System.out.println("\nData sekarang :");
                for (int i = 0; i < total; i++) {
                    System.out.println((i + 1) + "." + Tokok[i].getId() + " - " + Tokok[i].getNama() + " - " + Tokok[i].getKategori() + " - " + Tokok[i].getHarga());
                }
                System.out.println("\n");
            }
        }
        public static void main(String[] args) {
            Petshop[] Tokok = new Petshop[100];
            String id, nama, kategori;
            int harga, stop = 0, choice = 0;
            Tokok[0] = new Petshop("111", "Godzilla", "Kaijuu", 1000000);
            total++;
            Tokok[1] = new Petshop("111", "Godzilla", "Kaijuu", 1000000);
            total++;
            while (stop == 0) {
                System.out.println("Selamat datang di Petshop kaiju! Silahkan pilih opsi di bawah ini :\n");
                System.out.println("1.Menampilkan data yang tersedia\n");
                System.out.println("2.Menambahkan data baru\n");
                System.out.println("3.Mengubah data yang sudah ada\n");
                System.out.println("4.Menghapus data yang diinginkan\n");
                System.out.println("5.Mencari data yang diinginkan berdasarkan nama produk\n");
                System.out.println("6.exit\n");
                Scanner sc = new Scanner(System.in);
                try {
                    choice = sc.nextInt();
                } catch (Exception e) {
                }
                switch (choice) {
                    case 1:
                        showData(Tokok);
                        break;
                    case 2:
                        System.out.println("Masukkan data dengan format 'Id[SPASI]nama[SPASI]kategori[SPASI]harga'\n");
                        try {
                            id = sc.next();
                            nama = sc.next();
                            kategori = sc.next();
                            harga = sc.nextInt();
                            Tokok[total] = new Petshop(id, nama, kategori, harga);
                            total++;
                            System.out.println("\nData Berhasil Masuk!\n");
                        } catch (Exception e) {
                        }
                        break;
                    case 3:
                        if (total == 0) System.out.println("\nData masih kosong!\n");
                        else
                        {
                            System.out.println("Pilih data yang anda ingin ubah :\n");
                            showData(Tokok);
                            try {
                                choice = sc.nextInt();
                            } catch (Exception e) {
                            }
                            int state = 0;
                            while (state == 0) {
                                if (choice <= total) {
                                    System.out.println("Masukkan data dengan format 'Id[SPASI]nama[SPASI]kategori[SPASI]harga'\n");
                                    id = sc.next();
                                    nama = sc.next();
                                    kategori = sc.next();
                                    harga = sc.nextInt();
                                    Tokok[choice - 1].setId(id);
                                    Tokok[choice - 1].setNama(nama);
                                    Tokok[choice - 1].setKategori(kategori);
                                    Tokok[choice - 1].setHarga(harga);
                                    System.out.println("\nData berhasil diubah!\n\n");
                                    state = 1;
                                }
                                else
                                {
                                    System.out.println("Input invalid!\n");
                                }
                            }
                        }
                        break;
                    case 4:
                        if(total == 0) System.out.println("\nData masih kosong!\n\n");
                        else
                        {
                            System.out.println("Pilih data yang anda ingin hapus :\n");
                            showData(Tokok);
                            try {
                                choice = sc.nextInt();
                            } catch (Exception e) {
                            }
                            int state = 0;
                            while (state == 0) {
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
                                    System.out.println("\nData berhasil dihapus!\n");
                                    state = 1;
                                }
                                else
                                {
                                    System.out.println("Input invalid!");
                                }
                            }
                        }
                        break;
                    case 5:
                        if(total == 0) System.out.println("\nData masih kosong!\n");
                        else
                        {
                            String name = "";
                            System.out.println("Masukkan nama data yang ingin anda cari :\n");
                            try {
                                name = sc.next();
                            } catch (Exception e) {
                            }
                            int found = 0;
                            for (int i = 0; i < total; i++) {
                                if (Objects.equals(Tokok[i].getNama(), name) == true) {
                                    found = i;
                                }
                            }
                            if (found != 0) {
                                System.out.println("\nData ditemukan :\n");
                                System.out.println((found + 1) + "." + Tokok[found].getId() + " - " + Tokok[found].getNama() + " - " + Tokok[found].getKategori() + " - " + Tokok[found].getHarga() + "\n");
                            }
                        }
                        break;
                    case 6:
                        stop = 1;
                        break;
                    default:
                        System.out.println("\nInvalid!\n");
                        break;
                }
            }
            System.out.println(total);
            // for (int i = 0; i < total; i++) {
            //     System.out.println(Tokok[i].getId() + Tokok[i].getNama() + Tokok[i].getKategori() + Tokok[i].getHarga());
            // }

    }   
}
