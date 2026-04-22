<!DOCTYPE html>
<html>
<head>
    <title>Hitung Luas Segitiga</title>
</head>
<body>

<form method="post">
    Alas: <input type="number" name="alas"><br><br>
    Tinggi: <input type="number" name="tinggi"><br><br>
    <input type="submit" name="hitung" value="Hitung">
</form>

<?php
if(isset($_POST['hitung'])){
    $alas = $_POST['alas'];
    $tinggi = $_POST['tinggi'];

    $luas = 0.5 * $alas * $tinggi;

    echo "<br>Luas segitiga adalah: " . $luas;
}
?>

</body>
</html>