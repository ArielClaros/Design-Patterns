package FactoryMethod.Java;

// Creator (fábrica) abstracta
public abstract class Assistant {
    public abstract AssistantResponse createResponse(String input);

    public String getResponse(String input) {
        AssistantResponse response = createResponse(input);
        return response.getResponse(input);
    }
}
