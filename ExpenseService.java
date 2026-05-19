package Rest_API.example.Expense_Tracker_API.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Rest_API.example.Expense_Tracker_API.Model.Expense;



@Service
public class ExpenseService {

    List<Expense> expenses = new ArrayList<>();

    public ExpenseService() {

        expenses.add(new Expense(
                1,
                "Pizza",
                "Food",
                500));

        expenses.add(new Expense(
                2,
                "Bus Ticket",
                "Travel",
                200));
    }

    // ADD EXPENSE
    public String addExpense(Expense expense) {

        expenses.add(expense);

        return "Expense Added Successfully";
    }

    // GET ALL EXPENSES
    public List<Expense> getAllExpenses() {

        return expenses;
    }

    // GET TOTAL EXPENSE
    public double getTotalExpense() {

        double total = 0;

        for(Expense e : expenses) {

            total += e.getAmount();
        }

        return total;
    }

    // GET CATEGORY-WISE EXPENSES
    public List<Expense> getByCategory(String category) {

        List<Expense> result = new ArrayList<>();

        for(Expense e : expenses) {

            if(e.getCategory()
                    .equalsIgnoreCase(category)) {

                result.add(e);
            }
        }

        return result;
    }

    // DELETE EXPENSE
    public String deleteExpense(int id) {

        expenses.removeIf(
                e -> e.getId() == id);

        return "Expense Deleted Successfully";
    }
}