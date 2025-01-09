package chap_08;

class DefaultClass { // 접근 제한자를 명시하지 않으면 default
    void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

public class AccessModifier {
    // 필드 선언
    public String publicField = "Public Field";   // 어디서나 접근 가능
    protected String protectedField = "Protected Field"; // 같은 패키지 및 하위 클래스에서 접근 가능
    String defaultField = "Default Field";       // 같은 패키지에서만 접근 가능
    private String privateField = "Private Field"; // 같은 클래스 내에서만 접근 가능

    // 메서드 선언
    public void publicMethod() {
        System.out.println("Public Method: " + publicField);
        privateMethod(); // 같은 클래스 안에서는 private 메서드도 호출 가능
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: " + protectedField);
    }

    void defaultMethod() {
        System.out.println("Default Method: " + defaultField);
    }

    private void privateMethod() {
        System.out.println("Private Method: " + privateField);
    }

    public static void main(String[] args) {
        // 같은 클래스에서 모든 접근 제한자를 테스트
        AccessModifier example = new AccessModifier();

        // 필드 접근
        System.out.println(example.publicField);   // 접근 가능
        System.out.println(example.protectedField); // 접근 가능
        System.out.println(example.defaultField);   // 접근 가능
        // System.out.println(example.privateField); // 오류: private 필드는 외부에서 접근 불가

        // 메서드 호출
        example.publicMethod();    // 접근 가능
        example.protectedMethod(); // 접근 가능
        example.defaultMethod();   // 접근 가능
        // example.privateMethod(); // 오류: private 메서드는 외부에서 호출 불가

        // DefaultClass 테스트
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.defaultMethod(); // 같은 패키지이므로 default 메서드 호출 가능
    }
}
