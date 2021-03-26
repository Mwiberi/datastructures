public class Main {
    public static void main(String[] args) {
        Customer clare = new Customer("Cust1", 1);

        CustomerOne customerOne = new CustomerOne();
        customerOne.setName("Clare");

        System.out.println(clare.toString());

        String name = clare.getName();

        //System.out.println(name);
        
        clare.setName("Bo Beep");

        //System.out.println(clare.getName());

        System.out.println(clare.toString());

        System.out.println(customerOne.toString());
        
    }
    
}
