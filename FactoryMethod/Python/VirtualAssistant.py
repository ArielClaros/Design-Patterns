# Interfaz para las respuestas del asistente virtual
class AssistantResponse:
    def generate_response(self, input_text):
        pass

# Clase concreta para respuestas de Spotify
class SpotifyResponse(AssistantResponse):
    def generate_response(self, input_text):
        return "Reproduciendo canción en Spotify..."

# Clase concreta para respuestas de OpenAI
class OpenAIResponse(AssistantResponse):
    def generate_response(self, input_text):
        return f"Respuesta de OpenAI: {input_text}"

# Clase concreta para respuestas de Calendario
class CalendarResponse(AssistantResponse):
    def generate_response(self, input_text):
        return "La fecha de hoy es 28 de agosto de 2023."

# Creator (fábrica) abstracta
class Assistant:
    def create_response(self, input_text):
        pass

    def get_response(self, input_text):
        response = self.create_response(input_text)
        return response.generate_response(input_text)

# Subclase de Creator para respuestas de Spotify
class SpotifyAssistant(Assistant):
    def create_response(self, input_text):
        return SpotifyResponse()

# Subclase de Creator para respuestas de OpenAI
class OpenAIAssistant(Assistant):
    def create_response(self, input_text):
        return OpenAIResponse()

# Subclase de Creator para respuestas de Calendario
class CalendarAssistant(Assistant):
    def create_response(self, input_text):
        return CalendarResponse()

if __name__ == "__main__":
    spotify_assistant = SpotifyAssistant()
    openai_assistant = OpenAIAssistant()
    calendar_assistant = CalendarAssistant()
    
    print(spotify_assistant.get_response("spotify"))
    print(openai_assistant.get_response("¿Cuál es el clima hoy?"))
    print(calendar_assistant.get_response("Dame la fecha actual"))