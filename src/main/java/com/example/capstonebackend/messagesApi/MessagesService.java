package com.example.capstonebackend.messagesApi;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;
        import java.util.Optional;

@Service
public class MessagesService {

    @Autowired
    private final MessagesRepository messagesRepository;

    public MessagesService(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    public List<Message> getAllMessages() {
        return this.messagesRepository.findAll();
    }

    public Optional<Message> getOneMessage(int id) {
        return messagesRepository.findById(id);
    }

    public Message addOneMessage(Message newMessage) {
        return messagesRepository.save(newMessage);
    }

    public Message updateOneMessage(Message updatedMessage) {
        return messagesRepository.save(updatedMessage);
    }

    public String removeOneMessage(int id) {
        messagesRepository.deleteById(id);
        return "Id " + id + " was removed";
    }
}