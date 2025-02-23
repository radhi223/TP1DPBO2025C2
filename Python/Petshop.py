class Petshop:
    def __init__(self, ID_produk="", nama_produk="", kategori="-", harga=0):
        self.ID_produk = ID_produk
        self.nama_produk = nama_produk
        self.kategori = kategori
        self.harga = harga
    
    def setId(self, id):
        self.ID_produk = id
    
    def setNama(self, nama):
        self.nama_produk = nama
    
    def setKategori(self, kategori):
        self.kategori = kategori
    
    def setHarga(self, harga):
        self.harga = harga
    
    def getId(self):
        return self.ID_produk
    
    def getNama(self):
        return self.nama_produk
    
    def getKategori(self):
        return self.kategori
    
    def getHarga(self):
        return self.harga

