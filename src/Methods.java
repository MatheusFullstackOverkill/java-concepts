class Methods {
    // public - can be acessed by other classes
    // void - the type of the return of the function, no return in this case
    public void printSum(float number, float number2) {
        System.out.println(sum(number, number2));
    }
    // private - can't be acessed by other classes
    // float - the type of the return of the function
    private float sum(float number, float number2) {
        return number + number2;
    }
    // static - a method that can be accessed by other classes without needing to instantiate the current class, ex:
    // Methods.printRandomText();
    public static void printRandomText() {
        System.out.printf("Random text");
    }
    // protected - can only be used by the classes withing current package.
    // Very folder in Java it's a package.
    protected void print() {
        System.out.println("sss");
    }
}