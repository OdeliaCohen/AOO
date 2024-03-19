package projetaoo;

public class ExpensesCategory {

    private String id;
    private String categoryName;

    public ExpensesCategory(String id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public ExpensesCategory createCategory(String id, String categoryName) { 
        return new ExpensesCategory(id, categoryName);
    }
    
}
