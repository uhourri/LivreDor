/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.fsdm.wisd.services;

import ma.fsdm.wisd.model.Appreciation;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author UNES
 */
interface IService {
    public boolean ajouterAppreciation(Appreciation app);
    public ArrayList<Appreciation> recupererAppreciations();
}
