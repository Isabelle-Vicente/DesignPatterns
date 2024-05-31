/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.factory.abstractfactory;

import abstractfactory.model.certificate.Certificate;
import abstractfactory.model.certificate.USACertificate;
import abstractfactory.model.packing.Packing;
import abstractfactory.model.packing.USAPacking;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class USARulesAbstractFactory implements CountryRulesAbstractFactory {

    public Certificate getCertificates() {
        return new USACertificate();
    }

    public Packing getPacking() {
        return new USAPacking();
    }
}
