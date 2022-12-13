/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6fun;

/**
 *
 * @author elija
 */
public class Geek {
    //class variables
    	int iQ = 120;
    	int phyStrength = 60;
    	int powerIndex = 0;

	//constructors
    	public Geek()
    	{
    	}

    	public Geek(int iniQ, int inphyStrength)
     	{
        	iQ = iniQ;
        	phyStrength = inphyStrength;

      	}


	//properties
    	private int IQ;
    	private int PhyStrength;

        public int getPhyStrength() {
            return PhyStrength;
        }

        public void setPhyStrength(int PhyStrength) {
            this.PhyStrength = PhyStrength;
        }

        public int getiQ() {
            return iQ;
        }

        public void setiQ(int iQ) {
            this.iQ = iQ;
        }

        private int PowerIndex;


        public int getPowerIndex() {
            return powerIndex;
        }

        public void setPowerIndex(int powerIndex) {
            this.powerIndex = powerIndex;
        }

  

	//methods
    	public void CalcPowerIndex()
    	{
        	powerIndex = iQ + phyStrength;
       	 
    	}

}
