package com.skatteverket.salary_data.repositories;

import com.skatteverket.salary_data.entities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {

    // Custom query method to find a record by tabellNr and value within inkomstFrom and inkomstTom range
    Salary findByTabellNrAndInkomstFromLessThanEqualAndInkomstTomGreaterThanEqual(int tabellNr, int inkomstFrom, int inkomstTom);
}
