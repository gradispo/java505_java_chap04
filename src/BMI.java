public class BMI {
    public String name;
    public double height;
    public int weight;
    private double bmi;

    public double getBmi() {
        return bmi;
    }

    public void setMyInfo(double height, int weight) {
        this.height = height / 100;
        this.weight = weight;
        // calcBmi는 private 외부에서는 접근이 제한이 되기 때문에
        // setMyinfo를 통해서 BMI 내부 클래스에서 접근하여 calcBmi 값을 불러온다
        calcBmi(this.height, this.weight);
    }

    private void calcBmi(double height, int weight) {
        this.bmi = (double)weight / ((height) * height);
    }
}
