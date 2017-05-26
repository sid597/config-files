public class Planet{

    double xxPos;
    double yyPos;
    double yyVel;
    double xxVel;
    double mass;
    String imgFileName;
    
    public Planet(double xP, double yP, double xV,
                  double yV, double m, String img)
    {
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
}

