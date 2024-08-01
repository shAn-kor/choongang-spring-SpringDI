package ex02.setter;

public class MemberDAO {
    private MyDataSource myDataSource;

    public MyDataSource getMyDataSource() {
        return myDataSource;
    }

    // setter 주입
    public void setMyDataSource(MyDataSource myDataSource) {
        this.myDataSource = myDataSource;
    }
}
