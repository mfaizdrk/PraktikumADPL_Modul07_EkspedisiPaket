/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul06_ekspedisipaket.layanan;

/**
 *
 * @author faizd
 */
public class LayananEkonomi implements LayananPengiriman{
    
    private static final double TARIF_PER_KG = 7000;
    private static final double BERAT_MINIMAL = 3;
    
    @Override
    public String getNama(){
        return "Ekonomi";
    }
    
    @Override
    public double hitungOngkir(double berat){
        double beratHitung = Math.max(berat, BERAT_MINIMAL);
        return beratHitung * TARIF_PER_KG;
    }
}
