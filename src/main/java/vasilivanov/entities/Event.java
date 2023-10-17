package vasilivanov.entities;

import vasilivanov.enums.EventType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event {
  @Id
  @GeneratedValue
  private long id;
  private String title;
  private LocalDate eventDate;
  private EventType eventType;
  private int maxPartecipants;

  public Event() {
  }

  public Event(String title, LocalDate eventDate, EventType eventType, int maxPartecipants) {
    this.title = title;
    this.eventDate = eventDate;
    this.eventType = eventType;
    this.maxPartecipants = maxPartecipants;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public EventType getEventType() {
    return eventType;
  }

  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }

  public int getMaxPartecipants() {
    return maxPartecipants;
  }

  public void setMaxPartecipants(int maxPartecipants) {
    this.maxPartecipants = maxPartecipants;
  }
}
