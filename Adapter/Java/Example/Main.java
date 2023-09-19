package Adapter.Java.Example;

public class Main {
    public static void main(String[] args) {
        LegacyService legacyService = new LegacyService();
    
        NewService adapter = new LegacyServiceAdapter(legacyService);
    
        adapter.newRequest();
    }
}
