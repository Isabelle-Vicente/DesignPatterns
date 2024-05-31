/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.factory.abstractfactory;

import abstractfactory.model.certificate.Certificate;
import abstractfactory.model.packing.Packing;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public interface CountryRulesAbstractFactory {

    Certificate getCertificates();

    Packing getPacking();
}
