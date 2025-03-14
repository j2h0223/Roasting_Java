import java.util.ArrayList;

class NewClass {
    int newField;

    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }
}

public class AnnotationEx3 {
//    @SuppressWarnings({"deprecation", "unchecked"})
            // 이렇게 할수도 있지만 다른 코드에서 발생할 수도 있는 경고까지 억제될 수 있으므로 바람직하지 않음
            // 해당 대상에만 애너테이션을 붙여서 경고의 억제범위를 최소화해야함
    @SuppressWarnings({"deprecation"})
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;
        System.out.println(nc.getOldField());

        @SuppressWarnings("unchecked")
        ArrayList<NewClass> list = new ArrayList<>();
        list.add(nc);
    }

}