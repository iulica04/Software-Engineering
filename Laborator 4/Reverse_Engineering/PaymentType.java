// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 20.03.2024 19:02:57
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   PaymentType.java


final class PaymentType extends Enum
{

    public static PaymentType[] values()
    {
        return (PaymentType[])$VALUES.clone();
    }

    public static PaymentType valueOf(String s)
    {
        return (PaymentType)Enum.valueOf(PaymentType, s);
    }

    private PaymentType(String s, int i)
    {
        super(s, i);
    }

    private static PaymentType[] $values()
    {
        return (new PaymentType[] {
            Card, Cash
        });
    }

    public static final PaymentType Card = new PaymentType("Card", 0);
    public static final PaymentType Cash = new PaymentType("Cash", 1);
    private static final PaymentType $VALUES[] = $values();

}