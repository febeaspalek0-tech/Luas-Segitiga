int main() {
    @autoreleasepool {
        float alas, tinggi, luas;

        NSLog(@"Masukkan alas: ");
        scanf("%f", &alas);

        NSLog(@"Masukkan tinggi: ");
        scanf("%f", &tinggi);

        luas = 0.5 * alas * tinggi;

        NSLog(@"Luas segitiga: %.2f", luas);
    }
    return 0;
}