package prob2;

public class Money {
    private int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add( Money money ) {
        int a = this.amount + money.amount;
        return new Money(a);
    }
    public Money minus( Money money ) {
        int a = this.amount - money.amount;
        return new Money(a);
    }
    public Money multiply( Money money ) {
        int a = this.amount * money.amount;
        return new Money(a);
    }
    public Money divide( Money money ) {
        int a = this.amount / money.amount;
        return new Money(a);
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Money) {
            return this.amount == ((Money) object).amount;
        }
        else{
            return super.equals(object);
        }
    }
}
