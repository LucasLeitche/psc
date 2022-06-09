/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Aluno;
import DTO.Usuario;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AlunoDao {
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public AlunoDao(){
        
    }
    public boolean conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psctrabalho", "root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Retorno" + ex);
            return false;   
    }
    }
    
    public Aluno consultar (){
        try {
            Aluno aluno;
            aluno = new Aluno();
            
            st = conn.prepareStatement("select * from aluno");

            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                aluno.setNome(rs.getString("nome"));
                aluno.setRa(rs.getInt("ra"));                
                aluno.setTurma(rs.getInt("turma"));
                aluno.setCpf(rs.getString("cpf"));
                
                return aluno;
            } else{
                return null;
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Retorno" + ex);
            return null;
  
        }
    }
    public boolean salvar(Aluno aluno){
        
        try {
            String sql;
            sql = "insert into aluno (nome, ra,cpf, idade, turma)  VALUES('" + aluno.getNome() + "' ," + aluno.getRa()+ ", '"+ aluno.getCpf() + "', " + aluno.getIdade() + " , "+ aluno.getTurma() + ")";
            
            conn.createStatement().executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Retorno " + ex);
            return false;
        }
    }
}
