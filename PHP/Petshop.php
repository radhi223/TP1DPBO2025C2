<?php
class Petshop {
    private $ID_produk;
    private $nama_produk;
    private $kategori;
    private $harga;
    private $foto;

    public function __construct($ID_produk = "", $nama_produk = "", $kategori = "-", $harga = 0, $foto = "") {
        $this->ID_produk = $ID_produk;
        $this->nama_produk = $nama_produk;
        $this->kategori = $kategori;
        $this->harga = $harga;
        $this->foto = $foto;
    }

    public function setId($id) {
        $this->ID_produk = $id;
    }

    public function setNama($nama) {
        $this->nama_produk = $nama;
    }

    public function setKategori($kategori) {
        $this->kategori = $kategori;
    }

    public function setHarga($harga) {
        $this->harga = $harga;
    }

    public function setFoto($foto) {
        $this->foto = $foto;
    }

    public function getId() {
        return $this->ID_produk;
    }

    public function getNama() {
        return $this->nama_produk;
    }

    public function getKategori() {
        return $this->kategori;
    }

    public function getHarga() {
        return $this->harga;
    }
    public function getFoto() {
        return $this->foto;
    }
}
?>
