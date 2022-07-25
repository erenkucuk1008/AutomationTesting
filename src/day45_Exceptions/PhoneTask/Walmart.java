package day45_Exceptions.PhoneTask;

public class Walmart {

    public static void main(String[] args) {

        long number = 911;
        Iphone iphone = new Iphone("13 ProMax",1299);
        Samsung samsung = new Samsung("S20",1199);
        Nokia nokia = new Nokia("3310",19);
        HuaWei huawei = new HuaWei("iSpy",300);

        iphone.call(number);
        samsung.call(number);
        nokia.call(number);
        huawei.call(number);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
        System.out.println(huawei);

        iphone.facetime(45678987);
        samsung.freeze();
        nokia.breakTheFloor();
        huawei.spy();
    }
}
