package com.lbenzzine.cabfares;


public class CabFares {
	
	CABTYPES ct;
	
	public CabFares(CABTYPES ct) {
        this.ct = ct;
    }
	
	double fare;
	
	public void faresAmount() {
        switch (ct) {
            case STANDARD:
                this.fare = 20.0;
                break;
                    
            case MEDIUM:
                this.fare = 50.0;
                break;
                         
            case LUXURY:
                this.fare = 100.0;
                break;
                        
            default:
                this.fare = 150.0;
                break;
        }
    }
	
	
	public Double calculateFare(CABTYPES ct, double ds) {
		
		return (ds + (ds * fare));
	}

}
