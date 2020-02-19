package com.example.capstonebackend.messagesApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/messages")
public class MessagesController {

    @Autowired
    private final MessagesService messagesService;

    public MessagesController(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    @GetMapping
    public List<Message> getAllMessages() {
        return this.messagesService.getAllMessages();
    }

    @GetMapping("/{id}")
    public Message getOneMessage(@PathVariable int id) {
        Message message = messagesService.getOneMessage(id).orElseThrow(IllegalArgumentException::new);
        return message;
    }

    @PostMapping
    public Message addOneMessage(@RequestBody Message newMessage) {
        if(newMessage.getName() == null
                || newMessage.getEmail() == null
                || newMessage.getMessageBody() == null) {
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return messagesService.addOneMessage(newMessage);
    }

    @PatchMapping
    public Message updateOneMessage(@RequestBody Message updatedMessage) {
        Message message = messagesService.getOneMessage(updatedMessage.getId()).orElseThrow(IllegalArgumentException::new);
        return messagesService.updateOneMessage(updatedMessage);
    }

    @DeleteMapping("/{id}")
    public String removeOneMessage(@PathVariable int id) {
        Message message = messagesService.getOneMessage(id).orElseThrow(IllegalArgumentException::new);
        return messagesService.removeOneMessage(id);
    }
}