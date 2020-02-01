package com.company;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;

public class Rukxak  {
 private ArrayList<Krug> krugs =new ArrayList<>() ;
 private ArrayList<Cilindr> cilindrs =new ArrayList<>() ;
 private ArrayList<PLoskoe> pLoskoes =new ArrayList<>();
    public Rukxak(ArrayList<Krug> krugs, ArrayList<Cilindr> cilindrs, ArrayList<PLoskoe> pLoskoes) {
        this.krugs = krugs;
        this.cilindrs = cilindrs;
        this.pLoskoes = pLoskoes;
    }

    public Rukxak(){

    }
    public void setKrugs(ArrayList<Krug> krugs) {
        this.krugs = krugs;
    }

    public void setCilindrs(ArrayList<Cilindr> cilindrs) {
        this.cilindrs = cilindrs;
    }

    public void setpLoskoes(ArrayList<PLoskoe> pLoskoes) {
        this.pLoskoes = pLoskoes;
    }
    public void AddRux(Object o ){
        if(o instanceof Kruglye){
            krugs.add((Krug)o);
        }else if (o instanceof  Ciliindr){
            cilindrs.add((Cilindr)o);
        }else if(o instanceof Ploskie){
            pLoskoes.add((Ploskie)o);
        }
    }
}
