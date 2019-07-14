package mock;

class Mock extends Exception {

    private static int bomb;

    /**
     * Pass in a zero, and it'll throw you an
     * ArithmeticException. Used with assertThrows
     * as a quick-fix hack for assertCalls, until
     * Mockito is up and running.
     * @param zero just give me a zero or I'm pointless.
     */
    static void callSuccess (int zero)
    {
        bomb = 1 / zero;
    }
}
