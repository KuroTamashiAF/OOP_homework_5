package Entity;

import Entity.Enums.AccessesLevel;
import Entity.Enums.Position;

import java.util.UUID;

public class Employee {
    private String name;
    private UUID id;
    private int salary;
    private Position position;

    private AccessesLevel accessesLevel;

    public Employee(String name,int salary, Position position,AccessesLevel accessesLevel ) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.salary = salary;
        this.position = position;
        this.accessesLevel = accessesLevel;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    public AccessesLevel getAccessesLevel() {
        return accessesLevel;
    }
}

