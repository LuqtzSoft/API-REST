package com.example.message.service;

import com.example.message.model.Message;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    private List<Message> messages = new ArrayList<>();
    private Long nextId = 1L;

    // Constructor con algunos mensajes iniciales
    public MessageService() {
        messages.add(new Message(nextId++, "Nicolas", "Este es el primer mensaje", LocalDateTime.now()));
        messages.add(new Message(nextId++, "Enzo", "Segundo mensaje en la lista", LocalDateTime.now()));
    }

    public List<Message> getAllMessages() {
        return messages;
    }

    public Optional<Message> getMessageById(Long id) {
        return messages.stream().filter(m -> m.getId().equals(id)).findFirst();
    }

    public Message addMessage(Message message) {
        message.setId(nextId++);
        message.setFechaCreacion(LocalDateTime.now());
        messages.add(message);
        return message;
    }

    public Message updateMessage(Long id, Message updatedMessage) {
        Optional<Message> optionalMessage = getMessageById(id);
        if (optionalMessage.isPresent()) {
            Message message = optionalMessage.get();
            message.setUser(updatedMessage.getUser());
            message.setMessage(updatedMessage.getMessage());
            message.setFechaCreacion(LocalDateTime.now());
            return message;
        }
        return null;
    }

    public boolean deleteMessage(Long id) {
        return messages.removeIf(m -> m.getId().equals(id));
    }
}
