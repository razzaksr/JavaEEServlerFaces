package JDBC;

import oracle.jdbc.driver.OracleDriver;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class DAO {
    private PreparedStatement preparedStatement=null;
    private ResultSet resultSet=null;
    private int returned;
    private Driver driver=null;
    private Connection connection=null;
    private String query="";
    public DAO(){
        try {
            driver=new OracleDriver();
            DriverManager.registerDriver(driver);
            connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            System.out.println("Driver is connected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Collection<Hai> all(){
        try {
            query="select * from hai";
            preparedStatement= connection.prepareStatement(query);
            resultSet=preparedStatement.executeQuery();
            Collection<Hai> all=new ArrayList<>();
            Hai hai=null;
            while(resultSet.next()){
                hai=new Hai();
                hai.setId(resultSet.getInt("id"));
                hai.setName(resultSet.getString("name"));
                hai.setPrice(resultSet.getInt("price"));
                //System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name")+" "+resultSet.getInt("price"));
                all.add(hai);
            }
            return all;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
