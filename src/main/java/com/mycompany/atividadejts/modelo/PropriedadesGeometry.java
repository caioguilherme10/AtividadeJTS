/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividadejts.modelo;

import com.vividsolutions.jts.geom.Geometry;

/**
 *
 * @author caio
 */
public class PropriedadesGeometry {
    
    
    public String equalsAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.equals(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String equalsBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.equals(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }

    public String disjointAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.disjoint(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String disjointBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.disjoint(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }

    public String intersectsAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.intersects(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String intersectsBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.intersects(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }

    public String touchesAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.touches(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String touchesBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.touches(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }

    public String crossesAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.crosses(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String crossesBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.crosses(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }

    public String withinAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.within(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String withinBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.within(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }

    public String containsAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.contains(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String containsBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.contains(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }

    public String overlapsAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.overlaps(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String overlapsBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.overlaps(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }

    public String coversAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.covers(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String coversBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.covers(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }

    public String coveredBYAB(Geometry geometria1, Geometry geometria2) {
        if(geometria1.coveredBy(geometria2)){
            return "V";
        }else{
            return "F";
        }
    }

    public String coveredBYBA(Geometry geometria1, Geometry geometria2) {
        if(geometria2.coveredBy(geometria1)){
            return "V";
        }else{
            return "F";
        }
    }
}
