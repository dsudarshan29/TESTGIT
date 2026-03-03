    prime number of the form 4k+1
     * @return a primitive root modulo n
     */
    public static int primitiveRoot(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 4) {
            return 3;
        }
        if (n % 2 == 0) {
            n /= 2;
        }
        if (isPrime(n) && n % 4 == 1) {
            for (int i = 2; i < n; i++) {
                if (isPrimitiveRoot(i, n)) {
                    return i;
                }
            }
        }
        throw new IllegalArgumentException("n must be a prime number of the form 4k+1");