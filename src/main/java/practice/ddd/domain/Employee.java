package practice.ddd.domain;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Employee {

    @EmbeddedId
    private EmployeeId id; // 고유 식별자 (Value Object)

    private String name; // 직원 이름

    @Enumerated(EnumType.STRING)
    private Position position; // 직원의 직급 (Value Object)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team; // 직원이 속한 팀

    protected Employee() {
    }

    public Employee(EmployeeId id, String name, Position position, Team team) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.team = team;
    }

    public EmployeeId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Team getTeam() {
        return team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
