package Assignment_9;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class Message {
    private final String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class MessageQueue {
    private final Queue<Message> messageQueue = new ConcurrentLinkedQueue<>();

    public synchronized void publish(Message message) {
        messageQueue.offer(message);
        notifyAll();
    }

    public synchronized Message subscribe() {
        while (messageQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        return messageQueue.poll();
    }
}

class Publisher {
    private final MessageQueue messageQueue;

    Publisher(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void publishMessage(String content) {
        Message message = new Message(content);
        messageQueue.publish(message);
    }
}

class Subscriber {
    private final MessageQueue messageQueue;

    Subscriber(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void subscribeMessages() {
        while (true) {
            Message message = messageQueue.subscribe();
            if (message != null) {
                processMessage(message);
            }
        }
    }

    private void processMessage(Message message) {
        System.out.println("Received message: " + message.getContent());
    }
}

public class PubSub {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();
        Publisher publisher = new Publisher(messageQueue);
        Subscriber subscriber = new Subscriber(messageQueue);

        Thread subscriberThread = new Thread(subscriber::subscribeMessages);
        subscriberThread.start();

        for (int i = 0; i < 5; i++) {
            publisher.publishMessage("Message " + i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        subscriberThread.interrupt();
        System.out.println("Main thread ended.");
    }
}