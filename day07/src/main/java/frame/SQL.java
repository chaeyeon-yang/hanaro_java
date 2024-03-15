package frame;

public class SQL {
    // Customer SQL
    public static String insertCust = "INSERT INTO db_cust VALUES (?,?,?)";
    public static String updateCust = "UPDATE db_cust SET pwd = ? WHERE id = ?";
    public static String deleteCust = "DELETE FROM db_cust WHERE id = ?";
    public static String selectAllCust = "SELECT * FROM db_cust";
    public static String selectCust = "SELECT * FROM db_cust WHERE id = ?";



}
