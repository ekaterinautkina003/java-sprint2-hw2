public class MonthTotalPerYear {
    private final String month;
    private final int amount;
    private final boolean isExpense;

    public MonthTotalPerYear(String month, int amount, boolean isExpense) {
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
    }

    public String getMonth() {
        return month;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isExpense() {
        return isExpense;
    }
}