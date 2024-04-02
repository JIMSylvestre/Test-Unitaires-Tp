package fr.emse.test;

public class Money implements IMoney {
    private int fAmount;
    private String fCurrency;

    public Money(int amount, String currency) {
        fAmount = amount;
        fCurrency = currency;
    }

    public int amount() {
        return fAmount;
    }

    public String currency() {
        return fCurrency;
    }

    @Override
    public IMoney add(IMoney aMoney) {
        return aMoney.addMoney(this);
    }

    public IMoney addMoney(Money m) {
        if (m.currency().equals(currency()))
            return new Money(amount() + m.amount(), currency());
        return (IMoney) new MoneyBag(m, this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Check for same object

        if (o == null || getClass() != o.getClass()) return false; // Check for null or different class

        Money money = (Money) o; // Cast to Money

        return fAmount == money.fAmount && fCurrency.equals(money.fCurrency); // Compare amount and currency
    }

    @Override
    public IMoney addMoneyBag(MoneyBag aMoneyBag) {
        return aMoneyBag.add(this);
    }
    
    @Override
    public String toString() {
        return "[" + fAmount + " " + fCurrency + "]";
    }
}


