/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

/**
 *
 * @author DELL
 */


import java.sql.*;
import javax.swing.*;
public class code {
  
 public String str;
    public Connection con;
    public ResultSet r = null;
    
    public boolean login1( String un,String p){
        
        int n=0;
        try {
            con= DriverManager.getConnection("jdbc:ucanaccess://G://medical_system.accdb");
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery("select * from login WHERE user_id='"+un+"' and pwd='"+p+"'");
            if(rs.next()==true)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null,"an error occured");
            System.out.println(e.getMessage().toString());
            return false;
        }}
    public boolean login2(String um, String p)
    {
    
    int n=0;
        try {
            con= DriverManager.getConnection("jdbc:ucanaccess://G://medical_system.accdb");
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery("select * from admin_login WHERE user_name='"+um+"' and pwd='"+p+"'");
            if(rs.next()==true)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null,"an error occured");
            System.out.println(e.getMessage().toString());
            return false;
        }
  }
         public boolean insert1(String name, String  timing, String phone, String address, String reason)
         {
         try
         {
             int x=0;
             con= DriverManager.getConnection("jdbc:ucanaccess://G://medical_system.accdb");
             PreparedStatement st = con.prepareStatement("INSERT INTO appointment(name,timing, phone,address, reason)VALUES(?,?,?,?,?)");
             st.setString(1, name);
             st.setString(2, timing);
             st.setString(3, phone);
             st.setString(4, address);
             st.setString(5, reason);
             int rs= st.executeUpdate();
x= rs;
if(x>-0)
{
    return true;
}
else
{
    return false;
}
   }
         catch(Exception e)
         {
              JOptionPane.showMessageDialog(null, "an error has occured"+e.getMessage().toString());
        System.out.println(e.getMessage().toString());
        return false;
      }
   }
         public  boolean insert2(String medicine_id,String medicine_name, String price, String reason, String expiry_date)
         {
         try
         {int x= 0;
         
          con= DriverManager.getConnection("jdbc:ucanaccess://G://medical_system.accdb");
          PreparedStatement st = con.prepareStatement("INSERT INTO medicine(medicine_id,medicine_name,price,reason,expiry_date)VALUES(?,?,?,?,?)");
          st.setString(1, medicine_id);
          st.setString(2, medicine_name);
          st.setString(3, price);
          st.setString(4, reason);
          st.setString(5, expiry_date);
           int rs= st.executeUpdate();
           x= rs;
if(x>-0)
{
    return true;
}
else
{
    return false;
}
  }
     catch(Exception e)
         {
       
          
         JOptionPane.showMessageDialog(null, "an error has occured"+e.getMessage().toString());
        System.out.println(e.getMessage().toString());
        return false;
         
         
         }}
public ResultSet find(String s ) throws SQLException
{{
   
try{
    con=DriverManager.getConnection("jdbc:ucanaccess://G://medical_system.accdb");
   PreparedStatement p = con.prepareStatement("select * from medicine where medicine_id= ?");
   p.setString(1, s);
r= p.executeQuery();

    
}
catch(Exception e){
    
    
    System.out.println(e.getMessage().toString());
}
return r;}

}
public boolean insert3(String emp_name,String phone,String address,String user_id,String pwd)
{
    try
    {
        con=DriverManager.getConnection("jdbc:ucanaccess://G://medical_system.accdb");
        PreparedStatement st = con.prepareStatement("INSERT INTO login(emp_name,phone,address,user_id,pwd)VALUES(?,?,?,?,?)");
        st.setString(1, emp_name);
        st.setString(2,phone);
        st.setString(3,address);
        st.setString(4,user_id);
        st.setString(5,pwd);
        
          int rs= st.executeUpdate();
       int   x =0;
          
x= rs;
if(x>-0)
{
    return true;
}
else
{
    return false;
}    }
   
    catch(Exception e)
    {
         
         JOptionPane.showMessageDialog(null, "an error has occured"+e.getMessage().toString());
        System.out.println(e.getMessage().toString());
        return false;
         
          } }
public   boolean insert4(String admin_name,String phone,String address,String user_name, String pwd)
{
 try
    {
        con=DriverManager.getConnection("jdbc:ucanaccess://G://medical_system.accdb");
        PreparedStatement st = con.prepareStatement("INSERT INTO admin_login(admin_name,phone,address,user_name,pwd)VALUES(?,?,?,?,?)");
        st.setString(1, admin_name);
        st.setString(2,phone);
        st.setString(3, address);
        st.setString(4, user_name);
        st.setString(5, pwd);
        
          int rs= st.executeUpdate();
       int   x =0;
          
x= rs;
if(x>-0)
{
    return true;
}
else
{
    return false;
}    }
   
    catch(Exception e)
    {
         
         JOptionPane.showMessageDialog(null, "an error has occured"+e.getMessage().toString());
        System.out.println(e.getMessage().toString());
        return false;
         
          }


}

   }














    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

