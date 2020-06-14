public class abc {
    private abc(){}
    private static class adc2{
        static abc abc=new abc();
    }

    public static abc buid()
    {
        return adc2.abc;
    }
}
