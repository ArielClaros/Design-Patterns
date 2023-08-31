package FactoryMethod.Java;

// Subclase de Creator para respuestas de Spotify
public class CalendarAssistant extends Assistant {
    @Override
    public AssistantResponse createResponse(String input) {
        return new CalendaryResponse();
    }
}
