/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ql_thuvien;

import DAO.J2SQL;


/**
 *
 * @author NCT
 */
public class QL_ThuVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int r =  J2SQL.Instance().ExecuteNonQuery("Insert into DocGia values(?,?)", new Object[]{"Nguyễn Công Thoại",null});
        System.out.println(" R:  "+ r);
        
    }
    
}
