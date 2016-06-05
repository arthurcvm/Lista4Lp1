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
public class TV implements ControleRemoto {
    protected int canal;
    protected int volume;
    protected String marca;
    protected int polegadas;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    @Override
    public void mudarCanal(int canal) {
       
    }

    @Override
    public void aumentarVolume() throws TratarVolume{
        try{            
            if(volume >= 100){
                throw new TratarVolume("Volume máximo");
            }
            volume++;
        }catch(TratarVolume e){
            System.err.println(e.MostraMensagem());
        }
    }

    @Override
    public void diminuirVolume() throws TratarVolume{
        try{            
            if(volume <= 0){
                throw new TratarVolume("volume mínimo");
            }
            volume--;
        }catch(TratarVolume vol){
            System.err.println(vol.MostraMensagem());
        }
    }
    
}
