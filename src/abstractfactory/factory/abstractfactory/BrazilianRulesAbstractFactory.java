/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.factory.abstractfactory;

import abstractfactory.model.certificate.BrazilianCertificate;
import abstractfactory.model.certificate.Certificate;
import abstractfactory.model.packing.BrazilianPacking;
import abstractfactory.model.packing.Packing;

/**
 *
 * @author NOTEBOOK-BELLE
 */
public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {
    
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
