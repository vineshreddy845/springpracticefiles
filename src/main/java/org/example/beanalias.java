package org.example;

import org.springframework.beans.factory.annotation.Value;

public class beanalias {

    @Value("260")
    private int healthid;

    @Override
    public String toString() { // when we print object of class. below code will be called or excuted.
        return "beanalias{" +   // see in confi class we printed beanalias object.
                "healthid=" + healthid +
                ", hosp='" + hosp + '\'' +
                '}';
    }
    @Value("nice")
    private String hosp;

   /* public void setHealthid(int healthid)
    {
        this.healthid = healthid;
    }

    public int setHealthid()
    {
        return healthid;
    }

    public void setHosp(String hosp)
    {
        this.hosp = hosp;
    }

    public String getHosp()
    {
        return hosp;
    }*/
    public void hhh()
    {
        System.out.println("hosp"+hosp+"healthid"+healthid);
    }


}
