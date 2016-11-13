package gfx.tick1;

public class Sphere {

    private final double SPHERE_KD = 0.8;
    private final double SPHERE_KS = 0.8;
    private final double SPHERE_N = 10;

    // The diffuse color of the sphere
    private Vector3 colour;

    // The world-space position of the sphere
    private Vector3 position;

    // The radius of the sphere in world units
    private double radius;

    // Coefficients for calculating Phong illumination
    private double phong_kD, phong_kS, phong_n;

    public Sphere(Vector3 position, double radius, Vector3 colour) {
        this.position = position;
        this.radius = radius;
        this.colour = colour;

        this.phong_kD = SPHERE_KD;
        this.phong_kS = SPHERE_KS;
        this.phong_n = SPHERE_N;
    }

    public RaycastHit intersectionWith(Ray ray) {

        Vector3 O = ray.getOrigin();
        Vector3 D = ray.getDirection();
        Vector3 C = position;
        double r = radius;

        double a = D.dot(D);
        double b = 2 * D.dot(O.subtract(C));
        double c = (O.subtract(C)).dot(O.subtract(C)) - Math.pow(r,2);
        
        // TODO: Determine if ray and sphere intersect
        // TODO: Work out point of intersection
        // TODO: Return a RaycastHit that includes the object, ray distance, point, and normal vector
        return new RaycastHit();
    }

    public Vector3 getNormalAt(Vector3 position) {
        return position.subtract(this.position).normalised();
    }

    public Vector3 getColour() {return colour;}
    public double getPhong_kD() {return phong_kD;}
    public double getPhong_kS() {return phong_kS;}
    public double getPhong_n() {return phong_n;}
}