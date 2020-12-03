/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.MyConnection;
import entity.Owner;
import entity.Studio;
import entity.StudioRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yahiyamansuri
 */
public class ImageLoaderCrudOperation {
    public StudioRequest studioRequestImageLoader(StudioRequest studioRequest){
        PreparedStatement ps;
        Connection con;
        ResultSet rs;
        String sql="select image from studiorequest where request_id=?";
        try{
            con=MyConnection.mycon();
            ps=con.prepareStatement(sql);
            ps.setString(1, studioRequest.getRequest_id());
            rs=ps.executeQuery();
            rs.next();
            studioRequest.setImage(rs.getBytes(1));
        }catch(Exception e){e.printStackTrace();}
        return studioRequest;
    }
    public Studio studioImageLoader(Studio studio){
        PreparedStatement ps;
        Connection con;
        ResultSet rs;
        String sql="select images from studiodetails where studio_id=?";
        try{
            con=MyConnection.mycon();
            ps=con.prepareStatement(sql);
            ps.setString(1,studio.getStudio_id());
            rs=ps.executeQuery();
            rs.next();
            studio.setImage(rs.getBytes(1));
        }catch(Exception e){e.printStackTrace();}
        return studio;
    }
    public Owner ownerImageLoader(Owner owner){
        PreparedStatement ps;
        Connection con;
        ResultSet rs;
        String sql="select image from ownerdetails where studio_id=?";
        try{
            con=MyConnection.mycon();
            ps=con.prepareStatement(sql);
            ps.setString(1,owner.getOwner_id());
            rs=ps.executeQuery();
            rs.next();
            owner.setImage(rs.getBytes(sql));
        }catch(Exception e){e.printStackTrace();}
        return owner;
    }
}
