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
import java.util.ArrayList;

/**
 *
 * @author YahiyaMansuri
 */
public class SearchCrudOperation {
    //method to get result based on city,area and fitness place option
    public ArrayList<Studio> indexSearchResult(Studio studio){
        ArrayList<Studio> studioList=new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select * from studiodetails where s_city=? and s_hot_location=? and categories=?";
        try{
            con=MyConnection.mycon();
            ps=con.prepareStatement(sql);
            ps.setString(1,studio.getS_city());
            ps.setString(2,studio.getS_hotlocation());
            ps.setString(3,studio.getCategory());
            rs=ps.executeQuery();
            while(rs.next()){
                Studio studioTemp=new Studio();
                studioTemp.setStudio_id(rs.getString(1));
                studioTemp.setS_name(rs.getString(2));
                studioTemp.setS_address(rs.getString(3));
                studioTemp.setS_state(rs.getString(4));
                studioTemp.setS_city(rs.getString(5));
                studioTemp.setS_contact(rs.getString(6));
                studioTemp.setWorkout_avail(rs.getString(7));
                studioTemp.setAmenities(rs.getString(8));
                //studioTemp.setImage(rs.getBytes(9));
                studioTemp.setOwner_id(rs.getString(10));
                studioTemp.setS_hotlocation(rs.getString(11));
                studioTemp.setDistance_hotlocation(rs.getString(12));
                studioTemp.setCategory(rs.getString(13));
                studioList.add(studioTemp);
            }
        }catch(Exception e){e.printStackTrace();}
    return studioList;
    }
    //method to get result on AllFitnessOption at index
    public ArrayList<Studio> showForAllFitnessOption(Studio studio){
        ArrayList<Studio> studioList=new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select * from studiodetails where s_city=? and s_hot_location=?";
        try{
            con=MyConnection.mycon();
            ps=con.prepareStatement(sql);
            ps.setString(1,studio.getS_city());
            ps.setString(2,studio.getS_hotlocation());
            rs=ps.executeQuery();
            while(rs.next()){
                Studio studioTemp=new Studio();
                studioTemp.setStudio_id(rs.getString(1));
                studioTemp.setS_name(rs.getString(2));
                studioTemp.setS_address(rs.getString(3));
                studioTemp.setS_state(rs.getString(4));
                studioTemp.setS_city(rs.getString(5));
                studioTemp.setS_contact(rs.getString(6));
                studioTemp.setWorkout_avail(rs.getString(7));
                studioTemp.setAmenities(rs.getString(8));
                //studioTemp.setImage(rs.getBytes(9));
                studioTemp.setOwner_id(rs.getString(10));
                studioTemp.setS_hotlocation(rs.getString(11));
                studioTemp.setDistance_hotlocation(rs.getString(12));
                studioTemp.setCategory(rs.getString(13));
                studioList.add(studioTemp);
            }
        }catch(Exception e){e.printStackTrace();}
    return studioList;
    }
    //method to show results based on distance of 3km
    public ArrayList<Studio> showResultByDistanceThree(Studio studio){
        ArrayList<Studio> studioList=new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select * from studiodetails where  s_hot_location=? and distance_hotlocation between 1 and ? ";
        try{
            con=MyConnection.mycon();
            ps=con.prepareStatement(sql);
            ps.setString(1, studio.getS_hotlocation());
            ps.setString(2,studio.getDistance_hotlocation());
            rs=ps.executeQuery();
            while(rs.next()){
                Studio studioTemp=new Studio();
                studioTemp.setStudio_id(rs.getString(1));
                studioTemp.setS_name(rs.getString(2));
                studioTemp.setS_address(rs.getString(3));
                studioTemp.setS_state(rs.getString(4));
                studioTemp.setS_city(rs.getString(5));
                studioTemp.setS_contact(rs.getString(6));
                studioTemp.setWorkout_avail(rs.getString(7));
                studioTemp.setAmenities(rs.getString(8));
                //studioTemp.setImage(rs.getBytes(9));
                studioTemp.setOwner_id(rs.getString(10));
                studioTemp.setS_hotlocation(rs.getString(11));
                studioTemp.setDistance_hotlocation(rs.getString(12));
                studioTemp.setCategory(rs.getString(13));
                studioList.add(studioTemp);
            }
        }catch(Exception e){e.printStackTrace();}
    return studioList;
    }
    //method to show results based on distance of 5km(Not Needed)
    public ArrayList<Studio> showResultByDistanceFive(Studio studio){
        ArrayList<Studio> studioList=new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql="select * from studiodetails where  s_hot_location=? and distance_hotlocation between 3 and ?";
        try{
            con=MyConnection.mycon();
            ps=con.prepareStatement(sql);
            ps.setString(1, studio.getS_hotlocation());
            ps.setString(2,studio.getDistance_hotlocation());
            rs=ps.executeQuery();
            while(rs.next()){
                Studio studioTemp=new Studio();
                studio.setStudio_id(rs.getString(1));
                studioTemp.setS_name(rs.getString(2));
                studioTemp.setS_address(rs.getString(3));
                studioTemp.setS_state(rs.getString(4));
                studioTemp.setS_city(rs.getString(5));
                studioTemp.setS_contact(rs.getString(6));
                studioTemp.setWorkout_avail(rs.getString(7));
                studioTemp.setAmenities(rs.getString(8));
                //studioTemp.setImage(rs.getBytes(9));
                studioTemp.setOwner_id(rs.getString(10));
                studioTemp.setS_hotlocation(rs.getString(11));
                studioTemp.setDistance_hotlocation(rs.getString(12));
                studioTemp.setCategory(rs.getString(13));
                studioList.add(studioTemp);
            }
        }catch(Exception e){e.printStackTrace();}
    return studioList;
    }
}
