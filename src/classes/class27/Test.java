package classes.class27;

public class Test {
    
    public static void main(String[] args) {
        
    }

    // @Bean
    // @Qualifier("B-Manager")
    public A createBeanofA(){
        return new B();
    }

    // @Bean
    // @Qualifier("C-Manager")
    public A createBeanofAa(){
        return new C();
    }
}
