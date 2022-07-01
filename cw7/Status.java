package cw7;

class Status {
    private final String name;
    private int status;

    Status(String name, int status) {
        this.name = name;
        this.status = status;
    }

    String getName() {
        return name;
    }

    int getStatus() {
        return status;
    }

    void setStatus(int status) {
        this.status = status;
    }
}
