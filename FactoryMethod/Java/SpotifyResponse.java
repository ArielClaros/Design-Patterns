package FactoryMethod.Java;

// Clase concreta para respuestas de Spotify
public class SpotifyResponse implements AssistantResponse {
    @Override
    public String getResponse(String input) {
        return "Reproduciendo canción en Spotify...";
    }
}
