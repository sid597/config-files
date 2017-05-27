



public class Planet{

    double xxPos;
    double yyPos;
    double yyVel;
    double xxVel;
    double mass;
    String imgFileName;
    
    public Planet(double xP, double yP, double xV,
                  double yV, double m, String img) {
        this.xxPos = xP;
        this.yyPos = yP;      
        this.yyVel = yV;
        this.xxVel = xV;
        this.mass = m;
        this.imgFileName = img;
    }

    
    public Planet(Planet p) 
    {
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }                                                     
   
    /* This constructor calculates distance between two Planets.*/
    
    public double  calcDistance(Planet p) {   
        
        /*  Remember to declare the return type here its double,
         *  Incase you have no return type then specify void. 
         * Cite :https://stackoverflow.com/questions/15698239/java-invalid-method-declaration-return-type-required 
         */
    
        return Math.sqrt(((p.xxPos - this.xxPos) * (p.xxPos - this.xxPos)) + ((p.yyPos - this.yyPos) *  (p.yyPos - this.yyPos)));


    }










}

