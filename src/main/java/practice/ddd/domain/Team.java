package practice.ddd.domain;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Team {

    @EmbeddedId
    private TeamId id; // 고유 식별자 (Value Object)

    private String name; // 팀 이름

    protected Team() {
    }

    public Team(TeamId id, String name) {
        this.id = id;
        this.name = name;
    }

    public TeamId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(id, team.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
