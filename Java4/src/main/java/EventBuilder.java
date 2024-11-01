import java.util.ArrayList;
import java.util.List;

public class EventBuilder {
    private int eventId;
    private String eventName;
    private String eventDate;
    private int roomId;
    private int eventSeats;

    // Метод для перевірки правильності eventId
    private void validateEventId(int eventId) {
        if (eventId <= 0) {
            throw new IllegalArgumentException("Invalid eventId: " + eventId + ". It must be greater than 0.");
        }
    }

    // Метод для перевірки правильності eventName
    private void validateEventName(String eventName) {
        if (eventName == null || eventName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid eventName: '" + eventName + "'. It must not be null or empty.");
        }
    }

    // Метод для перевірки правильності eventDate
    private void validateEventDate(String eventDate) {
        // Приклад простого формату дати
        if (!eventDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid eventDate: '" + eventDate + "'. It must be in YYYY-MM-DD format.");
        }
    }

    // Метод для перевірки правильності roomId
    private void validateRoomId(int roomId) {
        if (roomId <= 0) {
            throw new IllegalArgumentException("Invalid roomId: " + roomId + ". It must be greater than 0.");
        }
    }

    // Метод для перевірки правильності eventSeats
    private void validateEventSeats(int eventSeats) {
        if (eventSeats <= 0) {
            throw new IllegalArgumentException("Invalid eventSeats: " + eventSeats + ". It must be greater than 0.");
        }
    }

    public EventBuilder setEventId(int eventId) {
        validateEventId(eventId);
        this.eventId = eventId;
        return this;
    }

    public EventBuilder setEventName(String eventName) {
        validateEventName(eventName);
        this.eventName = eventName;
        return this;
    }

    public EventBuilder setEventDate(String eventDate) {
        validateEventDate(eventDate);
        this.eventDate = eventDate;
        return this;
    }

    public EventBuilder setRoomId(int roomId) {
        validateRoomId(roomId);
        this.roomId = roomId;
        return this;
    }

    public EventBuilder setEventSeats(int eventSeats) {
        validateEventSeats(eventSeats);
        this.eventSeats = eventSeats;
        return this;
    }

    public Event build() {
        return new Event(eventId, eventName, eventDate, roomId, eventSeats);
    }
}
