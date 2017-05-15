package com.theironyard;

/**
 * Created by BUBBABAIRD on 5/8/17.
 */
// RENDER THIS EXACT CLASS IN THE EXACT FORM > ON WHITEBOARD
public class Message {
    private static int MESSAGE_COUNT = 0;
    private int id;
    private String messageText;

    public Message(String messageText) {
        this.messageText = messageText;
        // set id equal to whatever count is
        id = MESSAGE_COUNT;

        // INCREMENT THE NUMBER OF MESSAGES WE HAVE
        MESSAGE_COUNT++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
