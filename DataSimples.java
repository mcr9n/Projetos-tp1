
package dataSimples;

public class DataSimples {
    private byte dia,mes;
    private short ano;
    public DataSimples(byte dia, byte mes, short ano){
        if(validarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            
        
        }else{
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        
        }
    }
    private boolean validarData(byte dia, byte mes, short ano){
        return dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12;
    }
    public boolean compararData(DataSimples outraDataSimples){
        return this.dia == outraDataSimples.dia &&
                this.mes == outraDataSimples.mes &&
                this.ano == outraDataSimples.ano;
    
    }
    public byte getDia(){
        return dia;
    }
    public byte getMes(){
        return mes;
    }
    public short getAno(){
        return ano;
    }
    public String toString(){
        String data = "";
        data = data + dia + "/" + mes + "/" + ano;
        return data;
    }
}
