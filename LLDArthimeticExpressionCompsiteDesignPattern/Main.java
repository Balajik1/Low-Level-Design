public class Main {

    public static void main(String[] args){
        /* to evaluate 2*(1+7)
                *
              /   \
            2       +
                  /   \
                1      7
         */

        ArithmeticExpression one=new Number(1);
        ArithmeticExpression two=new Number(2);
        ArithmeticExpression seven=new Number(7);

        ArithmeticExpression addExpression=new Expression(one,seven,Operation.ADD);
        ArithmeticExpression multiplyExpression=new Expression(two,addExpression,Operation.MULTIPLY);

        System.out.println(" Expression Evaluation Result : "+multiplyExpression.evaluate());
    }
}
