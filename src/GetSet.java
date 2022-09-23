public class GetSet {
    public String value1;
    private String value2;

    // private value2는 외부에서 접근을 제한 하였기 때문에
    // 외부에서 접속/접근 하기 위해서는 통로(메서드setValue2)를 만들어준다
    public void setValue2(String value2) {
        this.value2 = value2;
    }

    // getValue2 를 통해서 private value2 값을 return value2 해준다
    public String getValue2() {
        return value2;
    }

}
