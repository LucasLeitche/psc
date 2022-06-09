/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Usuario;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UsuarioDao {
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public UsuarioDao(){
        
    }
    public boolean conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psctrabalho", "root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex){
            return false;   
    }
    }
    public Usuario consultar (String nome, String senha){
        try {
            Usuario usuario;
            usuario = new Usuario();
            
            st = conn.prepareStatement("select * from usuario where nome = ? and senha = ? ");
            st.setString(1,nome);
            st.setString(2,senha);

            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));                
                usuario.setTipo(rs.getString("tipo"));

                return usuario;
            } else{
                return null;
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Retorno" + ex);
            return null;
  
        }
    }
    public boolean salvar(Usuario usu){
        
        try {
            String sql;
            sql = "INSERT INTO usuario (nome, senha, cpf, tipo) VALUES('" + usu.getNome() + "' ,'" + usu.getSenha()+ "', '"+ usu.getCpf() + "', '" + usu.getTipo() + ")";
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
