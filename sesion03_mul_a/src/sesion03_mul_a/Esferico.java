package sesion03_mul_a;

public class Esferico {
	private float r, alpha, tta;

    public Esferico(float r, float alpha, float tta) {
        this.r = r;//Distancia desde el origen al punto p
        this.alpha = alpha;//Angulo entre z y el punto p � angulo del vector formado por el punto y el origen con respecto al eje z 
        this.tta = tta;//Angulo respecto X de la proyecci�n del punto sobre el plano XY
    }

    public Esferico() {

    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public float gettta() {
        return tta;
    }

    public void settta(float tta) {
        this.tta = tta;
    }
}