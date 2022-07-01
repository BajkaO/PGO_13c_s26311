package cw7;

class StoryViolationException extends RuntimeException {
    StoryViolationException(String message) {
        super(message);
    }

    void printMessage() {
        super.printStackTrace();
    }
}
