
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAHEEL
 */
class Actions {
    private static Connection conn;
    public static int getAvailableRoom() throws SQLException{
        DB_Conn db = new DB_Conn();
        conn = db.getConnection();
        String sql = "SELECT * FROM rooms ORDER BY room_no DESC LIMIT 1;";
        ResultSet resultSet = conn.createStatement().executeQuery(sql);
        if(resultSet.next()){
            if(resultSet.getInt(2) > 4){
                Actions.PrepareNextRoom(resultSet.getInt(1));
                int room_no = resultSet.getInt(1) + 1;
                return room_no;
            } return resultSet.getInt(1);
            }
        throw new SQLException("No rooms found in the database.");
    }
    public static boolean PrepareNextRoom(int roomNo) throws SQLException{
        String sql = "INSERT INTO rooms() value(" + Math.addExact(roomNo, 1) + "," + "0);";
        return conn.createStatement().executeUpdate(sql) > 0;
    }
    
    public static boolean addStudentDetailsToDatabase(String stdName, String stdAddress, String stdPhone, String stdEmail, String stdNic, 
            String stdBelieves, String parentName, String parentAddress, String parentPhone, String parentNic, String stdRegNo, String stdFaculty, 
            String stdAcaYear, String stdDepartment, String room_no) throws SQLException{
      
        String sql = "INSERT INTO `students` (`std_name`, `std_address`, `std_phone`, `std_email`, `std_nic`, `std_believes`, `std_disability`, `parentt_name`, `parnent_address`, `parent_phone`, `parent_nic`, `std_reg_no`, `std_faculty`, `std_aca_year`, `std_department`, `std_photo`, `room_no`) " + 
             "VALUES ('" + stdName + "', '" + stdAddress + "', '" + stdPhone + "', '" + stdEmail + "', '" + stdNic + "', '" + stdBelieves + "', NULL, '" + parentName + "', '" + parentAddress + "', '" + parentPhone + "', '" + parentNic + "', '" + stdRegNo + "', '" + stdFaculty + "', '" + stdAcaYear + "', '" + stdDepartment + "', NULL," + room_no + ");";
        return conn.createStatement().executeUpdate(sql);
    }
}
