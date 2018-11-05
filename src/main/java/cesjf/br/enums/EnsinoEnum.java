/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.enums;

public enum EnsinoEnum {
    FundamentalI("Fundamental I"),
    Fundamental("Fundamental"),
    Medio("Médio");
    
    private final String descricao;
    
    EnsinoEnum(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }      
    
    public static String[] enumsToStringArray() {
        String[] results = new String[EnsinoEnum.values().length];
        int count = 0;
        for (EnsinoEnum e: EnsinoEnum.values()) {
            results[count] = e.getDescricao();
            count++;
        }
        return results;
    }    
}
