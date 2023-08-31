package FactoryMethod.Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Assistant spotifyAssistant = new SpotifyAssistant();
        Assistant openAIAssistant = new OpenAIAssistant();
        Assistant calendarAssistant = new CalendarAssistant();

        String request = scanner.nextLine();

        if (request.contains("spotify")) {
            System.out.println(spotifyAssistant.getResponse(request));
        } else if (request.contains("?")) {
            openAIAssistant.getResponse(request);
        } else if (request.contains("fecha")) {
            calendarAssistant.getResponse(request);
        } else {
            System.out.println("Invalid input");
        }
    }
}
