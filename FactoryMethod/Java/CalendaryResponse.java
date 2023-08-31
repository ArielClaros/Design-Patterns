package FactoryMethod.Java;

// Clase concreta para respuestas de Calendario
public class CalendaryResponse implements AssistantResponse{
    @Override
    public String getResponse(String request) {
        return "La fecha de hoy es 28 de agosto de 2023.";
    }
}
