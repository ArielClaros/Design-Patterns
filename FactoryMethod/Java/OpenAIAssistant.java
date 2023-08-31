package FactoryMethod.Java;

// Subclase de Creator para respuestas de OpenAI
public class OpenAIAssistant extends Assistant {
    @Override
    public AssistantResponse createResponse(String input) {
        return new OpenAIResponse();
    }
}