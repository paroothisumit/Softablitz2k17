package OutputQuestions;

// Chocolate Question :P

public class Question1 {
    public void add(int a, int b){
        int sum = a + b;
        System.out.println("Integer sum is "+sum);
    }
    
    public void add(double a, double b){
        double sum = a + b;
        System.out.println("Double sum is "+sum);
    }
    
    public static void main(String args[]){
        Question1 q1 = new Question1();
        q1.add(1, 3.5);
    }
}
