package FactoryMethod.Java;

// Clase concreta para respuestas de OpenAI
public class OpenAIResponse implements AssistantResponse {
    @Override
    public String getResponse(String request) {
        return "Respuesta de OpenAI: ...";
    }
}
