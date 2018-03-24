package com.example.ltc_pc.myapplication;

public class user {

    private String name;
    private String email;
    private double id;
    private double mob;
    private double univ;

    public user (String name,String email,double id,double mob,double univ)
    {
        this.name= name;
        this.email=email ;
        this.id= id;
        this.mob=mob ;
        this.univ= univ;

    }

    public user ( )
    {
        this.name= "T";
        this.email="Sh" ;
        this.id= 294;
        this.mob=010 ;
        this.univ= 84;

    }



    public void setName(String name)
    {this.name=name;}

    public void setEmail(String email)
    {this.email=email;}

    public void seID(int id)
    {this.id=id;}

    public void setMob(int mob)
    {this.mob=mob;}

    public void setUniv(int univ)
    {this.univ=univ;}
//////////////////////////////
    public String getName()
    {return name;}

    public String getEmail()
    {return email;}

    public double getID()
    {return id;}

    public double getUniv()
    {return univ;}

    public double getMob()
    {return mob;}
}
