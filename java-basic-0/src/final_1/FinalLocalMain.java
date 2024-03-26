package final_1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final  지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; // 컴파일 오류 Variable 'data1' might already have been assigned

        //final local variable2
        final int data2 = 10;
        // data2 = 20; // 컴파일 오류

        finalMethod(10);
    }

    static void finalMethod(final int p){
//        p = 20;
//        파라메터 받을 때만 입력됨
//        이후 메서드 종료 시 까지 변수의 값은 고정된다.
    }

}
