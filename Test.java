class Test{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int sum = a+b;
        int difference = a-b;
        int product = a*b;
        int quotient = a/b;
        String magic = "==========Magic==========";
        System.out.println("==========Method 1==========");
        System.out.println("Addition of a&b: " +sum);
        System.out.println("Subtraction of a&b: " +difference);
        System.out.println("Product of a&b: " +product);
        System.out.println("Quotient of a&b: " +quotient);
        System.out.println("==========Method 2==========");
        System.out.println("Addition of a&b: " +(a+b));
        System.out.println("Subtraction of a&b: " +(a-b));
        System.out.println("Product of a&b: " +(a*b));
        System.out.println("Quotient of a&b: " +(a/b));
        System.out.println("Remainder of a&b: " +(a%b));
        System.out.println(magic);
        System.out.println("Addition: " +sum+ " Subraction: " +difference +" Multiplication: " +product+ " Division: " +quotient );
    }
}