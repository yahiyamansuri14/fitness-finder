/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.MyConnection;
import entity.Owner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utility.IdGenerator;

/**
 *
 * @author yahiya
 */
public class AdminCrudOperation {
       private Connection con;
       private PreparedStatement ps;
       private ResultSet rs;

    
    //adminLogin method
    public int adminLogin(String email,String pwd){
       try{
           String sql="select * from admin where email=? and pwd=?";
           Connection con=MyConnection.mycon();
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1,email);
           ps.setString(2,pwd);
           ResultSet rs=ps.executeQuery();
           if(rs.next())
               return 1;
           else
               return 0;
       }catch(Exception e){e.printStackTrace();} 
       return 0;
       
    }
    //end of admin login method
    //method to add owner
   public int addOwner(Owner owner) throws ClassNotFoundException, SQLException{
       IdGenerator id=new IdGenerator();
       int i=0;
       String ids=id.ownerIdGenerator();
       String sql="insert into ownerdetails values(?,?,?,?,?,?)";
       try{
           Connection con=MyConnection.mycon();
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1, owner.getOwner_id());
           ps.setString(2,owner.getO_name());
           ps.setString(3,owner.getO_email());
           ps.setString(4,owner.getO_address());
           ps.setString(5,owner.getO_contact());
           ps.setBytes(6,owner.getImage());
           i=ps.executeUpdate();
       }catch(Exception e){e.printStackTrace();}
       return i;
   }
   //method to show owner list by Id and Name(works fine)
   public ArrayList<Owner> showOwnerByIdAndName(){
        ArrayList<Owner> ownerList=new ArrayList<>();
        Connection con;
        Statement stmt;
        ResultSet rs;
        String sql="select owner_id,o_name from ownerdetails";
        try{
            con=MyConnection.mycon();
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                Owner owner=new Owner();
                owner.setOwner_id(rs.getString(1));
                owner.setO_name(rs.getString(2));
//                owner.setO_email(rs.getString(3));
//                owner.setO_address(rs.getString(4));
//                owner.setO_contact(rs.getString(5));
//                owner.setImage(rs.getBytes(sql));
                ownerList.add(owner);
            }
        }catch(Exception e){e.printStackTrace();}
        return ownerList;
   }
   //method to show singl owner details by Id
   public Owner showOwnerDetailById(Owner owner){
//       Connection con;
//       PreparedStatement ps;
//       ResultSet rs;
//        String sql="select * from ownerdetails where owner_id=? and o_name=?";
          String sql="select * from ownerdetails where owner_id=?";
        try{
            con=MyConnection.mycon();
            ps=con.prepareStatement(sql);
            ps.setString(1, owner.getOwner_id());
            //ps.setString(2,owner.getO_name());
            rs=ps.executeQuery();
            while(rs.next()){
                owner.setOwner_id(rs.getString(1));
                owner.setO_name(rs.getString(2));
                owner.setO_email(rs.getString(3));
                owner.setO_address(rs.getString(4));
                owner.setO_contact(rs.getString(5));
                owner.setImage(rs.getBytes(sql));
            }
        }catch(Exception e){e.printStackTrace();}
        return owner;
   }
   //delete owner
   public int removeOwner(Owner owner){
       int i=0;
       String sql="delete from ownerdetails where owner_id=?";
       try{
        con=MyConnection.mycon();
        ps=con.prepareStatement(sql);
        ps.setString(1,owner.getOwner_id());
        i=ps.executeUpdate();
       }catch(Exception e){e.printStackTrace();}
       return i;
   }
   
}
