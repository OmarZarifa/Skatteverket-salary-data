package com.skatteverket.salary_data.controllers;

import com.skatteverket.salary_data.entities.Salary;
import com.skatteverket.salary_data.repositories.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SalaryController {

    private final SalaryRepository salaryRepository;

    @Autowired
    public SalaryController(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    @GetMapping("/")
    public String getAllData(Model model) {
        model.addAttribute("dataList", salaryRepository.findAll());
        return "allDataView";
    }

    @GetMapping("/getRecordByTabellNrAndValue")
    public String getRecordByTabellNrAndValue(@RequestParam int tabellNr, @RequestParam int value, Model model) {
        // Find the record that matches the given tabellNr and value range
        Salary salary = salaryRepository.findByTabellNrAndInkomstFromLessThanEqualAndInkomstTomGreaterThanEqual(tabellNr, value, value);

        model.addAttribute("data", salary);
        return "singleRecordView";
    }
}
