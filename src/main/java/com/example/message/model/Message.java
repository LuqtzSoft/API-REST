package com.example.message.model;

import java.time.LocalDateTime;

public class Message {
    private Long id;
    private String user;
    private String message;
    private LocalDateTime fechaCreacion;

    // Constructor
    public Message(Long id, String user, String message, LocalDateTime fechaCreacion) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Message [id=" + id + ", user=" + user + ", message=" + message + ", fechaCreacion=" + fechaCreacion + "]";
    }
}
