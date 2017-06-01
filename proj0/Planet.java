public class Planet {

    double xxPos;
    double yyPos;
    double yyVel;
    double xxVel;
    double mass;
    String imgFileName;
    double G = 6.67 * Math.pow(10, -11);
    Planet[] allPlanets;


    public Planet(double xP, double yP, double xV,
                  double yV, double m, String img) {
        
        this.xxPos = xP;
        this.yyPos = yP;      
        this.yyVel = yV;
        this.xxVel = xV;
        this.mass = m;
        this.imgFileName = img;
    }

    
    public Planet(Planet p) {

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

   public double calcForceExertedBy(Planet p) {
       
       /*Calculates force exerted by planets on each other */

       double dis = this.calcDistance(p);
       return ((G * this.mass * p.mass) / (dis * dis));
   }

   public double calcForceExertedByX(Planet p) {
        
       /* Calculate force in X direction */

        double dx = Math.sqrt(Math.pow((p.xxPos - this.xxPos), 2));
        double F = this.calcForceExertedBy(p);
        double r = this.calcDistance(p);
        
        return (F * dx) / r;
   }
       
   public double calcForceExertedByY(Planet p) {
        
        /* Calculate force in X direction */
        
        double dy = Math.sqrt(Math.pow((p.yyPos - this.yyPos), 2));
        double F = this.calcForceExertedBy(p);
        double r = this.calcDistance(p);
        
        return (F * dy) / r;
   }

   public double  calcNetForceExertedByX(Planet[] planets){

       /* Calculate net force exerted by X */

       double Force = 0;
       for (Planet p : planets) {
           if (p == this){
               continue;
           }
           else {
               Force += calcForceExertedByX(p);
           }
       }
       return Force;

  }

   public double  calcNetForceExertedByY(Planet[] planets){

       /* Calculate net force exerted by X */

       double Force = 0;
       for (Planet p : planets) {
           if (p == this){
               continue;
           }
           else {
               Force += calcForceExertedByY(p);
           }
       }
       return Force;

  }
}











