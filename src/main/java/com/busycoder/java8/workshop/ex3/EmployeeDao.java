package com.busycoder.java8.workshop.ex3;

import java.util.List;
import java.util.Optional;

class Emp{}
public interface EmployeeDao {
    public Optional<Emp> getById(int id);
}
