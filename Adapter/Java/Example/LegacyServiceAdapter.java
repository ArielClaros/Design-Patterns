package Adapter.Java.Example;

public class LegacyServiceAdapter implements NewService {
    private LegacyService legacyService;

    public LegacyServiceAdapter(LegacyService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void newRequest() {
        legacyService.legacyRequest();
    }
}
