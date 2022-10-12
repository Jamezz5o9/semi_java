package FEMI;

public class ComplexNumber {
    private float realNum;
    private float imagNum;

    public ComplexNumber(){
        this(0.0F, 0.0F);
    }

    public ComplexNumber(float realNum, float imagNum){
            this.realNum = realNum;
            this.imagNum = imagNum;
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b){
        ComplexNumber first = new ComplexNumber(0.0F, 0.0F);
        first.realNum = a.realNum + b.realNum;
        first.imagNum = a.imagNum + b.imagNum;
        return first;
    }

    public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b){
        ComplexNumber second = new ComplexNumber(0.0F, 0.0F);
        second.realNum = a.realNum - b.imagNum;
        second.imagNum = a.imagNum - b.imagNum;
        return second;
    }

    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(79F, 60F);
        ComplexNumber second = new ComplexNumber(50F, 50F);
        ComplexNumber resultAdd = add(first, second);
        ComplexNumber resultSubtract = subtract(first, second);
        System.out.printf("%.2f + %.2fi%n", resultAdd.realNum, resultAdd.imagNum);
        System.out.printf("%.2f + %.2fi%n", resultSubtract.realNum, resultSubtract.imagNum);
    }
}
