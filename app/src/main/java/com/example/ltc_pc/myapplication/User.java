package com.example.ltc_pc.myapplication;

public class User {

    private String name;
    private String email;
    private double id;
    private double mob;
    private String univ;

    public User(String name, String email, double id, double mob, String univ)
    {
        this.name= name;
        this.email=email ;
        this.id= id;
        this.mob=mob ;
        this.univ= univ;

    }

    public User( )
    {
        this.name= "T";
        this.email="Sh" ;
        this.id= 294;
        this.mob=010 ;
        this.univ= "MTC";

    }



    public void setName(String name)
    {this.name=name;}

    public void setEmail(String email)
    {this.email=email;}

    public void seID(int id)
    {this.id=id;}

    public void setMob(int mob)
    {this.mob=mob;}

    public void setUniv(String univ)
    {this.univ=univ;}
//////////////////////////////
    public String getName()
    {return name;}

    public String getEmail()
    {return email;}

    public double getID()
    {return id;}

    public String getUniv()
    {return univ;}

    public double getMob()
    {return mob;}
}
