class BitManipulation {
    public static long getBit(long n, int k) {
        return (n>>k)&1L;
    }

    public static long setBit(long n, int k) {
        return (n | (1L<<k));
    }

    public static long clearBit(long n, int k) {
        return (n & ~(1L<<k));

    }

    public static long toggleBit(long n, int k) {
        return n^(1L<<k);
    }
    public static boolean isPowerOfTwo(long n) {
        return (n>0 && (n&(n-1))==0);
    }
    public static int countSetBits(long n) {
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}