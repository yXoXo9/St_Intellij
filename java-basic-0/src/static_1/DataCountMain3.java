package static_1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 a = new Data3("A");
        System.out.println("a = " + Data3.count); // static count
        /* 클래스에 직접 접근하는 것과 같음 Data3.count*/

        Data3 data3 = new Data3("B");
        System.out.println("data3 = " + Data3.count);

        Data3 data31 = new Data3("C");
        System.out.println("Data3.count = " + Data3.count);


        /*
        * Static 변수는
        * 메서드 영역에서 관리한다.
        * 힙 영역은 객체의 참조대상이 없는경우 GC 대상.
        * 즉, Data3의 인스턴스는 힙 영역에 존재하지만,
        * static int count 는 (정적 변수)는 메서드 영역에서 관리한다.
        *
        *
        * */
    }
}
