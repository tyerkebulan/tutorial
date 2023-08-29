import java.sql.*;

public class  Main {
    private static final String url = "jdbc:postgresql://localhost/JavaBoot";
    private static final String user = "postgres";
    private static final String password = "root";
    static Connection conn = null;
    public static void main(String[] args) throws SQLException {
        // jdbc template api
        // connect to database
        // connector jdbc java database connectivity

        try {
            conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connected to the PostgreSQL server successfully.");
//            String INSERT_USERS_SQL = "INSERT INTO car" +
//                    "  (name, color) VALUES " +
//                    " (?, ?);";
//            Car car = new Car("Toyota", "yellow");
//            insertQuery(INSERT_USERS_SQL, car);

            String QUERY = "select * from car";
            selectQuery(QUERY);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static void insertQuery(String query, Car car) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(query);
//            preparedStatement.setInt(1, 0);
        preparedStatement.setString(1, car.getName());
        preparedStatement.setString(2, car.getColor());

        System.out.println(preparedStatement);
        // Step 3: Execute the query or update query
        preparedStatement.executeUpdate();
    }

    private static void selectQuery(String query) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(query);
//            preparedStatement.setInt(1, 1);
        // Step 3: Execute the query or update query
        ResultSet rs = preparedStatement.executeQuery();

        // Step 4: Process the ResultSet object.
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String color = rs.getString("color");
            System.out.println(id + "," + name + "," + name + "," + color);
        }
    }
}

class Car {
    private int id;
    private String name;
    private String color;

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}