/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.modul06_ekspedisipaket.repository;

import com.mycompany.modul06_ekspedisipaket.model.Pengiriman;
import java.util.List;

/**
 *
 * @author faizd
 */
public interface RiwayatRepository {
    
    void simpan(Pengiriman pengiriman);
    List<Pengiriman> ambilSemua();
}
