Module Program
    Sub Main()
        Console.Write("Masukkan alas: ")
        Dim alas As Double = Console.ReadLine()

        Console.Write("Masukkan tinggi: ")
        Dim tinggi As Double = Console.ReadLine()

        Dim luas As Double = 0.5 * alas * tinggi
        Console.WriteLine("Luas segitiga: " & luas)
    End Sub
End Module