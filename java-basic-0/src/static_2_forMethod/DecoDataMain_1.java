package static_2_forMethod;

public class DecoDataMain_1 {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출_1");
        DecoData.staticMethodCall();
        System.out.println();

        System.out.println("2. 인스턴스 호출 _1");
        DecoData deco = new DecoData();
        deco.instanceCall();
        System.out.println();

        System.out.println("3. 인스턴스 호출 _2");
        DecoData deco2 = new DecoData();
        deco2.instanceCall();

        System.out.println();
        DecoData.staticCall(deco2);
    }
}
