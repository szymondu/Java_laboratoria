package pl.lublin.wsei.java.cwiczenia;

import java.sql.*;
import java.util.Properties;

public class MyDB {
    private String host, dbName;
    private int port;

    private Connection conn = null;
    private Statement statement = null;

    private String user, password;
    public MyDB(String host, int port, String dbName){
        this.host = host;
        this.port = port;
        this.dbName = dbName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private void connect(){
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "root");
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        String jdbcString = "jdbc:mysql://" + host + ":" + port + "/" + dbName;

        try{
            conn = DriverManager.getConnection(
                    jdbcString, connectionProps);
            statement = conn.createStatement();
        }

        catch (SQLException e){
            System.out.println("Błąd z połączeniem z bazą: " + jdbcString);
            System.out.println("Komunikat błędu: " + e.getMessage());
            conn = null;
        }
        System.out.println("Connected to database " + dbName);
    }
    public Connection getConnection() throws SQLException{
        if (conn == null)
            connect();
        return conn;
    }
    public void closeConnection(){
        if (conn != null){
            try{
                conn.close();
            }
            catch (SQLException e){
                System.out.println("Błąd związany z zamknięciem połączenia" + e.getMessage());
            }
            conn = null;
        }
    }
    public ResultSet selectData (String selectStatement){
        if ((conn != null) && (statement != null))
            try{
                return statement.executeQuery(selectStatement);
            } catch (SQLException e){
                System.out.println("Błąd realizacji zapytania: " + selectStatement + ", " + e.getMessage());
            }
        return null;
    }
}
