/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vitau
 */
public class Candidato {

    int codigo;
    String nomeCandidato, nomeImagem, nomePartido;
    
    public void setCodigo(int codigo){
    this.codigo = codigo;
    }
    
    public void setNomeCandidato(String nomeCandidato){
    this.nomeCandidato = nomeCandidato;
    }
    
    public void setNomeImagem(String nomeImagem){
    this.nomeImagem = nomeImagem;
    }
   
    public void setPartido(String nomePartido){
    this.nomePartido = nomePartido;
    }
    
    public int getCodigo(){
    return this.codigo;
    }
    
    public String getNomeCandidato(){
    return this.nomeCandidato;
    }
    
    public String getNomeImagem(){
    return this.nomeImagem;
    }
    
    public String getPartido(){
    return this.nomePartido;
    }
}
