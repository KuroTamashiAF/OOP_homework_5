package Entity;

import Entity.Enums.Position;

import java.util.UUID;

public class Employee {
    private String name;
    private UUID id;
    private int salary;
    private Position position;


    public Employee(String name,int salary, Position position) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.salary = salary;
        this.position = position;
    }



}

