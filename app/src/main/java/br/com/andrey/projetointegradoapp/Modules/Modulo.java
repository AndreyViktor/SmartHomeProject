package br.com.andrey.projetointegradoapp.Modules;

import java.io.Serializable;

/**
 * Created by andrey on 04/08/2016.
 */
public class Modulo implements Serializable {
    private long id;
    private String nome;
    private String ModuleIpAdress;
    private String modulo;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }



    public String getModuleIpAdress() {
        return ModuleIpAdress;
    }

    public void setModuleIpAdress(String moduleIpAdress) {
        ModuleIpAdress = moduleIpAdress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
