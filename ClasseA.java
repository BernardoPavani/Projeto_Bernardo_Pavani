public class ClasseA {
    private int A1;
    private float A2;

    public int getA1(){
        return A1;
    }

    public void setA1(int A1){
        this.A1 = A1;
    }

    public float getA2(){
        return A2;
    }

    public void setA2(float A2){
        this.A2 = A2;
    }

    public void MA1(){
        System.out.println("Metodo MA1");
    }

    public void MA2(){
        System.out.println("Metodo MA2");
    }

    public void MA3(){
        System.out.println("Metodo MA3");
    }

    public float getSoma(int a, int b){
        return a+b;
    }
}
