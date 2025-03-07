package ch.guggisberg.stefan.hex.model.customer;

public record CustomerId(int value) {

    public CustomerId {
        if (value < 1) {
            throw new IllegalArgumentException("'value' must be a positive integer");
        }
    }
}