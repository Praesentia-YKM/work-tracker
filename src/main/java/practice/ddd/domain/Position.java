package practice.ddd.domain;

public enum Position {
    INTERN("인턴"),
    STAFF("일반 직원"),
    SENIOR("시니어 직원"),
    MANAGER("관리자");

    private final String description;

    Position(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}