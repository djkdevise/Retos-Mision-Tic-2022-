/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package actividad;

/**
 *
 * @author ContaIPUC
 */
public class CuerpoDeAgua {
    private String nombre;
    private int numeroID;
    private String municicipio;
    private Double irca;
    private String nivelRiesgo;

    public CuerpoDeAgua() {
    }
    
    

    public CuerpoDeAgua(String nombre, int numeroID, String municicipio, Double irca) {
        this.nombre = nombre;
        this.numeroID = numeroID;
        this.municicipio = municicipio;
        this.irca = irca;
        nivel(irca);
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombbre) {
        this.nombre = nombbre;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public String getMunicicipio() {
        return municicipio;
    }

    public void setMunicicipio(String municicipio) {
        this.municicipio = municicipio;
    }

    public Double getIrca() {
        return irca;
    }

    public void setIrca(Double irca) {
        this.irca = irca;
    }
    
    
    private void nivel(Double valor){
        
        
        String respuesta = "";
        
        if ((valor > 0)&(valor <= 5)) {
            respuesta = "SIN RIESGO";    
        }
        if ((valor > 5)&(valor <= 14)) {
            respuesta = "BAJO";    
        }
        if ((valor > 14)&(valor <= 35)) {
            respuesta = "MEDIO";    
        }
        if ((valor > 35)&(valor <= 80)) {
            respuesta = "ALTO";    
        }
        if ((valor > 80)&(valor <= 100)) {
            respuesta = "INVIABLE SANITARIAMENTE";    
        }
       
        this.nivelRiesgo = respuesta;
        
    } 

    @Override
    public String toString() {
        return "CuerpoDeAgua{" + "nombre=" + nombre + ", numeroID=" + numeroID + ", municicipio=" + municicipio + ", irca=" + irca + ", nivelRiesgo=" + nivelRiesgo + '}';
    }

   
}
