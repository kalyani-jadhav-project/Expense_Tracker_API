package Rest_API.example.Expense_Tracker_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Rest_API.example.Expense_Tracker_API.Model.Expense;
import Rest_API.example.Expense_Tracker_API.service.ExpenseService;




@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    ExpenseService service;

    // ADD EXPENSE
    @PostMapping
    public String addExpense(@RequestBody Expense expense) {

        return service.addExpense(expense);
    }

    // GET ALL EXPENSES
    @GetMapping
    public List<Expense> getAllExpenses() {

        return service.getAllExpenses();
    }

    // GET TOTAL EXPENSE
    @GetMapping("/total")
    public double getTotalExpense() {

        return service.getTotalExpense();
    }

    // CATEGORY-WISE EXPENSE
    @GetMapping("/category/{category}")
    public List<Expense> getByCategory(
            @PathVariable String category) {

        return service.getByCategory(category);
    }

    // DELETE EXPENSE
    @DeleteMapping("/{id}")
    public String deleteExpense(
            @PathVariable int id) {

        return service.deleteExpense(id);
    }
}