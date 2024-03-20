// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 20.03.2024 19:01:09
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   CarType.java


final class CarType extends Enum
{

    public static CarType[] values()
    {
        return (CarType[])$VALUES.clone();
    }

    public static CarType valueOf(String s)
    {
        return (CarType)Enum.valueOf(CarType, s);
    }

    private CarType(String s, int i)
    {
        super(s, i);
    }

    private static CarType[] $values()
    {
        return (new CarType[] {
            Bolt, Comfort, Economy, WomenForWomen, Pet, Green
        });
    }

    public static final CarType Bolt = new CarType("Bolt", 0);
    public static final CarType Comfort = new CarType("Comfort", 1);
    public static final CarType Economy = new CarType("Economy", 2);
    public static final CarType WomenForWomen = new CarType("WomenForWomen", 3);
    public static final CarType Pet = new CarType("Pet", 4);
    public static final CarType Green = new CarType("Green", 5);
    private static final CarType $VALUES[] = $values();

}