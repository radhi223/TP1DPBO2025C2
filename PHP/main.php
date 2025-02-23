<?php
include 'Petshop.php';

$total = 0;
$Tokok = [];

//add produk
$Tokok[0] = new Petshop("111", "Godzilla", "Kaijuu", 1000000, "Godzilla.png");
$total++;
$Tokok[1] = new Petshop("222", "Mothra", "Kaijuu", 950000, "Mothra.png");
$total++;
$Tokok[2] = new Petshop("333", "Kong", "Kaijuu", 750000, "Kong.png");
$total++;

//Mengubah data yang ada
$Tokok[2]->setNama("Muto")->setHarga(500000);
$Tokok[2]->setFoto("Muto.png");

//menghapus data
$Tokok[2]->setId("");
$Tokok[2]->setNama("");
$Tokok[2]->setKategori("");
$Tokok[2]->setKategori("");
$Tokok[2]->setHarga(0);
$Tokok[2]->setFoto("");
$total--;
?>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<?php 
for ($i=0; $i < $total; $i++) { 
?>
<div class="card" style="width: 18rem;">
  <img class="card-img-top" src="images/<?php echo $Tokok[$i]->getFoto(); ?>" alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title"> <?php echo $Tokok[$i]->getNama(); ?> </h5>
    <p class="card-text"> <?php echo "ID : ". $Tokok[$i]->getId();  ?> <br> <?php echo "Kategori : ". $Tokok[$i]->getKategori();  ?> <br> <?php echo "Harga : ". $Tokok[$i]->getHarga();  ?> </p>
  </div>
</div>
<?php
}
?>
