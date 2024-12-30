
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros == compared.euros) {
            return this.cents < compared.cents;
        }
        return this.euros < compared.euros;
    }

    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;

        if (euros < 0) {
            euros = 0;
            cents = 0;
        }
        if (cents < 0) {
            cents += 100;
            euros--;
        }
        Money newMoney = new Money(euros, cents);
        return newMoney;
    }

}
