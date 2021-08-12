package sesion03_mul_a;

public class Cilindrico {
	private float r, tta, z;

    public Cilindrico(float r, float tta, float z) {
        this.r = r;//Radio de la base 
        this.tta = tta;//Angulo respecto X de la proyección del punto sobre el plano XY
        this.z = z;//Valor de la coordenada Z
    }

    public Cilindrico() {

    }

    public Cilindrico esferica_cilindrica(float r, float alpha, float tta) {

        float r1 = (float) (r * Math.sin(alpha));
        float z = (float) (r * Math.cos(alpha));

        return new Cilindrico(r1, tta, z);
    }

    public Cilindrico esferica_cilindrica(Esferico e) {

        return esferica_cilindrica(e.getR(), e.getAlpha(), e.gettta());
    }

    public Esferico clindrica_esferica(float r, float tta, float z) {

        float r1 = (float) Math.sqrt((Math.pow(r, 2)) + Math.pow(z, 2));
        float alpha = (float) Math.atan(r / z);

        return new Esferico(r1, alpha, tta);

    }

    public Esferico cilindrica_esferica(Cilindrico c) {

        return clindrica_esferica(c.getR(), c.gettta(), c.getZ());
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float gettta() {
        return tta;
    }

    public void settta(float tta) {
        this.tta = tta;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
