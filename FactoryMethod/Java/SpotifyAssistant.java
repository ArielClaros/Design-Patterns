package FactoryMethod.Java;

// Subclase de Creator para respuestas de Spotify
public class SpotifyAssistant extends Assistant {
    @Override
    public AssistantResponse createResponse(String input) {
        return new SpotifyResponse();
    }
}
