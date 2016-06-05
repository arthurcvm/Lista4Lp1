/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author arthurcvm
 */
public class TratarVolume extends Exception {
    protected String mensagem;
    
    public TratarVolume(String mensagem){
        this.mensagem = mensagem;
    }
    
    public String MostraMensagem(){
        return mensagem;
    }    
}
