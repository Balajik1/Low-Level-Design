public class Expression implements ArithmeticExpression{
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation op;
    public Expression(ArithmeticExpression leftExpression,ArithmeticExpression rightExpression,Operation op){
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.op=op;
    }
    @Override
    public int evaluate() {

        switch (op){
            case Operation.ADD :
                    return leftExpression.evaluate() + rightExpression.evaluate();
            case Operation.SUBSTRACT:
                    return leftExpression.evaluate() - rightExpression.evaluate();
            case Operation.MULTIPLY:
                    return leftExpression.evaluate() * rightExpression.evaluate();
            case Operation.DIVIDE:
                return leftExpression.evaluate() / rightExpression.evaluate();
        }
        return  0;

    }
}
