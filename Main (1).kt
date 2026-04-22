fun main() {
    print("Masukkan alas: ")
    val alas = readLine()?.toDoubleOrNull()

    print("Masukkan tinggi: ")
    val tinggi = readLine()?.toDoubleOrNull()

    if (alas != null && tinggi != null) {
        val luas = 0.5 * alas * tinggi
        println("Luas segitiga: $luas")
    } else {
        println("Input tidak valid!")
    }
}