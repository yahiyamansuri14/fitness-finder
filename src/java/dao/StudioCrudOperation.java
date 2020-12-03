/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.MyConnection;
import entity.Studio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class StudioCrudOperation {
    public int addStudio(Studio studio) throws ClassNotFoundException, SQLException{
        String sql="insert into studiodetails values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int i=0;
        
        try{
            Connection connection=MyConnection.mycon();
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1, studio.getStudio_id());
            ps.setString(2, studio.getS_name());
            ps.setString(3, studio.getS_address());
            ps.setString(4, studio.getS_state());
            ps.setString(5, studio.getS_city());
            ps.setString(6, studio.getS_contact());
            ps.setString(7, studio.getWorkout_avail());
            ps.setString(8, studio.getAmenities());
            //ps.setByte(9, studio.getImage());
            ps.setBytes(9, studio.getImage());
            ps.setString(10, studio.getOwner_id());
            ps.setString(11, studio.getS_hotlocation());
            ps.setString(12, studio.getDistance_hotlocation());
            ps.setString(13, studio.getCategory());
            i=ps.executeUpdate();
        }catch(Exception e){e.printStackTrace();}
        return i;
    }
    //Method to show all Studio by Name and Id(works Fine)
    public ArrayList<Studio> showAllStudioByIdAndName(){
        ArrayList<Studio> studioList=new ArrayList<>();
        String sql="select studio_id,s_name from studiodetails";
        Connection con;
        Statement stmt;
        ResultSet rs;
        try{
            con=MyConnection.mycon();
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                Studio studio=new Studio();
                studio.setStudio_id(rs.getString(1));
                studio.setS_name(rs.getString(2));
                studioList.add(studio);
            }
        }catch(Exception e){e.printStackTrace();}
        return studioList;
    }
    //method to show studio details by Id(works fine)
    public Studio showStudioDetailById(Studio studio){
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select * from studiodetails where studio_id=?";
        try{
            con=MyConnection.mycon();
            ps=con.prepareStatement(sql);
            ps.setString(1,studio.getStudio_id());
            rs=ps.executeQuery();
            rs.next();
            studio.setStudio_id(rs.getString(1));
            studio.setS_name(rs.getString(2));
            studio.setS_address(rs.getString(3));
            studio.setS_state(rs.getString(4));
            studio.setS_city(rs.getString(5));
            studio.setS_contact(rs.getString(6));
            studio.setWorkout_avail(rs.getString(7));
            studio.setAmenities(rs.getString(8));
            studio.setImage(rs.getBytes(9));
            
            studio.setOwner_id(rs.getString(10));
            studio.setS_hotlocation(rs.getString(11));
            studio.setDistance_hotlocation(rs.getString(12));
            studio.setCategory(rs.getString(13));
        }catch(Exception e){e.printStackTrace();}
        return studio;
    }
}
