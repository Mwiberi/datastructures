public class CustomerImplementation implements CustomerInterface{

    private String name;
    private int age;
    
    @Override
    public void setName(String name) {
        this.name = name;
        
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
    
}
