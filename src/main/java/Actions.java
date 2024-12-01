import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
        String sql = "SELECT * FROM rooms WHERE member_count < max_count ORDER BY room_no ASC LIMIT 1;";
        ResultSet resultSet = conn.createStatement().executeQuery(sql);
        if(resultSet.next()){
            return resultSet.getInt(1);
        }else{
            JOptionPane.showMessageDialog(null, "Rooms are Not available", "NO ROOMS", JOptionPane.ERROR_MESSAGE);
        }
        throw new SQLException("No rooms found in the database.");
    }
    
     public static boolean delStudentFromDatabase(int id) throws SQLException{
        DB_Conn db = new DB_Conn();
        Connection conn = db.getConnection();
        String sql = "DELETE FROM students WHERE id = "+ id +";";
        return conn.createStatement().executeUpdate(sql) > 0;
    }
    
    public static boolean reserveTheRoom(int roomNo) throws SQLException{
         DB_Conn db = new DB_Conn();
        Connection conn = db.getConnection();
        String sql = "UPDATE rooms SET member_count = member_count + 1 WHERE room_no = "+ roomNo+";";
        return conn.createStatement().executeUpdate(sql) > 0;
    }
    
    public static boolean vacateTheRoom(int roomNo) throws SQLException{
        DB_Conn db = new DB_Conn();
        Connection conn = db.getConnection();
        String sql = "UPDATE rooms SET member_count = member_count - 1 WHERE room_no = "+ roomNo+" AND  member_count > 0;";
        return conn.createStatement().executeUpdate(sql) > 0;
    }
    
    public static boolean AddRoomToDatabase(int roomNo, int maxCount) throws SQLException{
        DB_Conn db = new DB_Conn();
        Connection conn = db.getConnection();
        String sql = "INSERT INTO rooms (room_no, member_count, max_count) VALUES(" + roomNo + ", 0, " + maxCount + ");";   
        return conn.createStatement().executeUpdate(sql) > 0;
    }
 
    public static boolean isSpaceinRoom(int roomNO){
        String query = "SELECT * FROM rooms WHERE room_no = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, roomNO);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                int members = rs.getInt("member_count");
                if(members < 4){
                    return true;
                }
            }
        }catch(Exception e){}
        return false;
    }
    
    public static boolean addStudentToDatabase(String stdName, String stdAddress, String stdPhone, String stdEmail, String stdNic, 
                                     String stdBelieves, String parentName, String parentAddress, String parentPhone, 
                                     String parentNic, String stdRegNo, String stdFaculty, String stdAcaYear, 
                                     String stdDepartment, String roomNo) {

        String query = "INSERT INTO students (std_name, std_address, std_phone, std_email, std_nic, std_believes, " +
                       "parent_name, parent_address, parent_phone, parent_nic, std_reg_no, std_faculty, " +
                       "std_aca_year, std_department, room_no) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(query)) {

            // Setting parameters
            pstmt.setString(1, stdName);
            pstmt.setString(2, stdAddress);
            pstmt.setString(3, stdPhone);
            pstmt.setString(4, stdEmail);
            pstmt.setString(5, stdNic);
            pstmt.setString(6, stdBelieves);
            pstmt.setString(7, parentName);
            pstmt.setString(8, parentAddress);
            pstmt.setString(9, parentPhone);
            pstmt.setString(10, parentNic);
            pstmt.setString(11, stdRegNo);
            pstmt.setString(12, stdFaculty);
            pstmt.setString(13, stdAcaYear);
            pstmt.setString(14, stdDepartment);
            pstmt.setInt(15, Integer.parseInt(roomNo));
            Actions.reserveTheRoom(Integer.parseInt(roomNo));
            //  the query Execute here
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted successfully!");
            JOptionPane.showMessageDialog(null, "Inserted");
            return true;

        } catch (NumberFormatException e) {
            System.err.println("Error: Failed to parse numeric fields. Please ensure 'stdAcaYear' and 'roomNo' are valid integers.");
            return false;
        } catch (Exception e) {
        }
        return false;
    }
   
    public static boolean updateStudentInDatabase(int studentId, String stdName, String stdAddress, String stdPhone, String stdEmail, 
                                              String stdNic, String stdBelieves, String parentName, String parentAddress, 
                                              String parentPhone, String parentNic, String stdRegNo, String stdFaculty, 
                                              String stdAcaYear, String stdDepartment, String roomNo) {

    String query = "UPDATE students SET std_name = ?, std_address = ?, std_phone = ?, std_email = ?, std_nic = ?, " +
                   "std_believes = ?, parent_name = ?, parent_address = ?, parent_phone = ?, parent_nic = ?, " +
                   "std_reg_no = ?, std_faculty = ?, std_aca_year = ?, std_department = ?, room_no = ? WHERE id = ?";
    DB_Conn db = new DB_Conn();
    conn = db.getConnection();
    try (PreparedStatement pstmt = conn.prepareStatement(query)) {

        // Set parameters for the query
        pstmt.setString(1, stdName);
        pstmt.setString(2, stdAddress);
        pstmt.setString(3, stdPhone);
        pstmt.setString(4, stdEmail);
        pstmt.setString(5, stdNic);
        pstmt.setString(6, stdBelieves);
        pstmt.setString(7, parentName);
        pstmt.setString(8, parentAddress);
        pstmt.setString(9, parentPhone);
        pstmt.setString(10, parentNic);
        pstmt.setString(11, stdRegNo);
        pstmt.setString(12, stdFaculty);
        pstmt.setString(13, stdAcaYear);
        pstmt.setString(14, stdDepartment);

        pstmt.setInt(15, Integer.parseInt(roomNo));

        //for the WHERE clause
        pstmt.setInt(16, studentId);

        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Student record updated successfully!");
            JOptionPane.showMessageDialog(null, "Student record updated successfully!");
            return true;
        } else {
            System.out.println("No record found with the provided ID.");
            JOptionPane.showMessageDialog(null, "No record found with the provided ID.");
            return false;
        }

    } catch (NumberFormatException e) {
        System.err.println("Error: Failed to parse numeric fields. Please ensure 'roomNo' is a valid integer.");
        return false;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

}

