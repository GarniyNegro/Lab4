public class Main {
    public static void main(String[] args) {
        EventBuilder eventBuilder = new EventBuilder();

        // Приклад 1: Коректне створення заходу
        try {
            Event validEvent = eventBuilder
                    .setEventId(1)
                    .setEventName("Symphony Orchestra")
                    .setEventDate("2024-11-15")
                    .setRoomId(101)
                    .setEventSeats(500)
                    .build();
            System.out.println("Valid Event Created: " + validEvent);
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create event: " + e.getMessage());
        }

        // Приклад 2: Некоректне eventId
        try {
            Event invalidEvent1 = eventBuilder
                    .setEventId(-1)  // Некоректне значення
                    .setEventName("Guitar Concert")
                    .setEventDate("2024-11-20")
                    .setRoomId(104)
                    .setEventSeats(300)
                    .build();
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create event: " + e.getMessage());
        }

        // Приклад 3: Некоректне eventDate
        try {
            Event invalidEvent2 = eventBuilder
                    .setEventId(2)
                    .setEventName("Rock Concert")
                    .setEventDate("2024-11-35")  // Некоректний формат дати
                    .setRoomId(105)
                    .setEventSeats(200)
                    .build();
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create event: " + e.getMessage());
        }

        // Приклад 4: Некоректне eventName
        try {
            Event invalidEvent3 = eventBuilder
                    .setEventId(3)
                    .setEventName("")  // Некоректне значення
                    .setEventDate("2024-11-21")
                    .setRoomId(106)
                    .setEventSeats(150)
                    .build();
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create event: " + e.getMessage());
        }

        // Приклад 5: Некоректне eventSeats
        try {
            Event invalidEvent4 = eventBuilder
                    .setEventId(4)
                    .setEventName("Jazz Night")
                    .setEventDate("2024-11-22")
                    .setRoomId(107)
                    .setEventSeats(-100)  // Некоректне значення
                    .build();
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create event: " + e.getMessage());
        }
    }
}
