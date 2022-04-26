package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public record TelephoneNumber(String ariaCode, String number) {
    @Override
    public String toString() {
        return this.ariaCode + " " + this.number;
    }
}
